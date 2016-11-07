package com.android.kv.androidbuilderdesignpattern;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button_click);
    }

    public void click (View view) {
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("Metaphorical Sandwich Dialog")
                .setMessage("Metaphorical message to please use the spicy mustard.")
                .setNegativeButton("No thanks", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // "No thanks" button was clicked
                    }
                })
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // "OK" button was clicked
                    }
                })
                .show();

    }
}
