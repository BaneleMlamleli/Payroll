package factory;

import domain.Race;
import org.junit.Assert;
import org.junit.Test;
import service.race.RaceService;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    @Test
    public void buildRace() {

        Race race = RaceFactory.buildRace(1, "African");
        Assert.assertNotNull(race);


    }
}