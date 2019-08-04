package cput.ac.za.factory.demography;

import cput.ac.za.domain.demography.Race;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    Race race;
    @Before
    public void setUp() throws Exception {
       race  = RaceFactory.buildRace("213058553", "Human race");
    }

    @Test
    public void buildRace() {
        assertNotNull(race);
        System.out.println(race);
    }
}