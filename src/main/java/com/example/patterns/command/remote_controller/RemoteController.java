package com.example.patterns.command.remote_controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RemoteController {

    public enum Buttons {
        INCVOLUME,
        DECVOLUME,
        NEXTCHANNEL,
        PREVCHANNEL
    };

    private Map<Buttons, Command> buttons = new HashMap<>();
    private Stack<CommandResult> clickHistory = new Stack<>();

    public void clickButton(Buttons btn) {
        Command cmd = buttons.get(btn);
        clickHistory.push(new CommandResult(cmd, cmd.execute()));
    }

    public void addButton(Buttons btn, Command command) {
        buttons.put(btn, command);
    }

    public void removeButton(Buttons btn) {
        buttons.remove(btn);
    }

    public void undoLastCommand() {
        if (!clickHistory.isEmpty()) {
            CommandResult cr = clickHistory.pop();
            if (cr.getResult()) {
                cr.getCommand().undo();
            }
        }
    }

    public void undoAllCommands() {
        while(!clickHistory.isEmpty()) {
            undoLastCommand();
        }
    }

    public void status() {
        System.out.println("RemoteController{" +
            "buttons=" + buttons +
            ", clickHistory=" + clickHistory +
            '}'
        );
    }
}
