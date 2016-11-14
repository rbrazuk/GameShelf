package com.example.ross.gameshelf.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.ross.gameshelf.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bt_games) Button mGamesListButton;
    @BindView(R.id.bt_wishlist) Button mWishlistButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.bt_games)
    public void launchGamesList() {
        startActivity(new Intent(MainActivity.this, GameListActivity.class));
    }

    @OnClick(R.id.bt_wishlist)
    public void launchWishlist() {
        startActivity(new Intent(MainActivity.this, WishlistActivity.class));
    }
}
