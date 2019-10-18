package com.example.uts_d1041161014;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonmasuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonmasuk = (Button) findViewById(R.id.buttonmasuk);
        buttonmasuk.setOnClickListener(new View() {
            @Override
            public void onClick(View v) {
                openHalamanMetode()
            }
        })
    }

    public void openHalamanMetode() {
        Intent intent = new Intent(this, HalamanMetode.class);
        startActivity(intent);
    }
}
