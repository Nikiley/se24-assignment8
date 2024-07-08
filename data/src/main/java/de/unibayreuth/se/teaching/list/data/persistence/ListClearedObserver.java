package de.unibayreuth.se.teaching.list.data.persistence;

import de.unibayreuth.se.teaching.list.data.pattern.Observer;
import de.unibayreuth.se.teaching.list.data.pattern.Subject;
import java.util.logging.Logger;

public class ListClearedObserver implements Observer {
    Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public ListClearedObserver() {}

    @Override
    public void update(Subject subject){
        logger.info("List cleared!");
    }
}
