package qa.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.owner.config.MobileConfig;

import static org.assertj.core.api.Assertions.assertThat;

public class MobileTest {

    @Test
    public void TestMobile() {
        System.setProperty("device", "redmi-note-11");
        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
        assertThat(config.getPlatform()).isEqualTo("Android");
        assertThat(config.getDevice()).isEqualTo("Redmi Note 11");
        assertThat(config.getVersion()).isEqualTo("12");
    }

    @Test
    public void TestMobileWithSystemOverride() {
        System.setProperty("device", "iphone-13");
        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
        assertThat(config.getPlatform()).isEqualTo("IOS");
        assertThat(config.getDevice()).isEqualTo("Iphone 13 Pro Max");
        assertThat(config.getVersion()).isEqualTo("13");
    }
}
