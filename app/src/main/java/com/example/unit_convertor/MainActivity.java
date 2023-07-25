package com.example.unit_convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        EditText editText = findViewById(R.id.Edttxt);
        TextView textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

             //   Toast.makeText(MainActivity.this, "Hi Button is being Clicked", Toast.LENGTH_SHORT).show();
                String e = editText.getText().toString();
                int kg = Integer.parseInt(e);
                double pounds = 2.205 * kg;
                textView.setText("The value in pounds is"+pounds);

            }
        });
    }
}