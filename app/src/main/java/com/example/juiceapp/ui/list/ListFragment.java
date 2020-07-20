package com.example.juiceapp.ui.list;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.juiceapp.AlpukatActivity;
import com.example.juiceapp.JambuActivity;
import com.example.juiceapp.MelonActivity;
import com.example.juiceapp.NagaActivity;
import com.example.juiceapp.R;
import com.example.juiceapp.SemangkaActivity;
import com.example.juiceapp.SirsakActivity;
import com.example.juiceapp.StrawberryActivity;
import com.example.juiceapp.TomatActivity;
import com.example.juiceapp.WortelActivity;

public class ListFragment extends Fragment {


//    private ListViewModel listViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        listViewModel =
//                ViewModelProviders.of(this).get(ListViewModel.class);
        View root = inflater.inflate(R.layout.fragment_list, container, false);
        ImageButton img1 = (ImageButton) root.findViewById(R.id.jambu);
        ImageButton img2 = (ImageButton) root.findViewById(R.id.strawberry);
        ImageButton img3 = (ImageButton) root.findViewById(R.id.semangka);
        ImageButton img4 = (ImageButton) root.findViewById(R.id.melon);
        ImageButton img5 = (ImageButton) root.findViewById(R.id.sirsak);
        ImageButton img6 = (ImageButton) root.findViewById(R.id.alpukat);
        ImageButton img7 = (ImageButton) root.findViewById(R.id.naga);
        ImageButton img8 = (ImageButton) root.findViewById(R.id.tomat);
        ImageButton img9 = (ImageButton) root.findViewById(R.id.wortel);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getActivity(), JambuActivity.class);
                startActivity(a);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(getActivity(), StrawberryActivity.class);
                startActivity(b);
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(getActivity(), SemangkaActivity.class);
                startActivity(c);
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(getActivity(), MelonActivity.class);
                startActivity(d);
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(getActivity(), SirsakActivity.class);
                startActivity(e);
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(getActivity(), AlpukatActivity.class);
                startActivity(f);
            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(getActivity(), NagaActivity.class);
                startActivity(g);
            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(getActivity(), TomatActivity.class);
                startActivity(h);
            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), WortelActivity.class);
                startActivity(i);
            }
        });
//        final TextView textView = root.findViewById(R.id.list);
//        listViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        return root;
    }
}
