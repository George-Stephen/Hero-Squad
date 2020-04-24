package objects;

import org.junit.Test;
import static org.junit.Assert.*;


public class HeroTest {

    @Test
    public void Hero_Present(){
        Hero test = new Hero(001,"Flash",25,"Superspeed","frost","Central city","lightning","Justice League");
        assertEquals("Flash",test.getName());
    }
    @Test
    public void Hero_Age(){
        Hero test = new Hero(001,"Flash",25,"Superspeed","frost","Central city","lightning","Justice League");        assertEquals(25,test.getAge());
        assertEquals(25,test.getAge());
    }
    @Test
    public void Hero_power(){
        Hero test = new Hero(001,"Flash",25,"Superspeed","frost","Central city","lightning","Justice League");        assertEquals("Superspeed",test.getSuperpower());
        assertEquals("Superspeed",test.getSuperpower());
    }
    @Test
    public void Hero_weakness(){
        Hero test = new Hero(001,"Flash",25,"Superspeed","frost","Central city","lightning","Justice League");        assertEquals("frost",test.getWeakness());
        assertEquals("Frost",test.getWeakness());
    }

}