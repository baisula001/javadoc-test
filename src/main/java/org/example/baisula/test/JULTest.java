package org.example.baisula.test;

import org.testng.annotations.Test;

import java.util.logging.Logger;

/**
 * @Auther: willson2008
 * @Date: 16/02/2024 - 02 - 16 - 13:44
 * @Description: org.example
 * @Version: 1.0
 */
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
    }

}
