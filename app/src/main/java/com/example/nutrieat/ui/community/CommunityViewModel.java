package com.example.nutrieat.ui.community;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CommunityViewModel extends ViewModel {
    private final MutableLiveData<String> _text = new MutableLiveData<>();
    public LiveData<String> getText() {
        _text.setValue("This is the Community Fragment");
        return _text;
    }
}