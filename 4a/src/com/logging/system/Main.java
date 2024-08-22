package com.logging.system;


public class Main {
    public static void main(String[] args) {
        // Creating handlers
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        // Configuring the chain of responsibility
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        // Creating Logger
        Logger logger = new Logger();

        // Adding commands to the logger
        logger.addcommand(new LogCommand(LogLevel.INFO, infoHandler));
        logger.addcommand(new LogCommand(LogLevel.DEBUG, infoHandler));
        logger.addcommand(new LogCommand(LogLevel.ERROR, infoHandler));

        // Execute all commands with specific messages
        System.out.println("Processing logs:");
        logger.executeCommands();
    }
}


