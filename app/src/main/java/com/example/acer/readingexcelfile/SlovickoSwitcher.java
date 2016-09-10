package com.example.acer.readingexcelfile;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;




    public class SlovickoSwitcher extends AppCompatActivity {
        Animation animationOutRight;
        Animation animationInLeft;
        Animation  animationInRight;
        Animation  animationOutLeft;
        TextSwitcher textSwitcher;
        Button nextButton;
        Button backButton;

        String textSwitcherText[] = {"Buch"+"\n"+ "Kniha", "Tisch"+"\n"+ "Stul", "Katze"+"\n"+ "Kocka"};

        int switcherText = textSwitcherText.length;

        int counter = -1;

        float x1,x2;
        float y1, y2;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_slovickoswitcher);

            textSwitcher = (TextSwitcher) findViewById(R.id.textSwitcher);

            nextButton = (Button) findViewById(R.id.nextButton);
            backButton = (Button) findViewById(R.id.backButton);


            textSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
                @Override
                public View makeView() {
                    TextView switcherTextView = new TextView(getApplicationContext());
                    switcherTextView.setTextSize(24);
                    switcherTextView.setTextColor(Color.RED);
                    switcherTextView.setText("Zmackni tlacitko dole");
                    switcherTextView.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL);
                   // switcherTextView.setShadowLayer(6, 6, 6, Color.BLACK);
                    return switcherTextView;
                }
            });

          // animationOutRight = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
          // animationInLeft = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
            animationOutRight = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_out_right);
            animationInLeft = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_in_left);
            animationInRight = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_in_right);
            animationOutLeft = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_out_left);


           //textSwitcher.setOutAnimation(animationOutRight);
           //textSwitcher.setInAnimation(animationInLeft);

        }

        public void nextButton(View view) {
            textSwitcher.setOutAnimation(animationOutRight);
            textSwitcher.setInAnimation(animationInLeft);
            counter++;
            Log.d("switchertext", String.valueOf(switcherText));
            Log.d("Next", String.valueOf(counter));
            if (counter == switcherText)
                counter = 0;
            textSwitcher.setText(textSwitcherText[counter]);
            Log.d("Pole", String.valueOf(counter));
        }

        public void backButton(View view) {

            textSwitcher.setOutAnimation(animationOutLeft);
            textSwitcher.setInAnimation(animationInRight);
            counter--;
            Log.d("Back", String.valueOf(counter));
            Log.d("switchertext", String.valueOf(switcherText));
            if (counter == -1)
                counter = switcherText-1;
            Log.d("Back", String.valueOf(counter));
            textSwitcher.setText(textSwitcherText[counter]);
            Log.d("Pole2", String.valueOf(counter));
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.seznam_menu:
                    Intent intentseznam = new Intent(this, MainActivity.class);
                    startActivity(intentseznam);
                    //Toast.makeText(this, "Vybran seznam", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.prezkusovak_menu:
                    Intent intentprezkusovak = new Intent(this, Prezkusovak.class);
                    startActivity(intentprezkusovak);
                    //Toast.makeText(this, "Vybran prezkusovak", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.test_menu:
                    Intent intenttest = new Intent(this, Tester.class);
                    startActivity(intenttest);
                    //Toast.makeText(this, "Vybran test", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.slovickoswitcher_menu:
                    Intent intentslovickoswitcher = new Intent(this, SlovickoSwitcher.class);
                    startActivity(intentslovickoswitcher);
                    //Toast.makeText(this, "Vybran test", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.swiper_menu:
                    Intent intentswiper = new Intent(this, Swiper.class);
                    startActivity(intentswiper);
                    //Toast.makeText(this, "Vybran test", Toast.LENGTH_SHORT).show();
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
        }

        // Method to handle touch event like left to right swap and right to left swap
        public boolean onTouchEvent(MotionEvent touchevent)
        {
            switch (touchevent.getAction())
            {
                // when user first touches the screen we get x and y coordinate
                case MotionEvent.ACTION_DOWN:
                {
                    x1 = touchevent.getX();
                    y1 = touchevent.getY();
                    break;
                }
                case MotionEvent.ACTION_UP:
                {
                    x2 = touchevent.getX();
                    y2 = touchevent.getY();

                    //if left to right sweep event on screen
                    if (x1 < x2)
                    {
                        textSwitcher.setOutAnimation(animationOutRight);
                        textSwitcher.setInAnimation(animationInLeft);
                        counter++;
                        Log.d("switchertext", String.valueOf(switcherText));
                        Log.d("Next", String.valueOf(counter));
                        if (counter == switcherText)
                            counter = 0;
                        textSwitcher.setText(textSwitcherText[counter]);
                        Log.d("Pole", String.valueOf(counter));
                       // Toast.makeText(this, "Left to Right Swap Performed", Toast.LENGTH_LONG).show();
                    }

                    // if right to left sweep event on screen
                    if (x1 > x2)
                    {
                        textSwitcher.setOutAnimation(animationOutLeft);
                        textSwitcher.setInAnimation(animationInRight);
                        counter--;
                        Log.d("Back", String.valueOf(counter));
                        Log.d("switchertext", String.valueOf(switcherText));
                        if (counter == -1)
                            counter = switcherText-1;
                        Log.d("Back", String.valueOf(counter));
                        textSwitcher.setText(textSwitcherText[counter]);
                        Log.d("Pole2", String.valueOf(counter));
                        //Toast.makeText(this, "Right to Left Swap Performed", Toast.LENGTH_LONG).show();
                    }


                    break;
                }
            }
            return false;
        }

    }