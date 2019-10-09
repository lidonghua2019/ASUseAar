package com.test.useactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import com.test.mylibrary.TestLib;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SetText();
    }
    void SetText(){
        TextView txv;
        txv = (TextView)findViewById(R.id.txv);
        txv.setText(TestLib.getStr());
    }
}
