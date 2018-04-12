package com.example.ajn.wifimanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MethodChooserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_chooser);
        Button generator = findViewById(R.id.button_generator);
        Button scanner = findViewById(R.id.button_scanner);

        generator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MethodChooserActivity.this,QRGeneratorActivity.class));
            }
        });

        scanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MethodChooserActivity.this,ScannerActivity.class));
            }
        });
    }
}
