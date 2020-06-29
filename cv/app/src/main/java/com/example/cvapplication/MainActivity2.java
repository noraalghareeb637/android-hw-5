package com.example.cvapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView name1=findViewById(R.id.name1);
        TextView age1=findViewById(R.id.age1);
        TextView job1=findViewById(R.id.job1);
        TextView phonenumber1=findViewById(R.id.phonenumber1);
        TextView email1=findViewById(R.id.email1);

        Bundle b=getIntent().getExtras();
        String name =b.getString("name");
        String age =b.getString("age");
        String job =b.getString("job");
        String phonenumber =b.getString("phn");
        String email =b.getString("email");
        name1.setText("name:"+name);
        age1.setText("age:"+age);
        job1.setText("job:"+job);
        phonenumber1.setText("phn:"+phonenumber);
        email1.setText("email:"+email);


    }

}