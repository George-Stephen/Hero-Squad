package objects;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {

    @Test
    public void getSquad_serial() {
        Squad trial = new Squad(011,"Justice League","Batman","Justice",15);
        assertEquals(011,trial.getSquad_serial());
    }

    @Test
    public void getLeader() {
        Squad trial = new Squad(011,"Justice League","Batman","Justice",15);
        assertEquals("Batman",trial.getLeader());
    }

    @Test
    public void getSquad_Name() {
        Squad trial = new Squad(011,"Justice League","Batman","Justice",15);
        assertEquals("Justice League",trial.getSquad_Name());
    }


}