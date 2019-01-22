package com.example.patterns.command.remote_controller;

public class App {

    public static void main(String[] args) {
        TV tv = new TV();
        RemoteController remote = new RemoteController();
        remote.addButton(RemoteController.Buttons.INCVOLUME, new MoreVolume(tv));
        remote.addButton(RemoteController.Buttons.DECVOLUME, new LessVolume(tv));

        tv.status();
        remote.status();

        remote.clickButton(RemoteController.Buttons.INCVOLUME);

        tv.status();
        remote.status();

        remote.clickButton(RemoteController.Buttons.DECVOLUME);
        remote.clickButton(RemoteController.Buttons.DECVOLUME);

        tv.status();
        remote.status();

        remote.undoLastCommand();
        remote.undoLastCommand();

        tv.status();
        remote.status();
    }

}
