package com.whaim;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * Created by whaim on 2017/6/26.
 */

@Component
public class MessageQueueThread extends Thread {

    @Autowired
    private MessageQueueManager mqm;

    private static Logger logger = LoggerFactory.getLogger(MessageQueueThread.class);

    @Override
    public void run() {
        super.run();

        logger.info(">>>>>MQ listener started<<<<");

        mqm.init();

    }
}