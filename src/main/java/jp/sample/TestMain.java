package jp.sample;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMain {
    public static void main(String[] args) throws IOException {
        final ScrapeService scrapeService = new ScrapeService();
        System.out.println(scrapeService.getTitle());

        Logger logger = LoggerFactory.getLogger(TestMain.class);
        logger.info("Hello Logback!!");

        System.out.println("TEST LOG");
    }
}