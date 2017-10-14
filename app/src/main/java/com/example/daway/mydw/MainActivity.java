package com.example.daway.mydw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lzy.okgo.OkGo;

public class MainActivity extends AppCompatActivity {
Button btn;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      String str="";
    btn= (Button) findViewById(R.id.btnshow);
        txt= (TextView) findViewById(R.id.txtshow);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              txt.setText("aaaa");
            }
        });

    }
}
