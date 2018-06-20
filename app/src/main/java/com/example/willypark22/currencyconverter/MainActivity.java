package com.example.willypark22.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertFunction(View view) {

        EditText currencyEdit = findViewById(R.id.currencyEdit);

        Double currencyAmount = Double.parseDouble(currencyEdit.getText().toString());
        Double convertedAmount = currencyAmount * 1109.30;

        Toast.makeText(this, String.format("%.2f", convertedAmount) + " Won", Toast.LENGTH_LONG).show();

        Log.i("Money", currencyEdit.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
