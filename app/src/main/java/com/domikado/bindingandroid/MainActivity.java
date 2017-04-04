package com.domikado.bindingandroid;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.domikado.bindingandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    PresenterNyaBro presenterNyaBro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        presenterNyaBro = new PresenterNyaBro(this, activityMainBinding);

        activityMainBinding.setPresenter(presenterNyaBro);

        activityMainBinding.editText.getText().toString();

    }
}
