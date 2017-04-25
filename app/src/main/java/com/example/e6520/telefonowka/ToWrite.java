package com.example.e6520.telefonowka;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Time;

/**
 * Created by E6520 on 2017-04-25.
 */

public class ToWrite extends Activity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.to_write);

        textView=(TextView) findViewById(R.id.textView1);


    }
}
