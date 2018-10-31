package com.example.user.optionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   // public  boolean onCreateOptionMenu(Menu menu)

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.hai,menu);


        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int d=item.getItemId();
         if(d==R.id.action_settings){
             Toast.makeText(MainActivity.this,"action setting", Toast.LENGTH_SHORT).show();
         }
        else if(d==R.id.walpaper)
         {
             Toast.makeText(MainActivity.this,"Wallpaper",Toast.LENGTH_SHORT).show();
         }
         else if(d==R.id.theme){
             Toast.makeText(MainActivity.this,"theme",Toast.LENGTH_SHORT).show();
         }
        return super.onOptionsItemSelected(item);
    }
}
