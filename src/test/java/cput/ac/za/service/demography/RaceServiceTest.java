package cput.ac.za.service.demography;

import cput.ac.za.domain.demography.Race;
import cput.ac.za.factory.demography.RaceFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceServiceTest {

    RaceService service;
    Race race;

    @Before
    public void setUp() throws Exception {
        service = RaceService.getService();
        race = RaceFactory.buildRace("213058553"
                , "Human race");
    }

    @Test
    public void getService() {
        assertNotNull(service);
        System.out.println(service);
    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
        service.create(race);
        assertNotNull(service.read("213058553"));
        System.out.println("Created\n" + service.read("213058553"));
    }

    @Test
    public void read() {
        assertNotNull(service.read("213058553"));
        System.out.println("Read\n"+ service.read("213058553"));
    }

    @Test
    public void update() {
        service.create(race); //Because value gets deleted
        System.out.println(service.read("213058553"));

        Race genderUpdated = RaceFactory.buildRace("213058553", "Updated");
        service.update(genderUpdated);
        Race g = service.read("213058553");
        assertNotEquals(race.getRace(), g.getRace());
        System.out.println("Updated\n"+service.read("213058553"));
    }

    @Test
    public void delete() {
        service.delete("213058553");
        assertNull(service.read(race.getEmpNumber()));
        System.out.println("Delete\n"+service.read(race.getEmpNumber()));
    }
}