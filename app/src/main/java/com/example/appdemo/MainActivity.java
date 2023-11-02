package com.example.appdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_reg = (Button) findViewById(R.id.btn_reg);
        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText ed_id = (EditText) findViewById(R.id.et_id);
                EditText ed_pw = (EditText) findViewById(R.id.et_pw);
                EditText ed_name = (EditText) findViewById(R.id.et_name);
                String id = ed_id.getText().toString();
                String pw = ed_pw.getText().toString();
                String name = ed_name.getText().toString();
                
                CallWCF cw = new CallWCF();
                TextView tv = (TextView)findViewById(R.id.tv_result);
                tv.setText(cw.Reg(id,pw,name));

            }
        });
    }
}