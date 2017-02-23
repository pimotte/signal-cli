package org.asamk.signal.commands;

public class CommandException extends RuntimeException {
    private static final long serialVersionUID = 1L;
   
    public CommandException(String message) {
        super(message);
    }
    
    public CommandException(String message, Exception cause) {
        super(message, cause);
    }

}
