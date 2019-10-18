package com.example.uts_d1041161014;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MetodeLink extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metode_link);

        button = (Button) findViewById(R.id.button11);
        button.setOnClickListener(new View() {
            @Override
            public void onClick(View v) {
                openMetode();
            }
        })
    }

    public void openMetode() {
        Intent intent = new Intent(this, Metode.class);
        startActivity(intent);
    }
    }
}
