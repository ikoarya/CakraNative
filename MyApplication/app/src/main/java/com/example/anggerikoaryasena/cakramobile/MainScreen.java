package com.example.anggerikoaryasena.cakramobile;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;


public class MainScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        Typeface tipe = Typeface.createFromAsset(getAssets(), "fonts/comicbookfun.ttf" );

        Button entrybutton = (Button) findViewById(R.id.masukbut);
        entrybutton.setText("Masuk");
        entrybutton.setTextSize(24);
        entrybutton.setTypeface(tipe);
        entrybutton.setTextColor(Color.parseColor("#FFFFFF"));

        Button daftarbutton = (Button) findViewById(R.id.daftarbut);
        daftarbutton.setText("Daftar");
        daftarbutton.setTextSize(24);
        daftarbutton.setTypeface(tipe);
        daftarbutton.setTextColor(Color.parseColor("#FFFFFF"));


    }
}
