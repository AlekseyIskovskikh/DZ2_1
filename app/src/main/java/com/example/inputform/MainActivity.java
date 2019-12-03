package com.example.inputform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();


    }
    private void Init()
    {
        Button btnClear = findViewById(R.id.buttonClear);
        Button btnOk = findViewById(R.id.buttonOk);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t1 = findViewById(R.id.editTextName);
                TextView t2 = findViewById(R.id.editTextEmail);
                TextView t3 = findViewById(R.id.txinf);
                t1.setText(R.string.txtNull);
                t2.setText(R.string.txtNull);
                t3.setText(R.string.txtNull);
            }
        });
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt1 = findViewById(R.id.txinf);
                EditText edt = findViewById(R.id.editTextEmail);
                EditText edt1 = findViewById(R.id.editTextName);
                String stringEdt1 = getString(R.string.txtinf1)+edt1.getText().toString();
                String stringEdt = getString(R.string.txtinf2)+edt.getText().toString();
                String res = stringEdt1 + stringEdt;
                txt1.setText(res);


            }
        });
    }
}
