package fis.training.finalproject.dao.detective;

import fis.training.finalproject.model.Detective;
import fis.training.finalproject.model.DetectiveTest;
<<<<<<< Updated upstream
import org.junit.Test;
=======
import org.junit.jupiter.api.Test;
>>>>>>> Stashed changes

import java.util.List;
import java.util.function.Consumer;

<<<<<<< Updated upstream
import static org.junit.Assert.*;
=======
import static org.junit.jupiter.api.Assertions.*;
>>>>>>> Stashed changes

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

<<<<<<< Updated upstream
        assertEquals("Hien", detective.getPerson().getFirstName());
        assertNotEquals("Hiem", detective.getPerson().getFirstName());
=======
        assertEquals("Phuoc", detective.getPerson().getFirstName());
        assertNotEquals("Phuc", detective.getPerson().getFirstName());
>>>>>>> Stashed changes

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
<<<<<<< Updated upstream
        assertEquals("TuongNV", detective.getPerson().getFirstName());
=======
        assertEquals("Phuoc", detective.getPerson().getFirstName());
>>>>>>> Stashed changes

        assertEquals(numOfDetective - 1, iDetectiveDAO.getAll().size());

        detective = iDetectiveDAO.remove(2L);
        assertNull(detective);
    }
}