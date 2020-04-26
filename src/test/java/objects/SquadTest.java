package objects;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {


    @Test
    public void getSquad_Name() {
        Squad trial = new Squad("Justice League","Justice",15);
        assertEquals("Justice League",trial.getSquad_Name());
    }


}