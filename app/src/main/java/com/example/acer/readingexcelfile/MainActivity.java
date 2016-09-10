package com.example.acer.readingexcelfile;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;

public class MainActivity extends AppCompatActivity {

    String slovo;
    String slovo1;
    String slovo2;
    String slovo3;
    String vysledek;
    TextView x;
    private static final String TAG = "radek";
    private static final String TAG1 = "sloupec";
    private static final String TAG2 = "sloupecIN0";
    private static final String TAG3 = "sloupecIN1";
    private static final String TAG4 = "sloupecIN2";
    private static final String TAG5 = "slovo";
    private static final String TAG6 = "slovo1";
    private static final String TAG7 = "slovo2";
    private static final String TAG8 = "slovo3";
    private static final String TAG9 = "xx";
    private static final String TAG10 = "xx2";
    private static final String TAG11 = "xx3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
         x=(TextView) findViewById(R.id.textView);

    }

    public void order(View v) {
        Toast.makeText(this, "Seznam ma 1272 slov", Toast.LENGTH_LONG).show();
        try {

            AssetManager am=getAssets();// If this line gives you ERROR then try AssetManager am=getActivity().getAssets();
            WorkbookSettings ws = new WorkbookSettings();
            ws.setEncoding("Cp1252");
            InputStream is=am.open("slovnik.xls");
            Workbook wb =Workbook.getWorkbook(is,ws);
            Sheet s=wb.getSheet(0);
            int row =s.getRows();
            int col=s.getColumns();
            String xx="";


            for(int i=0;i<row;i++)
            {
               // Log.v(TAG, Integer.toString(i));
                for (int c=0;c<col;c++) {
                    Cell z = s.getCell(c, i);
                  //  Log.v(TAG1, Integer.toString(c));

                    //xx=xx+z.getContents()+"  ";
                    // xx=xx+ String.format("%-20s", z.getContents() );
                    if (c == 0) {
                       // Log.v(TAG2, "jsem IN sloupec 0");
                     slovo = String.format("%-6s", z.getContents());
                      //  Log.v(TAG5, slovo);
                    }
                    if (c == 1) {
                       // Log.v(TAG3, "jsem IN sloupec 1");
                        slovo1 = String.format("%-35s", z.getContents());
                       // Log.v(TAG6, slovo1);
                    }
                    if (c == 2) {
                       // Log.v(TAG4, "jsem IN sloupec 2");
                        slovo2 = String.format("%-21s", z.getContents());
                       // Log.v(TAG7, slovo2);
                    }

                    xx=slovo+slovo1+slovo2;
                  //  Log.v(TAG9, xx);
                }

                    xx=xx+"\n";
                vysledek=vysledek+xx;
               // Log.v(TAG10, xx);
               // x.setText(xx);
                //display(xx);

            }
            //Log.v(TAG11, xx);
             // display(vysledek);
            x.setText(vysledek);

        }

        catch (Exception e)
        {

        }

    }

    public void order2(View v) {
        Toast.makeText(this, "Seznam ma 5856 slov", Toast.LENGTH_LONG).show();
        try {

            AssetManager am=getAssets();// If this line gives you ERROR then try AssetManager am=getActivity().getAssets();
            WorkbookSettings ws = new WorkbookSettings();
            ws.setEncoding("Cp1252");
            InputStream is=am.open("slovnik.xls");
            Workbook wb =Workbook.getWorkbook(is,ws);
            Sheet s=wb.getSheet(1);
            int row =s.getRows();
            int col=s.getColumns();
            String xx="";


            for(int i=0;i<row;i++)
            {
                // Log.v(TAG, Integer.toString(i));
                for (int c=0;c<col;c++) {
                    Cell z = s.getCell(c, i);
                    //  Log.v(TAG1, Integer.toString(c));

                    //xx=xx+z.getContents()+"  ";
                    // xx=xx+ String.format("%-20s", z.getContents() );
                    if (c == 0) {
                        // Log.v(TAG2, "jsem IN sloupec 0");
                        slovo = String.format("%-6s", z.getContents());
                        //  Log.v(TAG5, slovo);
                    }
                    if (c == 1) {
                        // Log.v(TAG3, "jsem IN sloupec 1");
                        slovo1 = String.format("%-35s", z.getContents());
                        // Log.v(TAG6, slovo1);
                    }
                    if (c == 2) {
                        // Log.v(TAG4, "jsem IN sloupec 2");
                        slovo2 = String.format("%-21s", z.getContents());
                        // Log.v(TAG7, slovo2);
                    }

                    xx=slovo+slovo1+slovo2;
                    //  Log.v(TAG9, xx);
                }

                xx=xx+"\n";
                vysledek=vysledek+xx;
               // Log.v(TAG10, xx);
                // x.setText(xx);
                //display(xx);

            }
            //Log.v(TAG11, xx);
            // display(vysledek);
            x.setText(vysledek);

        }

        catch (Exception e)
        {

        }

    }

    public void order3(View v) {
        Toast.makeText(this, "Seznam ma 10783 slov", Toast.LENGTH_LONG).show();
        try {

            AssetManager am=getAssets();// If this line gives you ERROR then try AssetManager am=getActivity().getAssets();
            WorkbookSettings ws = new WorkbookSettings();
            ws.setEncoding("Cp1252");
            InputStream is=am.open("slovnik.xls");
            Workbook wb =Workbook.getWorkbook(is,ws);
            Sheet s=wb.getSheet(2);
            int row =s.getRows();
            int col=s.getColumns();
            String xx="";


            for(int i=0;i<row;i++)
            {
                // Log.v(TAG, Integer.toString(i));
                for (int c=0;c<col;c++) {
                    Cell z = s.getCell(c, i);
                    //  Log.v(TAG1, Integer.toString(c));

                    //xx=xx+z.getContents()+"  ";
                    // xx=xx+ String.format("%-20s", z.getContents() );
                    if (c == 0) {
                        // Log.v(TAG2, "jsem IN sloupec 0");
                        slovo = String.format("%-6s", z.getContents());
                        //  Log.v(TAG5, slovo);
                    }
                    if (c == 1) {
                        // Log.v(TAG3, "jsem IN sloupec 1");
                        slovo1 = String.format("%-35s", z.getContents());
                        // Log.v(TAG6, slovo1);
                    }
                    if (c == 2) {
                        // Log.v(TAG4, "jsem IN sloupec 2");
                        slovo2 = String.format("%-21s", z.getContents());
                        // Log.v(TAG7, slovo2);
                    }

                    xx=slovo+slovo1+slovo2;
                    //  Log.v(TAG9, xx);
                }

                xx=xx+"\n";
                vysledek=vysledek+xx;
                //Log.v(TAG10, xx);
                // x.setText(xx);
                //display(xx);

            }
            //Log.v(TAG11, xx);
            // display(vysledek);
            x.setText(vysledek);

        }

        catch (Exception e)
        {

        }

    }

    public void display(String value)
    {
        TextView x=(TextView) findViewById(R.id.textView);
        x.setText(value);

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

