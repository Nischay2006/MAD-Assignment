package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;
import android.widget.ImageView;
import android.widget.ImageButton;




public class MainActivity extends AppCompatActivity {

    TextView txtView;
    EditText editText;
    Button btnUpdate;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        btnUpdate = findViewById(R.id.btnUpdate);



        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString();
                txtView.setText(String.format("Hello %s!", name));
                Toast.makeText(MainActivity.this,
                        "Update button got clicked!",
                        Toast.LENGTH_SHORT).show();
            }
        });


    }

}