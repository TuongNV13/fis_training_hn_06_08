package fis.java.training.dao.jdbc;

import fis.java.training.dao.criminal.IDAOCriminalCase;
import fis.java.training.model.CriminalCase;
import org.junit.jupiter.api.Test;

import java.util.List;

class JDBCCriminalCaseDAOTest {

    @Test
    void getAll() {
        //A1
        IDAOCriminalCase criminalCaseDAO = new JDBCCriminalCaseDAO();

        //A2
        List<CriminalCase> criminalCaseList = criminalCaseDAO.getAll();

        //A3: Assert
        System.out.println(criminalCaseList);
    }
}