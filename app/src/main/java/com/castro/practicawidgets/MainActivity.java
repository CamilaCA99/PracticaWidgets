package com.castro.practicawidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {

    private EditText ptNombre;
    private EditText ptApellido;
    private RadioGroup RadioGroup;
    private Button btnEnviar;
    private RatingBar ratingBar;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ptNombre = findViewById(R.id.ptNombre);
        ptApellido = findViewById(R.id.ptApellido);
        ptNombre = findViewById(R.id.ptNombre);
        RadioGroup = findViewById(R.id.RadioGroup);
        btnEnviar = findViewById(R.id.btnEnviar);
        ratingBar = findViewById(R.id.ratingBar);
        checkBox = findViewById(R.id.cbSi);
        checkBox = findViewById(R.id.cbNo);
        checkBox = findViewById(R.id.cbNotengo);
        //commit

    }
}