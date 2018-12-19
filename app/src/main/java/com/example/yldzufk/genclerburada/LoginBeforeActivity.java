package com.example.yldzufk.genclerburada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yldzufk.genclerburada.ui.common.NavigationController;

public class LoginBeforeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_before);

        NavigationController navigationController = new NavigationController(this);

        if(savedInstanceState == null){
            navigationController.navigateToHome();
        }
    }
}
