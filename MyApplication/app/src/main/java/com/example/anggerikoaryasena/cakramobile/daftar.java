package com.example.anggerikoaryasena.cakramobile;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

/**
 * Created by Anggeriko Aryasena on 11/17/2015.
 */
public class daftar extends AppCompatActivity {
    private DatePicker datePicker;
    private Calendar calendar;
    private TextView tanggal;
    private int year, month, day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftar);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        Typeface tipe = Typeface.createFromAsset(getAssets(), "fonts/comicbookfun.ttf" );

        TextView judul = (TextView) findViewById(R.id.judul);
        judul.setText("TULISKAN IDENTITAS");
        judul.setTextSize(26);
        judul.setTypeface(tipe);
        judul.setTextColor(Color.parseColor("#FFFFFF"));

        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DATE);
        tanggal = (TextView)findViewById(R.id.tgl);
        showdate(year,month,day);
    }

    private void showdate(int year, int month, int day) {
        tanggal.setText(new StringBuilder().append(year).append("/").append(month).append("/").append(day));
    }

    @SuppressWarnings("deprecation")
    public void setDate(View view) {
        showDialog(999);
        Toast.makeText(getApplicationContext(), "ca", Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        // TODO Auto-generated method stub
        if (id == 999) {
            return new DatePickerDialog(this, myDateListener, year, month, day);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener myDateListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker arg0, int arg1, int arg2, int arg3) {
            // TODO Auto-generated method stub
            // arg1 = year
            // arg2 = month
            // arg3 = day
            showdate(arg1, arg2+1, arg3);
        }
    };


   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/
}
