package qa.owner.config;

import org.aeonbits.owner.Config;

import java.util.List;

public interface FruitsConfig extends Config {

    @Key("array")
    String[] getFruitsArray();

    @Key("list")
    List<String> getFruitsList(); //todo check combinations and returning list

    @Key("array-with-default-values")
    @DefaultValue("strawberry,apple")
    String[] getFruitsArrayWIthDefaultValue();

    @Key("list-with-separator") //, - default
    @Separator(";")
    @DefaultValue("banana;lemon")
    List<String> getFruitsArrayWIthSeparator();
}
