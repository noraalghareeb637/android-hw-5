package com.example.cvapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         final EditText name = findViewById(R.id.name);
       final  EditText age = findViewById(R.id.age);
        final EditText job = findViewById(R.id.job);
       final  EditText phn = findViewById(R.id.phn);
       final  EditText email = findViewById(R.id.email);
        Button next = findViewById(R.id.button);


    next.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent myintent = new Intent(MainActivity.this, MainActivity2.class);
           myintent.putExtra("name", name.getText().toString());
            myintent.putExtra("age", age.getText().toString());
            myintent.putExtra ("job", job.getText().toString());
            myintent.putExtra("phn", phn.getText().toString());
            myintent.putExtra ("email", email.getText().toString());
            startActivity(myintent);
        }
    });


    }
}
