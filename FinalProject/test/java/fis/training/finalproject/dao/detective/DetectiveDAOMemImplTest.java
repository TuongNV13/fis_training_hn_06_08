package fis.training.finalproject.dao.detective;

import fis.training.finalproject.model.Detective;
import fis.training.finalproject.model.DetectiveTest;
import org.junit.Test;

import java.util.List;
import java.util.function.Consumer;

import static org.junit.Assert.*;

class DetectiveDAOMemImplTest {
    @Test
    void get() {
        IDetectiveDAO iDetectiveDAO = DetectiveDAOMemImpl.getInstance();

        List<Detective> list = DetectiveTest.create3Detective();
        list.stream().forEach(new Consumer<Detective>() {
            @Override
            public void accept(Detective detective) {
                iDetectiveDAO.add(detective);
            }
        });

        Detective detective = iDetectiveDAO.get(1L);

        assertEquals("Hien", detective.getPerson().getFirstName());
        assertNotEquals("Hiem", detective.getPerson().getFirstName());

        detective = iDetectiveDAO.get(2L);
        assertNull(detective);
    }

    @Test
    void remove(){
        IDetectiveDAO iDetectiveDAO = DetectiveDAOMemImpl.getInstance();

        List<Detective> list = DetectiveTest.create3Detective();
        list.stream().forEach(new Consumer<Detective>() {
            @Override
            public void accept(Detective detective) {
                iDetectiveDAO.add(detective);
            }
        });

        int numOfDetective = iDetectiveDAO.getAll().size();

        Detective detective = iDetectiveDAO.remove(1L);

        assertNotNull(detective);
        assertEquals("TuongNV", detective.getPerson().getFirstName());

        assertEquals(numOfDetective - 1, iDetectiveDAO.getAll().size());

        detective = iDetectiveDAO.remove(2L);
        assertNull(detective);
    }
}