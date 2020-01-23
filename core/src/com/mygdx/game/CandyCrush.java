package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.enums.GameState;
import com.mygdx.game.scenes.MainScreen;
import com.mygdx.game.utils.Constants;

public class CandyCrush extends Game {
    public SpriteBatch batch;
    public BitmapFont font;
    public OrthographicCamera camera;
    public GameState state = GameState.TO_START;
    @Override
    public void create() {
        batch = new SpriteBatch();
        //font = new BitmapFont(Gdx.files.internal(""), Gdx.files.internal(""), false);
        //font.setColor(Color.GREEN);
        camera = new OrthographicCamera();
        camera.setToOrtho(false, Constants.APP_WIDTH, Constants.APP_HEIGHT);
        setScreen(new MainScreen(this));

    }

    @Override
    public void dispose() {
        batch.dispose();
        font.dispose();
        super.dispose();
    }
}
