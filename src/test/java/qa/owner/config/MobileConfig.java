package qa.owner.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE) //FIRST instead merge to take from first source
@Config.Sources({"classpath:android.properties",
        "classpath:${device}.properties"})

public interface MobileConfig extends Config {


    @Config.Key("platform.name")
    String getPlatform();

    @Config.Key("device.name")
    String getDevice();

    @Config.Key("platform.version")
    String getVersion();


}
