package objects;

import java.util.ArrayList;
import java.util.List;


public class Squad{
    private int id;
    private String Squad_Name;
    private String  Cause;
    private static ArrayList<Squad> mInstances = new ArrayList<>();
    private int Max ;
    private List<Hero> heroes;

    public Squad( String squad_Name, String cause,int max) {
        this.Squad_Name = squad_Name;
        this.Cause = cause;
        this.Max = max;
        this.mInstances.add(this);
        id = mInstances.size();
        heroes = new ArrayList<Hero>();
    }

    public String getSquad_Name() {
        return Squad_Name;
    }

    public static ArrayList<Squad> getmInstances() {
        return mInstances;
    }
    public List<Hero> getHeroes() {
        return heroes;
    }
    public void addHero(Hero hero) {
        heroes.add(hero);
    }
}