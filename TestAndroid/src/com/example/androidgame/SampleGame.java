package com.example.androidgame;

import com.example.testandroid.Screen;
import com.example.framework.implementation.AndroidGame;

public class SampleGame extends AndroidGame {
    @Override
    public Screen getInitScreen() {
        return new LoadingScreen(this);
    }
   
}
