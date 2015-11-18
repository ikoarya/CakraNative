package com.example.anggerikoaryasena.cakramobile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Anggeriko Aryasena on 11/18/2015.
 */
public class login extends Activity {
    public Button loginbut, backbut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        loginbut = (Button)findViewById(R.id.next);
        backbut = (Button)findViewById(R.id.back);

        loginbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, home.class);
                startActivity(intent);
            }
        });

        backbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(login.this, MainScreen.class);
                startActivity(intent1);
            }
        });


    }
}
