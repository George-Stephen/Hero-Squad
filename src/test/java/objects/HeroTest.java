package objects;

import org.junit.Test;
import static org.junit.Assert.*;


public class HeroTest {

    @Test
    public void Hero_Present(){
        Hero test = new Hero("Flash",25,"Superspeed","frost","Central city","lightning");
        assertEquals("Flash",test.getName());
    }
    @Test
    public void Hero_Age(){
        Hero test = new Hero("Flash",25,"Superspeed","frost","Central city","lightning");
        assertEquals(25,test.getAge());

    }
    @Test
    public void Hero_power(){
        Hero test = new Hero("Flash",25,"Superspeed","frost","Central city","lightning");
        assertEquals("Superspeed",test.getSuperpower());

    }
    @Test
    public void Hero_weakness(){
        Hero test = new Hero("Flash",25,"Superspeed","frost","Central city","lightning");
        assertEquals("frost",test.getWeakness());

    }

}