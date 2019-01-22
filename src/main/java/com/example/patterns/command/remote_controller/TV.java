package com.example.patterns.command.remote_controller;

import java.util.ArrayList;
import java.util.List;

public class TV {

    private static List<String> channels = new ArrayList<String>() {{
        add("Первый");
        add("НТВ");
        add("Культура");
        add("Россия 24");
    }};

    private int currentChannel;
    private int volume;

    public TV() {
        currentChannel = 0;
        volume = 0;
    }

    public TV(int currentChannel, int volume) {
        this.currentChannel = currentChannel;
        this.volume = volume;
    }

    public void nextChannel() {
        if (currentChannel == (channels.size() - 1)) {
            currentChannel = 0;
        } else {
            currentChannel++;
        }
    }

    public void prevChannel() {
        if (currentChannel == 0) {
            currentChannel = channels.size() - 1;
        } else {
            currentChannel--;
        }
    }

    public boolean moreVolume() {
        if (volume < 100) {
            volume++;
            return true;
        }
        return false;
    }

    public boolean lessVolume() {
        if (volume > 0) {
            volume--;
            return true;
        }
        return false;
    }

    public void status() {
        System.out.println("TV{" +
            "currentChannel=" + currentChannel +
            ", volume=" + volume +
            '}'
        );
    }
}
