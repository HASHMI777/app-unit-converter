package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button3);
        textView=findViewById(R.id.textView4);
        editText=findViewById(R.id.editTextTextPersonName);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hi click listener worked", Toast.LENGTH_SHORT ).show();
                String s=editText.getText().toString();
                 float a =Float.parseFloat(s);
                 double pound=a*2.025;
                 textView.setText("the value of above kg in pound is:"+pound);
            }
        });
    }
}