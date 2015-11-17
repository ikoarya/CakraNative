package com.example.anggerikoaryasena.cakramobile;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Anggeriko Aryasena on 11/13/2015.
 */
public class SplashScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Thread timerthread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                    Log.d("cakracoba", "masuk try");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(SplashScreen.this, daftar.class);
                    startActivity(intent);
                }
            }
        };
        timerthread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
