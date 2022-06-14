package fis.java.training.dao.evidence;

import fis.java.training.model.Evidence;

import java.util.List;
import java.util.Optional;

public class DAOEvidenceMemImpl implements IDAOEvidence {

    @Override
    public Optional<Evidence> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Evidence> getAll() {
        return null;
    }

    @Override
    public void save(Evidence evidence) {

    }

    @Override
    public void update(Evidence evidence) {

    }

    @Override
    public void delete(Evidence evidence) {

    }
}
