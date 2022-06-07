package fis.training.finalproject.dao.criminal;

import fis.training.finalproject.model.CriminalCase;

public interface IDAOCriminal {
    public void add(CriminalCase criminalCase);
    public CriminalCase remove(int code);
    public CriminalCase update(CriminalCase criminalCase);

}
