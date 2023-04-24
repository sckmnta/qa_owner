package qa.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.owner.config.SecretConfig;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

public class AuthTest {

    @Test

    public void authClasspath() {

        SecretConfig config = ConfigFactory.create(SecretConfig.class, System.getProperties());
        assertThat(config.username()).isEqualTo("autotest");
        assertThat(config.password()).isEqualTo("autotest");

    }

    @Test

    public void authWithSecretFile() throws Exception {
        String content = "username=secret-user\npassword=secret-pass";
        Path secret = Paths.get("/secret.properties");
        Files.write(secret, content.getBytes(StandardCharsets.UTF_8));
        SecretConfig config = ConfigFactory.create(SecretConfig.class, System.getProperties());
        assertThat(config.username()).isEqualTo("secret-user");
        assertThat(config.password()).isEqualTo("secret-pass");
        Files.delete(secret);


    }


}
