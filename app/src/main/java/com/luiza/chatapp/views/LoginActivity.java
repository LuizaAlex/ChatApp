package com.luiza.chatapp.views;


import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.luiza.chatapp.R;
import com.luiza.chatapp.databinding.ActivityLoginBinding;
import com.luiza.chatapp.viewmodel.MyViewModel;

public class LoginActivity extends AppCompatActivity {


    MyViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        viewModel = new ViewModelProvider(this).get(MyViewModel.class);


        ActivityLoginBinding activityLoginBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_login);

        activityLoginBinding.setVModel(viewModel);


    }
}