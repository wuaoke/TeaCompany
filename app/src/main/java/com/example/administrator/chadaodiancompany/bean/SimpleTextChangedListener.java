package com.example.administrator.chadaodiancompany.bean;

import android.text.TextWatcher;

public abstract class SimpleTextChangedListener implements TextWatcher {
    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }
}
