package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 private Button button;
 private EditText edit;
 private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= findViewById(R.id.button);
        edit=findViewById(R.id.editTextNumber);
        text=findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Submitted",Toast.LENGTH_SHORT).show();
                String s= edit.getText().toString();
                int kg=Integer.parseInt(s);
                double pound= 2.205*kg;
                text.setText("The corresponding value in pound is : "+pound);

            }
        });
    }
}