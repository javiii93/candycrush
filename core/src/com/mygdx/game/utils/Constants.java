package com.mygdx.game.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;

public class Constants {
    public static final int APP_WIDTH = 480;
    public static final int APP_HEIGHT = 720;

    public static final Music mainTheme = Gdx.audio.newMusic(Gdx.files.internal("gooseBumps.mp3"));
    //public static final Sound startSound = Gdx.audio.newSound(Gdx.files.internal("StartSound.wav"));

}
