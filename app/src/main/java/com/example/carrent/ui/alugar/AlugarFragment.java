package com.example.carrent.ui.alugar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.carrent.databinding.FragmentAlugarBinding;



public class AlugarFragment extends Fragment {

    private FragmentAlugarBinding binding;

    public AlugarFragment() {

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAlugarBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

}