package com.mygdx.game.scenes;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.mygdx.game.CandyCrush;
import com.mygdx.game.Chuche;
import com.mygdx.game.utils.Constants;

public class MainScreen implements Screen{
    CandyCrush game;
    Chuche chuche;
    OrthographicCamera camera;
    Music mainTheme = Constants.mainTheme;

    public MainScreen(CandyCrush game) {
        this.game = game;
    }
    public void show() {
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
        mainTheme.setLooping(true);
        mainTheme.play();
        chuche = new Chuche();

    }

    @Override

    public void render(float delta) {
        game.camera.update();
        game.batch.setProjectionMatrix(game.camera.combined);

        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.batch.begin();
        //draw
        //game.batch.draw(Constants.backgroundTexture, 0, 0);
        //game.batch.draw(Constants.frogTexture, player.x, player.y);

        game.batch.end();

        if (Gdx.input.isTouched()) {
            System.out.println("Screen touched");
            //game.setScreen(new GameScreen(game));

            dispose();

        }

    }

    @Override
    public void resize(int width, int height) {

    }







    public void hide() {

    }


    @Override

    public void pause() {

    }


    @Override

    public void resume() {

    }


    @Override

    public void dispose() {

    }
}