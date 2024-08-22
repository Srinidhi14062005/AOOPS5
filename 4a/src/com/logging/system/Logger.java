package com.logging.system;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Logger {
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommands() {
        Iterator<Command> iterator = commandList.iterator();
        while (iterator.hasNext()) {
            Command command = iterator.next();
            command.execute("Log message");
        }
    }

	public void addcommand(LogCommand logCommand) {
		// TODO Auto-generated method stub
		
	}
}

