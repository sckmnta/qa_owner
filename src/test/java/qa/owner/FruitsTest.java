package qa.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.owner.config.FruitsConfig;

import static org.assertj.core.api.Assertions.assertThat;


public class FruitsTest {

    @Test
    public void testArray(){
        System.setProperty("array","strawberry,apple");

        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());

        assertThat(config.getFruitsArray())
                .containsExactly("strawberry", "apple");
    }

    @Test
    public void testList(){
        System.setProperty("list", "strawberry,apple,orange");

        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());

        assertThat(config.getFruitsList())
                .containsExactly("strawberry", "apple", "orange");
    }

    @Test
    public void testArrayWithDefaultValues() {

        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());

        assertThat(config.getFruitsArrayWIthDefaultValue())
                .containsExactly("strawberry", "apple");
    }

    @Test
    public void testArrayWithSeparator() {

        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());

        assertThat(config.getFruitsArrayWIthSeparator())
                .containsExactly("banana", "lemon");
    }
}
