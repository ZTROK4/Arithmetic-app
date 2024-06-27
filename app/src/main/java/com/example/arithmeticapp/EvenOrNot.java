package com.example.arithmeticapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EvenOrNot extends AppCompatActivity {

    EditText ed1;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_even_or_not);
        ed1=(EditText) findViewById(R.id.evenoddnum);
        b1=(AppCompatButton) findViewById(R.id.evenoddcheckbtn);
        b2=(AppCompatButton) findViewById(R.id.evenoddbacktomenubtn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int getNum = Integer.parseInt(ed1.getText().toString());
                    if(getNum%2==0)
                        Toast.makeText(getApplicationContext(), String.valueOf(getNum) + " is Even", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(getApplicationContext(), String.valueOf(getNum) + " is Odd", Toast.LENGTH_SHORT).show();
                }
                catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(),e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}