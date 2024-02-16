package org.example.baisula.test;

import org.testng.annotations.Test;

import java.util.logging.Logger;


public class JULTest {

    @Test
    public void testQuick()throws Exception{
        Logger logger = Logger.getLogger("org.example.JULTest");

        logger.info("hello JUL");
        logger.info("hello JUL");
        logger.info("hello JUL");
        logger.info("hello JUL");
        logger.info("hello JUL");
        logger.info("hello JUL");
        logger.info("hello JUL");
        logger.info("hello JUL");
        logger.info("hello JUL");
    }

}
