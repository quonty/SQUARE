package com.example.square;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText number;
    private TextView numberToSquare;
    private Button computeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        computeButton = findViewById(R.id.button);
        numberToSquare = findViewById(R.id.textView);
        number = findViewById(R.id.editText);
        computeButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                String numberSt = number.getText().toString();
                Toast.makeText(this,numberSt, Toast.LENGTH_SHORT).show();
                int number = Integer.parseInt(numberSt);
                int squareInput = number * number;
                numberToSquare.setText(String.valueOf(squareInput));
                break;
        }
    }
}