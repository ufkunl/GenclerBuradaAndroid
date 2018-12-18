package com.example.yldzufk.genclerburada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yldzufk.genclerburada.ui.common.NavigationController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavigationController navigationController = new NavigationController(this);

        if(savedInstanceState == null){
            navigationController.navigateToConfessionList();
        }

    }
}
