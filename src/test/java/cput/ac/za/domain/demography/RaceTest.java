package cput.ac.za.domain.demography;

import cput.ac.za.factory.demography.RaceFactory;
import cput.ac.za.repository.demography.RaceRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceTest {

    private RaceRepository RaceRepository;
    private Race race;
    @Before
    public void setUp() throws Exception {
        RaceRepository = cput.ac.za.repository.demography.RaceRepository.getRepository();

        race = RaceFactory.buildRace("213058553", "Human race");
    }

    @Test
    public void getEmpNumber() {
        assertNotNull(race.getEmpNumber());
        System.out.println(race.getEmpNumber());
    }

    @Test
    public void getRace() {
        assertNotNull(race.getRace());
        System.out.println(race.getRace());
    }
}