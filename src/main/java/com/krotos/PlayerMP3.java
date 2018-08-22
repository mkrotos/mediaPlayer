package com.krotos;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class PlayerMP3 {
    String metallica = "metalica - nothing else matters.mp3";
    Media hit = new Media(new File(metallica).toURI().toString());
    MediaPlayer mediaPlayer = new MediaPlayer(hit);

    public void play(){
        mediaPlayer.play();

    }
    public void stop(){
        mediaPlayer.stop();
    }

}
