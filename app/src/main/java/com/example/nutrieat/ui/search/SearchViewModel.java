package com.example.nutrieat.ui.search;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SearchViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SearchViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the Search Fragment"); // Default text
    }

    public LiveData<String> getText() {
        return mText;
    }
}