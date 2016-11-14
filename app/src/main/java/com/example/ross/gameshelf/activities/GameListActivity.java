package com.example.ross.gameshelf.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.ross.gameshelf.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GameListActivity extends AppCompatActivity {

    @BindView(R.id.rv_games) RecyclerView mGamesRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_list);

        ButterKnife.bind(this);
    }
}
