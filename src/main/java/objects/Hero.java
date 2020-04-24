package objects;

import java.util.ArrayList;
import java.util.Objects;

public class Hero {
    private  int id;
    private String Name ;
     private int age ;
     private String Superpower ;
     private String Weakness ;
     private String Domain ;
     private String power_origin;
     private String Squad ;
    private static ArrayList<Hero> mInstances = new ArrayList<>();

    public Hero( int id ,String name, int age, String superpower, String weakness, String domain, String power_origin,String squad) {
        this.id = id ;
        this.Name = name;
        this.age = age;
        Superpower = superpower;
        Weakness = weakness;
        Domain = domain;
        this.power_origin = power_origin;
        this.Squad = squad;
        this.mInstances.add(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return Objects.equals(Superpower, hero.Superpower) &&
                Objects.equals(Weakness, hero.Weakness) &&
                Objects.equals(Domain, hero.Domain) &&
                Objects.equals(power_origin, hero.power_origin) &&
                Objects.equals(Squad, hero.Squad);
    }

    public static ArrayList<Hero> getmInstances() {
        return mInstances;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Superpower, Weakness, Domain, power_origin, Squad);
    }

    public String getName() {
        return Name;
    }

    public String getDomain() {
        return Domain;
    }

    public String getPower_origin() {
        return power_origin;
    }

    public String getSuperpower() {
        return Superpower;
    }

    public int getAge() {
        return age;
    }

    public String getWeakness() {
        return Weakness;
    }
}
