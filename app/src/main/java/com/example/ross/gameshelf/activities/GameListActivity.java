package com.example.ross.gameshelf.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ross.gameshelf.R;
import com.example.ross.gameshelf.adapters.GamesAdapter;
import com.example.ross.gameshelf.models.Game;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GameListActivity extends AppCompatActivity {

    ArrayList<Game> mGamesList;

    @BindView(R.id.rv_games) RecyclerView mGamesRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_list);

        ButterKnife.bind(this);

        mGamesList = (ArrayList<Game>) Game.getDummyList();

        GamesAdapter adapter = new GamesAdapter(this, mGamesList);

        mGamesRecyclerView.setAdapter(adapter);

        mGamesRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
