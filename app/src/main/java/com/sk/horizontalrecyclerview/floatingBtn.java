package com.sk.horizontalrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class floatingBtn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_btn);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_SHORT)
              //          .setAction("Action", null).show();

                Intent horizontalScroll = new Intent(floatingBtn.this,MainActivity.class);
                startActivity(horizontalScroll);

            }
        });
    }

}
