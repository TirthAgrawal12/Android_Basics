package com.example.a17it003_pr2_wcmc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    TextView t1;
    EditText et1;
    TextView t2;
    EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.b1);
        t1 = (TextView)findViewById(R.id.t1);
        et1 = (EditText) findViewById(R.id.et1);
        t2 = (TextView)findViewById(R.id.t2);
        et2 = (EditText) findViewById(R.id.et2);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int n1 = Integer.parseInt(et1.getText().toString());
                int n2 = Integer.parseInt(et2.getText().toString());
                n1 = n1+n2;
                Toast.makeText(getApplicationContext(), "sum: "+ Integer.toString(n1), Toast.LENGTH_LONG).show();



            }
        });

    }

}
