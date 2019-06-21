package com.shubham.navigation;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Second extends Fragment {
    Button b1;
    View v;
    EditText e1, e2;
    TextView tv1, tv2;
    String s1, s2;


    public Second() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_second, container, false);
        e1 = v.findViewById(R.id.edit1);
        e2 = v.findViewById(R.id.edit2);
        b1 = v.findViewById(R.id.button);
        tv1 = v.findViewById(R.id.text1);
        tv2 = v.findViewById(R.id.text2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1 = e1.getText().toString();
                s2 = e2.getText().toString();
                tv1.setText(s1);
                tv2.setText(s2);

            }
        });
        return v;
    }
}
