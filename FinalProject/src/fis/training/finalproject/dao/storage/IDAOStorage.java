package fis.training.finalproject.dao.storage;

import fis.training.finalproject.model.Storage;

public interface IDAOStorage {
    public void add(Storage storage);
    public Storage remove(int code);
    public Storage update(Storage storage);
}
