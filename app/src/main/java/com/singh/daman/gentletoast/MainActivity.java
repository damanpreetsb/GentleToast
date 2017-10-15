package com.singh.daman.gentletoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnDone, btnCustom, btnSimple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDone = (Button) findViewById(R.id.btn_done);
        btnCustom = (Button) findViewById(R.id.btn_custom);
        btnSimple = (Button) findViewById(R.id.btn_simple);
        btnDone.setOnClickListener(this);
        btnCustom.setOnClickListener(this);
        btnSimple.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_done:
                GentleToast.with(this)
                        .longToast("Done!", GentleToast.DONE)
                        .show();
                break;
            case R.id.btn_custom:
                GentleToast.with(this)
                        .longToast("Custom!")
                        .setTextColor(R.color.colorAccent)
                        .setBackgroundColor(R.color.colorPrimaryDark)
                        .setBackgroundRadius(16)
                        .setStrokeColor(R.color.white)
                        .setStrokeWidth(4)
                        .setImage(R.mipmap.ic_launcher)
                        .show();
                break;
            case R.id.btn_simple:
                GentleToast.with(this)
                        .shortToast("Simple!")
                        .show();
                break;
        }
    }
}
