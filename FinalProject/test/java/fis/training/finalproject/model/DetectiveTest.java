package fis.training.finalproject.model;

import fis.training.finalproject.model.enums.EmploymentStatus;
import fis.training.finalproject.model.enums.Rank;
<<<<<<< Updated upstream
import org.junit.Test;
=======
import org.junit.jupiter.api.Test;
>>>>>>> Stashed changes

import java.util.ArrayList;
import java.util.List;

<<<<<<< Updated upstream
import static org.junit.Assert.assertEquals;
=======
import static org.junit.jupiter.api.Assertions.*;
>>>>>>> Stashed changes

public class DetectiveTest {

    @Test
    public void testConstructor(){
        //Arrange
        Detective detective = new Detective(1L, null, "1", Rank.TRANEE, true,
                EmploymentStatus.ACTIVE);

        //Action
        long id = detective.getId();

        //Assert
        assertEquals(1L, id);
    }

    public static List<Detective> create3Detective(){
        List<Detective> detectiveList = new ArrayList<>();
        //Dummy Data
        Person person = new Person();
<<<<<<< Updated upstream
        person.setUserName("TuongNV");
        person.setFirstName("Hien");
        person.setLastName("Thanh Mai");
=======
        person.setUserName("phuocnt");
        person.setFirstName("Phuoc");
        person.setLastName("Nguyen Thanh");
>>>>>>> Stashed changes

        Detective detective = new Detective(1L, person, "1", Rank.TRANEE, true,
                EmploymentStatus.ACTIVE);


        detectiveList.add(detective);

        return detectiveList;
    }
}