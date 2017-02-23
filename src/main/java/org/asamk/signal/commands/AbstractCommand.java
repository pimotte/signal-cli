package org.asamk.signal.commands;

import org.asamk.signal.Manager;

import net.sourceforge.argparse4j.inf.Namespace;

public abstract class AbstractCommand {
    protected Namespace namespace;
    protected Manager manager;
    
    public AbstractCommand (Namespace namespace, Manager manager) {
        this.namespace = namespace;
        this.manager = manager;
    }
    public abstract boolean execute();
}
