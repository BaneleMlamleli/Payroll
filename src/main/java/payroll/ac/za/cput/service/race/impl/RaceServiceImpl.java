package service.race.impl;

import domain.Race;
import repository.race.RaceRepository;
import repository.race.impl.RaceRepositoryImpl;
import service.race.RaceService;

import java.util.Set;

public class RaceServiceImpl implements RaceService {



    private RaceServiceImpl service = null;
    private RaceRepository repository;

    public RaceServiceImpl() {
        repository = RaceRepositoryImpl.getRaceRepository();
    }

    public RaceServiceImpl getService(){

        if(service == null){
            return new RaceServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Race> getAll() {
        return repository.getAll();
    }

    @Override
    public Race create(Race race) {
        return repository.create(race);
    }

    @Override
    public Race read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public Race update(Race race) {
        return repository.update(race);
    }

    @Override
    public void delete(Integer integer) {
        repository.delete(integer);
    }
}
