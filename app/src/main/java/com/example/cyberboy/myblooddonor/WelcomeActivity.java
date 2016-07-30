package com.example.cyberboy.myblooddonor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imgBlood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        imgBlood = (ImageView) findViewById(R.id.imgBlood);

        imgBlood.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgBlood:

                startActivity(new Intent(this, DashBoardActivity.class));
                break;
        }
    }
}
