package com.example.ross.gameshelf.models;

import java.util.List;

public class Game {
    private String mTitle;
    private int mMinPlayers;
    private int mMaxPlayers;
    private String mDesigner;
    private String mGenre;
    private List<String> mTags;
    private String mStatus;

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public int getmMinPlayers() {
        return mMinPlayers;
    }

    public void setmMinPlayers(int mMinPlayers) {
        this.mMinPlayers = mMinPlayers;
    }

    public int getmMaxPlayers() {
        return mMaxPlayers;
    }

    public void setmMaxPlayers(int mMaxPlayers) {
        this.mMaxPlayers = mMaxPlayers;
    }

    public String getmDesigner() {
        return mDesigner;
    }

    public void setmDesigner(String mDesigner) {
        this.mDesigner = mDesigner;
    }

    public String getmGenre() {
        return mGenre;
    }

    public void setmGenre(String mGenre) {
        this.mGenre = mGenre;
    }

    public List<String> getmTags() {
        return mTags;
    }

    public void setmTags(List<String> mTags) {
        this.mTags = mTags;
    }

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }
}
