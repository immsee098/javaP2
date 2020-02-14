package com.example.fragmentapp;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ListFragment extends Fragment {
    public static interface ImageSelectionCallback {
        public void onImageSelected(int position);
    }

    public ImageSelectionCallback callback;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof ImageSelectionCallback) {
            callback = (ImageSelectionCallback) context;
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView
        = (ViewGroup) inflater.inflate(R.layout.fragment_list, container, false);

        Button bt1 =rootView.findViewById(R.id.button);
        bt1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if()
            }
        });


        return rootView;
    }

}
