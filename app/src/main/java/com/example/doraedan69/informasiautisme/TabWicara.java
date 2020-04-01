package com.example.doraedan69.informasiautisme;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class TabWicara extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View myFragmentView = inflater.inflate(R.layout.tab_wicara, container, false);

        ImageView maps = (ImageView) myFragmentView.findViewById(R.id.btn_wicara);
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/BLWTb0pnE_A"));
                startActivity(intent);

            }
        });
        return myFragmentView;
    }
}
