package com.brentmoen.log4j;

import com.brentmoen.commons.logging.Logger;

public class Log4jLogger implements Logger {
    private final org.apache.logging.log4j.Logger logger;

    Log4jLogger(org.apache.logging.log4j.Logger logger) {
        this.logger = logger;
    }

    @Override
    public void debug(String message) {
        logger.debug(message);
    }

    @Override
    public void debug(String message, Throwable cause) {
        logger.debug(message, cause);
    }

    @Override
    public void info(String message) {
        logger.info(message);
    }

    @Override
    public void info(String message, Throwable cause) {
        logger.info(message, cause);
    }

    @Override
    public void warn(String message) {
        logger.warn(message);
    }

    @Override
    public void warn(String message, Throwable cause) {
        logger.warn(message, cause);
    }

    @Override
    public void error(String message) {
        logger.error(message);
    }

    @Override
    public void error(String message, Throwable cause) {
        logger.error(message, cause);
    }
}
