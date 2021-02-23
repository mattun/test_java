package jp.sample;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) throws IOException {
        final ScrapeService scrapeService = new ScrapeService();
        System.out.println(scrapeService.getTitle());

        Logger logger = LoggerFactory.getLogger(Main.class);
        logger.info("Hello Logback!!");
    }
}