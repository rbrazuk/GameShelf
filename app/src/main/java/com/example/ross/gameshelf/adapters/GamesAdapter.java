package com.example.ross.gameshelf.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.ross.gameshelf.R;
import com.example.ross.gameshelf.models.Game;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GamesAdapter extends RecyclerView.Adapter<GamesAdapter.ViewHolder>{

    private List<Game> mGames;
    private Context mContext;

    public GamesAdapter(Context context, List<Game> games) {
        mGames = games;
        mContext = context;
    }

    private Context getContext() {
        return mContext;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.ivBoxArt) ImageView mBoxArtImageView;
        @BindView(R.id.tvTitle) TextView mTitleTextView;
        @BindView(R.id.tvYear) TextView mYearTextView;

        public ViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View gameView = inflater.inflate(R.layout.list_item_game, parent, false);

        ViewHolder viewHolder = new ViewHolder(gameView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Game game = mGames.get(position);

        TextView titleTextView = holder.mTitleTextView;
        titleTextView.setText(game.getmTitle());

        TextView yearTextView = holder.mYearTextView;
        yearTextView.setText(game.getmYear());

        ImageView boxArtImageView = holder.mBoxArtImageView;
        Glide.with(getContext()).load(R.mipmap.ic_launcher).into(boxArtImageView);
    }

    @Override
    public int getItemCount() {
        return mGames.size();
    }


}
