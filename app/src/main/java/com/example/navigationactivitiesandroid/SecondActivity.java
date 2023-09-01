package com.example.navigationactivitiesandroid;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
public class SecondActivity extends AppCompatActivity {

    private Button buttonBack;

    private TextView textViewFirstName;

    private TextView textViewLastName;

    private TextView textViewNumber;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        buttonBack = findViewById(R.id.buttonBack);
        textViewFirstName = findViewById(R.id.textView);
        textViewLastName = findViewById(R.id.textView2);
        textViewNumber = findViewById(R.id.textView3);

        Intent intent = getIntent();

        if(intent != null){
            String firstName = intent.getStringExtra("firstName_key");
            String lastName = intent.getStringExtra("lastName_key");
            String number = intent.getStringExtra("number_key");
            textViewFirstName.setText(firstName);
            textViewLastName.setText(lastName);
            textViewNumber.setText(number);
        }
            buttonBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackPressed();
                }
            });


    }
}