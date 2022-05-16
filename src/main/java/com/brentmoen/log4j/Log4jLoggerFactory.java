package com.brentmoen.log4j;

import com.brentmoen.commons.logging.Logger;
import com.brentmoen.commons.logging.LoggerFactory;
import org.apache.logging.log4j.LogManager;

public class Log4jLoggerFactory implements LoggerFactory {
    @Override
    public Logger create(Class<?> category) {
        return new Log4jLogger(LogManager.getLogger(category));
    }
}
