package com.example.patterns.command.remote_controller;

public class MoreVolume implements Command {

    private TV tv;

    public MoreVolume(TV tv) {
        this.tv = tv;
    }

    @Override
    public boolean execute() {
        return tv.moreVolume();
    }

    @Override
    public void undo() {
        tv.lessVolume();
    }

    @Override
    public String toString() {
        return "MoreVolumeCommand";
    }
}
