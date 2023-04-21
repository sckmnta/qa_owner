package qa.owner.config;


import org.aeonbits.owner.Config;

import java.io.File;
import java.net.URL;
import java.nio.file.Path;

public interface TypeConfig extends Config {

    @Key("integer")
    Integer getInteger();

    @Key("double")
    Double getDouble();

    @Key("boolean")
    Boolean getBoolean();

    @Key("enum")
    Browser getEnum();

    @Key("file")
    File getFile(); //todo

    @Key("url")
    URL getUrl(); //todo

    @Key("byte")
    byte[] getByte(); //todo

    @Key("path")
    Path getPath(); //todo


}
