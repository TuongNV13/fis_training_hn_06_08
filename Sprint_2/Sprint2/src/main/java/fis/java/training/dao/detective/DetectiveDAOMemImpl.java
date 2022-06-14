package fis.java.training.dao.detective;

import fis.java.training.model.Detective;

import java.util.List;
import java.util.Optional;

public class DetectiveDAOMemImpl implements IDetectiveDAO {

    @Override
    public Optional<Detective> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Detective> getAll() {
        return null;
    }

    @Override
    public void save(Detective detective) {

    }

    @Override
    public void update(Detective detective) {

    }

    @Override
    public void delete(Detective detective) {

    }
}
