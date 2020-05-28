package com.c.projecttugas3;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Bangun Datar");
    }

    public void setTitle(String title){
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView tv=new TextView(this);
        tv.setText(title);
        tv.setTextSize(20);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tv.setGravity(Gravity.CENTER);
        tv.setTextColor(getResources().getColor(R.color.colorWhite));
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(tv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.action_name){
            startActivity(new Intent(MainActivity.this, about.class ));
        }
        return super.onOptionsItemSelected(item);
    }

    public void ClikKetupat(View view) {
        Intent i = new Intent(MainActivity.this, proses.class);
        i.putExtra("Bangun Datar", "Ketupat");
        startActivity(i);
    }

    public void ClikLayang(View view) {
        Intent i = new Intent(MainActivity.this, proses.class);
        i.putExtra("Bangun Datar", "Layang");
        startActivity(i);
    }

    public void KlikPesium(View view) {
        Intent i = new Intent(MainActivity.this, proses.class);
        i.putExtra("Bangun Datar", "Pesium");
        startActivity(i);
    }

    public void ClikTiga(View view) {
        Intent i = new Intent(MainActivity.this, proses.class);
        i.putExtra("Bangun Datar", "Tiga");
        startActivity(i);
    }
}
