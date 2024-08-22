package com.music.streaming;

public abstract class MusicPlayerDecorator implements MusicPlayer {
    protected MusicPlayer decoratedPlayer;

    public MusicPlayerDecorator(MusicPlayer decoratedPlayer) {
        this.decoratedPlayer = decoratedPlayer;
    }

    @Override
    public void play() {
        decoratedPlayer.play();
    }
}
