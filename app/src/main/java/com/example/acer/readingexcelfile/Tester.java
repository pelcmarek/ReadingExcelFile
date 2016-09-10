package com.example.acer.readingexcelfile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class Tester extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tester);
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
}
