package fis.training.finalproject.dao.person;

import fis.training.finalproject.model.Person;

public interface IDAOPerson {
    public void add(Person person);
    public Person remove(int code);
    public Person update(Person person);
}
