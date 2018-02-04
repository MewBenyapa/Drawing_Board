package com.example.lenovo.kuwhere.list;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.lenovo.kuwhere.R;
import com.example.lenovo.kuwhere.list.random.RandomActivity;
import com.example.lenovo.kuwhere.list.show.ShowActivity;

/**
 * Created by lenovo on 6/5/2017.
 */

public class ChoiceActivity extends AppCompatActivity {

    Button random, show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choice);

        random = (Button) findViewById(R.id.random);
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(ChoiceActivity.this, RandomActivity.class);
                startActivity(in);
            }
        });

        show = (Button) findViewById(R.id.show_all);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(ChoiceActivity.this, ShowActivity.class);
                startActivity(in);
            }
        });

    }
}
