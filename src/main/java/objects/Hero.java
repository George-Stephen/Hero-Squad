package objects;

import java.util.Objects;

public class Hero {
     private String name ;
     private int age ;
     private String Superpower ;
     private String Weakness ;
     private String Domain ;
     private String power_origin;
     private String squad ;

    public Hero(String name, int age, String superpower, String weakness, String domain, String power_origin,String squad) {
        this.name = name;
        this.age = age;
        Superpower = superpower;
        Weakness = weakness;
        Domain = domain;
        this.power_origin = power_origin;
        this.squad = squad;
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
                Objects.equals(squad, hero.squad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Superpower, Weakness, Domain, power_origin, squad);
    }

    public String getName() {
        return name;
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
