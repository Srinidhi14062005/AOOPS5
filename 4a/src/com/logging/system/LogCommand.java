package com.logging.system;

public class LogCommand {
	private LogLevel level;
    private LogHandler handler;

    public LogCommand(LogLevel level, LogHandler handler) {
        this.level = level;
        this.handler = handler;
    }

  
    public void execute(String message) {
        handler.handle(level, message);
    }
}
