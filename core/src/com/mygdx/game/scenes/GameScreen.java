package com.mygdx.game.scenes;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.enums.GameState;

public class GameScreen extends ScreenAdapter {
	SpriteBatch batch;
	Texture img,letras;
	public OrthographicCamera camera;
	public GameState state = GameState.TO_START;

	public void create () {
		batch = new SpriteBatch();
		img = new Texture("fondo.jpg");
		letras = new Texture("CandyAGonzalez.png");
		Music music = Gdx.audio.newMusic(Gdx.files.internal("mymusic.mp3"));
		music.setLooping(true);
		music.play();
	}

	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.draw(letras, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
