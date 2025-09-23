package com.example.nutrieat.ui.community;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.nutrieat.databinding.FragmentCommunityBinding;
import com.example.nutrieat.ui.community.CommunityViewModel;

public class CommunityFragment extends Fragment {

    private FragmentCommunityBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CommunityViewModel communityViewModel = new ViewModelProvider(this).get(CommunityViewModel.class);

        binding = FragmentCommunityBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textCommunity; // Updated ID to match layout
        communityViewModel.getText().observe(getViewLifecycleOwner(), text -> textView.setText(text));
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}