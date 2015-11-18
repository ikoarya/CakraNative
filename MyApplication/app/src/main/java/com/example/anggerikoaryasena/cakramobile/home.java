package com.example.anggerikoaryasena.cakramobile;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Anggeriko Aryasena on 11/18/2015.
 */
public class home extends AppCompatActivity {
    public TextView judul1, judul2, infoteks,evalteks,terapiteks,laporanteks, catatanteks;
    public Typeface tipe;
    public Button kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        tipe = Typeface.createFromAsset(getAssets(), "fonts/comicbookfun.ttf" );

        judul1 = (TextView)findViewById(R.id.halo);
        judul2 = (TextView)findViewById(R.id.nama);
        infoteks = (TextView)findViewById(R.id.infoteks);
        evalteks = (TextView)findViewById(R.id.evalteks);
        terapiteks = (TextView)findViewById(R.id.terapiteks);
        laporanteks = (TextView)findViewById(R.id.laporanteks);
        catatanteks = (TextView)findViewById(R.id.catatanteks);
        editText();
        kembali = (Button)findViewById(R.id.backbut);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, MainScreen.class);
                startActivity(intent);
            }
        });

    }

    private void editText() {
        judul1.setTextSize(75);
        judul1.setTypeface(tipe);
        judul1.setTextColor(Color.parseColor("#FFFFFF"));

        judul2.setTextSize(50);
        judul2.setText("Budi");
        judul2.setTypeface(tipe);
        judul2.setTextColor(Color.parseColor("#FFFFFF"));

        infoteks.setTypeface(tipe);
        infoteks.setTextColor(Color.parseColor("#FFFFFF"));

        evalteks.setTypeface(tipe);
        evalteks.setTextColor(Color.parseColor("#FFFFFF"));

        terapiteks.setTypeface(tipe);
        terapiteks.setTextColor(Color.parseColor("#FFFFFF"));

        laporanteks.setTypeface(tipe);
        laporanteks.setTextColor(Color.parseColor("#FFFFFF"));

        catatanteks.setTypeface(tipe);
        catatanteks.setTextColor(Color.parseColor("#FFFFFF"));


    }



}
