package com.example.anggerikoaryasena.cakramobile;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;

import static com.example.anggerikoaryasena.cakramobile.R.drawable.otherb;


public class MainScreen extends AppCompatActivity {
    public Button entrybutton,daftarbutton, other, opsion, tes, tes2;
    public Typeface tipe;
    public int status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);
        //Untuk mengeset menjadi landscape orientation
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        //Untuk mengubah tipe
        tipe = Typeface.createFromAsset(getAssets(), "fonts/comicbookfun.ttf" );

        //deklarasi variabel button dan fungsi untuk mengubah ke activity selanjutnya.
        entrybutton = (Button) findViewById(R.id.masukbut);
        daftarbutton = (Button) findViewById(R.id.daftarbut);
        other = (Button) findViewById(R.id.other);
        opsion = (Button) findViewById(R.id.opsion);
        tes = (Button) findViewById(R.id.tes);
        tes2 = (Button) findViewById(R.id.tes2);
        status = 0;
        other.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Log.d("Hai", "Tes klik");
                if(status == 0){
                    muncul();
                    status = 1;
                }
                else{
                    hilang();
                    status = 0;
                }



            }
        });
        entrybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainScreen.this, login.class);
                startActivity(intent1);
            }
        });
        daftarbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, daftar.class);
                startActivity(intent);
            }
        });

        //Untuk mengganti tipe teks
        editText();
    }

    private void hilang() {
        new Thread() {
            public void run() {
                    try {
                        Log.d("Hilang", "Masuk Try");
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                Log.d("Hilang", "Masuk Hilang");
                                Animation fadeOut = new AlphaAnimation(1, 0);
                                fadeOut.setInterpolator(new DecelerateInterpolator());
                                //fadeOut.setStartOffset(500);
                                fadeOut.setDuration(500);

                                tes2.startAnimation(fadeOut);
                                tes2.setVisibility(View.GONE);
                                tes.startAnimation(fadeOut);
                                tes.setVisibility(View.GONE);




                            }
                        });
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

            }
        }.start();
    }

    private void muncul() {
        new Thread() {
            public void run() {


                    try {
                        Log.d("Muncul", "Masuk Try");
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Animation fadeIn = new AlphaAnimation(0, 1);
                                fadeIn.setInterpolator(new DecelerateInterpolator());
                                fadeIn.setDuration(500);

                                Log.d("Muncul", "Masuk Muncul");
                                tes.startAnimation(fadeIn);
                                tes.setVisibility(View.VISIBLE);
                                tes2.startAnimation(fadeIn);
                                tes2.setVisibility(View.VISIBLE);
                                other.setAnimation(fadeIn);
                                other.setBackgroundResource(R.mipmap.otherb);
                            }
                        });
                        Thread.sleep(500);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

            }
        }.start();
    }


    private void editText() {
        entrybutton.setText("Masuk");
        entrybutton.setTextSize(24);
        entrybutton.setTypeface(tipe);
        entrybutton.setTextColor(Color.parseColor("#FFFFFF"));

        daftarbutton.setText("Daftar");
        daftarbutton.setTextSize(24);
        daftarbutton.setTypeface(tipe);
        daftarbutton.setTextColor(Color.parseColor("#FFFFFF"));
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }


}
