package com.domikado.bindingandroid;
// Created by irwancannady (irwancannady@gmail.com) on 4/4/17 at 2:24 PM.

import android.content.Context;
import android.widget.Toast;

import com.domikado.bindingandroid.databinding.ActivityMainBinding;

public class PresenterNyaBro {

    Context context;
    ActivityMainBinding ac;

    public PresenterNyaBro(Context context, ActivityMainBinding act) {
        this.context = context;
        this.ac = act;
    }

    public void setTextView(){
        Toast.makeText(context, "nanana", Toast.LENGTH_SHORT).show();
    }

    public void btnClick(){
//        ac.editText.getText().toString();
        ac.textView2.setText(ac.editText.getText().toString());
    }
}
