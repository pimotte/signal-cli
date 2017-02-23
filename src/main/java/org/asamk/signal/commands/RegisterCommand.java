package org.asamk.signal.commands;

import java.io.IOException;

import org.asamk.signal.Manager;

import net.sourceforge.argparse4j.inf.Namespace;

public class RegisterCommand extends AbstractCommand {
    public RegisterCommand(Namespace namespace, Manager manager) {
        super(namespace, manager);
    }

    @Override
    public boolean execute() {
        if (!manager.userHasKeys()) {
            manager.createNewIdentity();
        }
        try {
            manager.register(namespace.getBoolean("voice"));
        } catch (IOException e) {
            throw new CommandException("Request verify error: " + e.getMessage(), e);
        }
        
        return true;
    }

}
