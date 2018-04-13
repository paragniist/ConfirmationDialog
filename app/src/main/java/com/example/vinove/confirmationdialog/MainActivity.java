package com.example.vinove.confirmationdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AlertDialog alertDialog;
    AlertDialog.Builder builder;
    String[] items = {" Easy "," Medium ", " Hard ", " Very Hard " };
    String result= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        builder = new AlertDialog.Builder(MainActivity.this,R.style.ConfirmationDialogTheme);

        builder.setTitle("Select the difficulty level");

        builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
/*
                System.out.println(which); //whatever item we selected its going to select that  item only
                //by using conditional statements we can write our desirable code*/

                        result = items[which];
            }
        });

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });

        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        alertDialog = builder.create();
        alertDialog.show();


    }
}
