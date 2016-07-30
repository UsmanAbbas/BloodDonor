package com.example.cyberboy.myblooddonor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class DashBoardActivity extends AppCompatActivity {

    Spinner spin;
    ListView lstDonor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        spin = (Spinner) findViewById(R.id.spin);
        lstDonor = (ListView) findViewById(R.id.lstDonor);

    }
}
