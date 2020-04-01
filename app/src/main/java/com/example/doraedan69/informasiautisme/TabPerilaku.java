package com.example.doraedan69.informasiautisme;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import android.widget.ImageView;

public class TabPerilaku extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View myFragmentView = inflater.inflate(R.layout.tab_perilaku, container, false);

        ImageView maps = (ImageView) myFragmentView.findViewById(R.id.btn_perilaku);
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/xhVps7zRO20"));
                startActivity(intent);

            }
        });
        return myFragmentView;
    }
}
