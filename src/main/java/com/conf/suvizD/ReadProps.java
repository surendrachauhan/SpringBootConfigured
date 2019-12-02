package com.conf.suvizD;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by surviz on 2019/12/03.
 */
@Component
public class ReadProps implements CommandLineRunner {

    @Value("${url}")
    private String url;

    @Value("${url2}")
    private String url2;

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Property of url*****"+url);

        System.out.println("Property of url2*****"+url2);

    }
}
