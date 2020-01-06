package com.rebiekong.tools;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author RebieKong
 */
@SpringBootApplication
@EnableScheduling
public class MainApp {

    public static void main(String... args) {
        new SpringApplicationBuilder(MainApp.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }
}
