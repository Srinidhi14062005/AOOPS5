package com.music.streaming;

public class OnlineStreamingServiceAdapter implements MusicSource {
    private OnlineStreamingService onlineStreamingService;

    public OnlineStreamingServiceAdapter(OnlineStreamingService onlineStreamingService) {
        this.onlineStreamingService = onlineStreamingService;
    }

    @Override
    public void play() {
        onlineStreamingService.streamMusic();
    }
}