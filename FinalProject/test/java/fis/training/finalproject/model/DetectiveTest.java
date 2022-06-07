package fis.training.finalproject.model;

import fis.training.finalproject.model.enums.EmploymentStatus;
import fis.training.finalproject.model.enums.Rank;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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
        person.setUserName("Huong");
        person.setFirstName("Hoai");
        person.setLastName("Tuong");

        Detective detective = new Detective(1L, person, "1", Rank.TRANEE, true,
                EmploymentStatus.ACTIVE);


        detectiveList.add(detective);

        return detectiveList;
    }
}