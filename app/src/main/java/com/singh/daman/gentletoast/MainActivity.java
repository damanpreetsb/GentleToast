package com.singh.daman.gentletoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button doneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doneButton = (Button) findViewById(R.id.btn_done);
        doneButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_done:
                GentleToast.with(this)
                        .shortToast("Done!!", GentleToast.DONE)
                        .setTextColor(R.color.colorAccent)
                        .show();
                break;
        }
    }
}
