package service.gender;

import domain.Gender;
import service.Service;

import java.util.Set;

public interface GenderService extends Service<Gender, Integer> {

    Set<Gender> getAll();

}
