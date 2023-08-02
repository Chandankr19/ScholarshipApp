package com.tecdroid.adminuserapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FormApplyActivity extends AppCompatActivity {

    Button applyBtn;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_apply);
        
        applyBtn = findViewById(R.id.submit_button);
        
        applyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FormApplyActivity.this, "Saved", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(FormApplyActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
    
}