package com.company;

import java.util.List;

/**
 * Created by parf on 20.1.17.
 */
public class SystemEvent {

    private Command command;
    private List<String> args;

    public SystemEvent(Command command, List<String> args) {
        this.command = command;
        this.args = args;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }
}
