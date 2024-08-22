package com.music.streaming;

public class Main {
    public static void main(String[] args) {
        // Adapter Pattern
        MusicSource localFile = new LocalFileAdapter(new LocalFile());
        MusicSource onlineStreaming = new OnlineStreamingServiceAdapter(new OnlineStreamingService());
        MusicSource radioStation = new RadioStationAdapter(new RadioStation());

        // Decorator Pattern
        MusicPlayer basicPlayer = new BasicMusicPlayer(localFile);
        MusicPlayer equalizerPlayer = new EqualizerDecorator(basicPlayer);
        MusicPlayer volumeControlPlayer = new VolumeControlDecorator(equalizerPlayer);

        System.out.println("Playing Local File with Equalizer and Volume Control:");
        volumeControlPlayer.play();

        System.out.println("\nPlaying Online Streaming with Equalizer and Volume Control:");
        basicPlayer = new BasicMusicPlayer(onlineStreaming);
        equalizerPlayer = new EqualizerDecorator(basicPlayer);
        volumeControlPlayer = new VolumeControlDecorator(equalizerPlayer);
        volumeControlPlayer.play();

        System.out.println("\nPlaying Radio Station with Equalizer and Volume Control:");
        basicPlayer = new BasicMusicPlayer(radioStation);
        equalizerPlayer = new EqualizerDecorator(basicPlayer);
        volumeControlPlayer = new VolumeControlDecorator(equalizerPlayer);
        volumeControlPlayer.play();
    }
}
