package org.asamk.signal.commands;

import java.io.IOException;

import org.asamk.signal.Manager;

import net.sourceforge.argparse4j.inf.Namespace;

public class UnregisterCommand extends AbstractCommand {
    public UnregisterCommand(Namespace namespace, Manager manager) {
        super(namespace, manager);
    }

    @Override
    public boolean execute() {
        if (!manager.isRegistered()) {
            throw new CommandException("User is not registered.");
        }
        
        try {
            manager.unregister();
        } catch (IOException e) {
            System.err.println("Unregister error: " + e.getMessage());
        }
        
        return true;
    }

}
