package qa.owner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import qa.owner.config.WebDriverProvider;

import static org.junit.jupiter.api.Assertions.*;

public class WebDriverTest {
    private WebDriver driver;

    @BeforeEach
    public void startDriver(){
        driver = new WebDriverProvider().get();
    }

    @Test
    public void testGitHub() {
        String title = driver.getTitle();
        assertEquals(title, "GitHub: Let’s build from here · GitHub"); // error: unmappable character (0x92) for encoding UTF-8

    }
    @AfterEach
    public void closeDriver(){
        driver.close();
    }

}
