package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;

import java.util.HashMap;

public class Chuche {

    public SpriteBatch batch;
    public static HashMap<Integer,Texture> arrayTexturas;
    Texture textura;
    AssetManager manager;
    Texture candy;

    public void loadTextures(){
        manager = new AssetManager();
        arrayTexturas = new HashMap<>();

        for(int i=1;i<6;i++) {
            candy = manager.get("assets/candy" + i + ".png", Texture.class);
            arrayTexturas.put(i,candy);
        }

    }
    public static void getCandy(){
        int randomId= (int) (Math.random()*5);
        System.out.print(String.valueOf(randomId));
    }


}
