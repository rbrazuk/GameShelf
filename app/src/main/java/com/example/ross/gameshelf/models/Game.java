package com.example.ross.gameshelf.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
    private String mTitle;
    private int mMinPlayers;
    private int mMaxPlayers;
    private String mDesigner;
    private String mGenre;
    private List<String> mTags;
    private String mStatus;
    private String mYear;

    public Game(String mTitle, int mMinPlayers, int mMaxPlayers, String mDesigner, String mGenre, List<String> mTags, String mStatus, String mYear) {
        this.mTitle = mTitle;
        this.mMinPlayers = mMinPlayers;
        this.mMaxPlayers = mMaxPlayers;
        this.mDesigner = mDesigner;
        this.mGenre = mGenre;
        this.mTags = mTags;
        this.mStatus = mStatus;
        this.mYear = mYear;
    }

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

    public String getmYear() {
        return mYear;
    }

    public void setmYear(String mYear) {
        this.mYear = mYear;
    }

    public static ArrayList<Game> getDummyList() {
        Game lanterns = new Game("Lanterns", 2, 4, null, null, null, null, "2015");
        Game carcassonne = new Game("Carcassonne", 2, 4, null, null, null, null, "2000");
        Game powerGrid = new Game("Power Grid", 2, 6, null, null, null, null, "2004");

        ArrayList<Game> gameList = new ArrayList<>();
        gameList.add(lanterns);
        gameList.add(carcassonne);
        gameList.add(powerGrid);

        return gameList;
    }
}
