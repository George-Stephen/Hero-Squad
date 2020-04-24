package objects;

public class Hero {
     private String name ;
     private int age ;
     private String Superpower ;
     private String Weakness ;
     private String Domain ;
     private String power_origin;

    public Hero(String name, int age, String superpower, String weakness, String domain, String power_origin) {
        this.name = name;
        this.age = age;
        Superpower = superpower;
        Weakness = weakness;
        Domain = domain;
        this.power_origin = power_origin;
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
