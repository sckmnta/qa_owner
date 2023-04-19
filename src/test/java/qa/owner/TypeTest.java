package qa.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.owner.config.Browser;
import qa.owner.config.TypeConfig;
import static org.assertj.core.api.Assertions.assertThat;

public class TypeTest {

    @Test
    public void testInteger() {
        System.setProperty("integer", "10");
        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getInteger()).isEqualTo(10);
    }

    @Test
    public void testDouble() {
        System.setProperty("double", "10.01");
        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getDouble()).isEqualTo(10.01);
    }

    @Test
    public void testBoolean() {
        System.setProperty("boolean", "true");
        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getBoolean()).isEqualTo(true);
    }

    @Test
    public void testEnum() {
        System.setProperty("enum", "FIREFOX");
        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getEnum()).isEqualTo(Browser.FIREFOX);
    }
@Test
    public void testFile() {
        System.setProperty("file", "exmpl.jpg");
        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getFile()).isEqualTo("exmpl.jpg"); // different expectations, does not work
    }

    @Test
    public void testUrl() {
        System.setProperty("url", "https://github.com");
        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getUrl()).isEqualTo("https://github.com"); // does not work
    }
}
//todo files, url, byte, path