package de.quoss.test.log.producer.log4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4jLogMsgProducer {

    private static final Logger LOGGER = LogManager.getLogger(Log4jLogMsgProducer.class);

    private static final String LOG_MSG_FMT = "Log4j Logger %s message";

    private Log4jLogMsgProducer() {}

    public static void run() {
        LOGGER.trace(String.format(LOG_MSG_FMT, "Trace"));
        LOGGER.debug(String.format(LOG_MSG_FMT, "Debug"));
        LOGGER.info(String.format(LOG_MSG_FMT, "Info"));
        LOGGER.warn(String.format(LOG_MSG_FMT, "Warn"));
        LOGGER.error(String.format(LOG_MSG_FMT, "Error"));
        LOGGER.fatal(String.format(LOG_MSG_FMT, "Fatal"));
    }

}
