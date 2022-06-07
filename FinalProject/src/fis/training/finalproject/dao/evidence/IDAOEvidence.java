package fis.training.finalproject.dao.evidence;

import fis.training.finalproject.model.Evidence;

public interface IDAOEvidence {
    public void add(Evidence evidence);
    public Evidence remove(int code);
    public Evidence update(Evidence evidence);
}
