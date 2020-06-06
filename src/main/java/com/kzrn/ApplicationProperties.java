package com.kzrn;

import javax.servlet.ServletContext;
import java.io.InputStream;
import java.util.Properties;

public class ApplicationProperties {
    private Properties properties = new Properties();

    public ApplicationProperties(ServletContext context) {
        try (InputStream input = context.getResourceAsStream("/WEB-INF/classes/app.properties")) {
            properties.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String propertyName) {
        return properties.getProperty(propertyName);
    }
}
