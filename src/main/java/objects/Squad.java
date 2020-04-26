package objects;

import java.util.ArrayList;
import java.util.List;


public class Squad{
    private int id;
    private String Squad_Name;
    private String  Cause;
    private static ArrayList<Squad> mInstances = new ArrayList<>();
    private List<Hero> heroMembers = new ArrayList<>();
    private int Max ;
    private List<Hero> heroes;
    private boolean isSquadFull = false;

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
    public static Squad find(int id) {
        return mInstances.get(id - 1);
    }

    public List<Hero> getHeroes() {
        return heroes;
    }

    public  void addMembers(Hero hero) {
        if (heroMembers.size() >= 3) {
            isSquadFull = true;
        } else {
            heroMembers.add(hero);
        }
    }

}