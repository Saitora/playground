package com.example.patterns.command.remote_controller;

public class PrevChannel implements Command {

    private TV tv;

    public PrevChannel(TV tv) {
        this.tv = tv;
    }

    @Override
    public boolean execute() {
        return true;
    }

    @Override
    public void undo() {

    }

    @Override
    public String toString() {
        return "PrevChannelCommand";
    }

}
