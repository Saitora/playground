package com.example.patterns.command.remote_controller;

public interface Command {

    public boolean execute();

    public void undo();

}