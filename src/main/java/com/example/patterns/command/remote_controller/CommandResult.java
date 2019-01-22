package com.example.patterns.command.remote_controller;

public class CommandResult {

    private Command command;
    private boolean result;

    public CommandResult(Command command, boolean result) {
        this.command = command;
        this.result = result;
    }

    public Command getCommand() {
        return command;
    }

    public boolean getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "CommandResult{" +
            "command=" + command +
            ", result=" + result +
            '}';
    }
}
