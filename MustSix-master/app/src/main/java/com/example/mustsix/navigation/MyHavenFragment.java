package com.example.mustsix.navigation;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mustsix.R;

public class MyHavenFragment extends Fragment {

    private View view;
    ImageView roomimage = null;

    public double dog_balance = 3.0;
    public double plus_snack = 0.3;
    public double plus_feed = 0.3;
    public double plus_cloth = 0.3;
    public double plus_beauty = 0.3;
    public double plus_play = 0.3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_myhaven, container, false);

        final ImageButton havendog1 = (ImageButton) view.findViewById(R.id.havendog1);
        Button snack = (Button) view.findViewById(R.id.snack);
        Button feed = (Button) view.findViewById(R.id.feed);
        Button cloth = (Button) view.findViewById(R.id.cloth);
        Button beauty = (Button) view.findViewById(R.id.beauty);
        Button play = (Button) view.findViewById(R.id.play);

        final TextView havendog1_txt = (TextView) view.findViewById(R.id.havendog1_txt);
        roomimage = (ImageView) view.findViewById(R.id.emptyroom);



        havendog1_txt.setText(dog_balance + " ETH");

        //1번 강아지 클릭시 강아지 누워있는 화면이 나옴
        havendog1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roomimage.setImageResource(R.drawable.haven_basic);
                havendog1_txt.setText(dog_balance + " ETH");
            }
        });

        //간식 주기 클릭시
        snack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                roomimage.setImageResource(R.drawable.haven_snack);
                dog_balance = dog_balance + plus_snack;
                havendog1_txt.setText(dog_balance+ " ETH");
            }
        });

        feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roomimage.setImageResource(R.drawable.haven_feed);
                dog_balance = dog_balance + plus_feed;
                havendog1_txt.setText(dog_balance+ " ETH");
            }
        });

        cloth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roomimage.setImageResource(R.drawable.haven_cloth);
                dog_balance = dog_balance + plus_cloth;
                havendog1_txt.setText(dog_balance+ " ETH");
            }
        });

        beauty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roomimage.setImageResource(R.drawable.haven_beauty);
                dog_balance = dog_balance + plus_beauty;
                havendog1_txt.setText(dog_balance+ " ETH");
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roomimage.setImageResource(R.drawable.haven_play);
                dog_balance = dog_balance + plus_play;
                havendog1_txt.setText(dog_balance+ " ETH");
            }
        });

        return view;
    }
}
