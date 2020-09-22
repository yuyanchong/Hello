package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText inp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void convert(View btn){
        TextView outobj = findViewById(R.id.textView);
        outobj.setText("kkk");
        if(inp.getText().toString()==null){
            Toast.makeText(this,"请输入金额",Toast.LENGTH_SHORT).show();
        }else{
            if(btn.getId()==R.id.bd){
                outobj.setText(String.valueOf(1*1.8+32));
            }else if(btn.getId()==R.id.be){
                outobj.setText(String.valueOf(2*1.2+32));
            }else if(btn.getId()==R.id.bw){
                outobj.setText(String.valueOf(3*1.4+32));
            }
        }
    }
}
