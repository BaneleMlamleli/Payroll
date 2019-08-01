package service.race;

import domain.Race;
import service.Service;

import java.util.Set;

public interface RaceService extends Service<Race, Integer> {

    Set<Race> getAll();

}
