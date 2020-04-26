package objects;

import java.util.ArrayList;
import java.util.Objects;

public class Hero {
    private String Name ;
     private int Age ;
     private String Superpower ;
     private String Weakness ;
    private static ArrayList<Hero> mInstances = new ArrayList<>();
    private int Id;
    private String squadAlliance;

    public Hero(String name, int age, String superpower, String weakness,Squad squad) {
        this.Name = name;
        this.Age = age;
        this.Superpower = superpower;
        this.Weakness = weakness;
        this.mInstances.add(this);
        this.Id = mInstances.size();
    }
    public void setSquadAlliance(Squad squad) {
        this.squadAlliance = squad.getSquad_Name();
    }


    public String getSquadAlliance() {
        return squadAlliance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return Objects.equals(Superpower, hero.Superpower) &&
                Objects.equals(Weakness, hero.Weakness);
    }

    public static ArrayList<Hero> getmInstances() {
        return mInstances;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Superpower, Weakness);
    }

    public String getName() {
        return Name;
    }

    public String getSuperpower() {
        return Superpower;
    }

    public int getAge() {
        return Age;
    }

    public String getWeakness() {
        return Weakness;
    }
    public static Hero find(int Id) {
            return mInstances.get(Id - 1);
    }

    public int getId() {
        return Id;
    }

    public static void clear(){
        mInstances.clear();
    }

}
