package qa.owner.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/secret.properties",
        "classpath:secret.properties"
})

public interface SecretConfig extends Config {
    @Key("username")
    String username();

    @Key("password")
    String password();

}
