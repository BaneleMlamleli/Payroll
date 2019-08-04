package cput.ac.za.repository.demography;

import cput.ac.za.domain.demography.Race;
import cput.ac.za.factory.demography.RaceFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceRepositoryTest {

    RaceRepository repository;
    Race race;

    @Before
    public void setUp() throws Exception {
        repository = RaceRepository.getRepository();
        race = RaceFactory.buildRace("213058553"
                , "Human race");
    }

    @Test
    public void getRepository() {
        assertNotNull(repository);
        System.out.println(repository);
    }

    @Test
    public void getAll() {
        repository.create(race); //created again because it get Deleted
        assertNotNull(repository.getAll());
        System.out.println(repository.getAll());
    }

    @Test
    public void create() {
        repository.create(race);
        assertNotNull(repository.read(race.getEmpNumber()));
        System.out.println("Created\n" + repository.read("213058553"));
    }

    @Test
    public void read() {

        assertNotNull(repository.read(race.getEmpNumber()));
        System.out.println("Read\n" + repository.read("213058553")); //id delete Test is enabled this test will come back as Error
    }
    @Test
    public void update() {

        Race raceUpdate =RaceFactory.buildRace("213058553"
                , "Updated");
        repository.update(raceUpdate);
        System.out.println(repository.read("213058553"));
    }

    @Test
    public void delete() {
        repository.delete(race.getEmpNumber());
        assertNull(repository.read("213058553"));
        System.out.println("Deleted\n" + repository.read("213058553"));
    }
}