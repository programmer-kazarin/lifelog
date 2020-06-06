package com.kzrn;

import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try (InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream("app.properties")) {
            properties.load(input);
            System.out.println(properties.getProperty("token"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
