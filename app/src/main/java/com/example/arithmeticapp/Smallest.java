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

public class Smallest extends AppCompatActivity {


    EditText ed1,ed2;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_smallest);
        ed1=(EditText) findViewById(R.id.smallestnum1);
        ed2=(EditText) findViewById(R.id.smallestnum2);
        b1=(AppCompatButton) findViewById(R.id.findsmallbtn);
        b2=(AppCompatButton) findViewById(R.id.smallbacktomenubtn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int getNum1 = Integer.parseInt(ed1.getText().toString());
                    int getNum2 = Integer.parseInt(ed2.getText().toString());
                    int result = getNum1 < getNum2 ? getNum1 : getNum2;
                    Toast.makeText(getApplicationContext(), String.valueOf(result) + " is the Smallest", Toast.LENGTH_SHORT).show();
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