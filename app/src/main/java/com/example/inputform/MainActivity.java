package com.example.inputform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txt1;
    private EditText edt;
    private EditText edt1;
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
            TextView txt1 = findViewById(R.id.txinf);
            EditText edt = findViewById(R.id.editTextEmail);
            EditText edt1 = findViewById(R.id.editTextName);
            @Override
            public void onClick(View v) {
                txt1.setText(R.string.txtNull);
                edt.setText(R.string.txtNull);
                edt1.setText(R.string.txtNull);
            }
        });
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = getString(R.string.txtFull, edt1.getText().toString(), edt.getText().toString());
//                String stringEdt1 = getString(R.string.txtinf1)+edt1.getText().toString();
//                String stringEdt = getString(R.string.txtinf2)+edt.getText().toString();
//                String res = stringEdt1 + stringEdt;
                txt1.setText(text);

            }
        });
    }
}
