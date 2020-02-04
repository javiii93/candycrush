package com.mygdx.game.scenes;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.CandyCrush;
import com.mygdx.game.Chuche;
import com.mygdx.game.enums.GameState;
import com.mygdx.game.utils.Constants;

public class MainScreen implements Screen{
    SpriteBatch batch;
    Texture img,letras;
    public OrthographicCamera camera;
    public GameState state = GameState.TO_START;

    public MainScreen(CandyCrush candyCrush) {
    }


    @Override
    public void show() {
        batch = new SpriteBatch();
        img = new Texture("fondo.jpg");
        letras = new Texture("CandyAGonzalez.png");
		Music mainTheme = Gdx.audio.newMusic(Gdx.files.internal("gooseBumps.mp3"));
		mainTheme.setLooping(true);
		mainTheme.play();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(img, 0, 0);
        batch.draw(letras, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose () {
        batch.dispose();
        img.dispose();
    }
}