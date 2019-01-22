package com.example.patterns.command.remote_controller;

public class LessVolume implements Command {

    private TV tv;

    public LessVolume(TV tv) {
        this.tv = tv;
    }

    @Override
    public boolean execute() {
        return tv.lessVolume();
    }

    @Override
    public void undo() {
        tv.moreVolume();
    }

    @Override
    public String toString() {
        return "LessVolumeCommand";
    }
}
