package org.bonn.se.ws18.midterm.commands;

import org.bonn.se.ws18.midterm.model.Container;

public class StoreCommand implements Command {

    public void execute() {
        Container container = Container.getInstance();
        container.store();

    }

}
