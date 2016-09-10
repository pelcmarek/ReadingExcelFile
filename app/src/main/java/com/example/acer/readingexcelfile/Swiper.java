package com.example.acer.readingexcelfile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Swiper extends AppCompatActivity
{  EditText policko1;
    EditText policko2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiper);
        policko1 = (EditText) findViewById(R.id.editText3);
        policko2 = (EditText) findViewById(R.id.editText4);
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

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_A1:
                if (checked)
                    // Pirates are the best
                    Toast.makeText(this, "Vybrano A1", Toast.LENGTH_SHORT).show();
                    break;
            case R.id.radio_B1:
                if (checked)
                    // Ninjas rule
                    Toast.makeText(this, "Vybrano B1", Toast.LENGTH_SHORT).show();
                    break;
            case R.id.radio_C1:
                if (checked)
                    // Pirates are the best
                    Toast.makeText(this, "Vybrano C1", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void onEditTextClicked(View view) {
        String str_value = policko1.getText().toString();
        String str_value2 = policko2.getText().toString();
if (str_value.equals("")){
    str_value="1";}
        Toast.makeText(this,str_value , Toast.LENGTH_SHORT).show();
        Toast.makeText(this, str_value2, Toast.LENGTH_SHORT).show();
        policko1.clearFocus();
        policko2.clearFocus();
    }
    }





