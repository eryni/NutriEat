package com.example.nutrieat.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.bumptech.glide.Glide;   // <-- add this import
import com.example.nutrieat.R;
import com.example.nutrieat.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Example: dynamic profile pic URL (replace with actual user data)
        String userProfileUrl = "https://example.com/path/to/user/pfp.jpg";

        // Load profile picture with Glide into the ImageView
        Glide.with(this)
                .load(userProfileUrl)
                .placeholder(R.drawable.ic_default_avatar) // fallback image
                .error(R.drawable.ic_default_avatar)       // if loading fails
                .circleCrop()
                .into(binding.profilePic);

        // Your ViewModel text example
        homeViewModel.getText().observe(getViewLifecycleOwner(), binding.textView::setText);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
