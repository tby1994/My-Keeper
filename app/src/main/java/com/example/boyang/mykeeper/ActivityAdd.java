package com.example.boyang.mykeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivityAdd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }

    public void onAddEntry(View view) {
        EditText description = (EditText) findViewById(R.id.etDescription);
        EditText amount = (EditText) findViewById(R.id.etValue);
        Intent intent = new Intent(ActivityAdd.this, MainActivity.class);
        intent.putExtra("description", description.getText().toString());
        intent.putExtra("amount", amount.getText().toString());
        startActivity(intent);
    }
}
