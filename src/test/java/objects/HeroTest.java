package objects;

import org.junit.Test;
import static org.junit.Assert.*;


public class HeroTest {

    @Test
    public void Hero_Present(){
        Squad squad = new Squad("new","war",12);
        Hero test = new Hero("Flash",25,"Superspeed", "frost",squad);
        assertEquals("Flash",test.getName());
    }
    @Test
    public void Hero_Age(){
        Squad squad = new Squad("new","war",12);
        Hero test = new Hero("Flash",25,"Superspeed", "frost",squad);
        assertEquals(25,test.getAge());
    }
    @Test
    public void Hero_power(){
        Squad trial = new Squad("new","war",12);
        Hero test = new Hero("Flash",25,"Superspeed", "frost",trial);
        assertEquals("Superspeed",test.getSuperpower());
    }
    @Test
    public void Hero_weakness(){
        Squad tests = new Squad("soon","war",12);
        Hero test = new Hero("Flash",25,"Superspeed", "frost",tests);
        assertEquals("frost",test.getWeakness());
    }

}