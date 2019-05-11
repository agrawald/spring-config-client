package au.com.mayi;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("test")
public class TestProperties {
    private String message;

    public String getMessage() {
        return this.message;
    }

    public void setMessage(final String message) {
        System.out.println("Message: " + message);
        this.message = message;
    }
}
