package com.example.uts_d1041161014;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Metode extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metode2);

        button = (Button) findViewById(R.id.button7);
        button.setOnClickListener(new View() {
            @Override
            public void onClick(View v) {
                openMetodeSyntax();
            }
        })

        button = (Button) findViewById(R.id.button8);
        button.setOnClickListener(new View() {
            @Override
            public void onClick(View v) {
                openMetodeLink();
            }
        })
        button = (Button) findViewById(R.id.button9);
        button.setOnClickListener(new View() {
            @Override
            public void onClick(View v) {
                openHalamanMetode();
            }
        })

    }
    public void openHalamanMetode() {
        Intent intent = new Intent(this, HalamanMetode.class);
        startActivity(intent);
    }

    public void openMetodeSyntax() {
        Intent intent = new Intent(this, MetodeSyntax.class);
        startActivity(intent);
    }

    public void openMetodeLink() {
        Intent intent = new Intent(this, MetodeLink.class);
        startActivity(intent);
    }
}
