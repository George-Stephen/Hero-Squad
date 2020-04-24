package objects;

import java.util.ArrayList;

public class Squad{
    private int Squad_serial;
    private String Squad_Name;
    private String  Leader;
    private String  Cause;
    private static ArrayList<Squad> mInstances = new ArrayList<>();
    private int Max ;

    public Squad(int squad_serial, String squad_Name, String leader,String Cause,int Max) {
        this.Squad_serial = squad_serial;
        this.Squad_Name = squad_Name;
        this.Leader = leader;
        this.Cause = Cause;
        this.mInstances.add(this);
        this.Max = Max;
    }

    public int getSquad_serial() {
        return Squad_serial;
    }

    public String getLeader() {
        return Leader;
    }

    public String getSquad_Name() {
        return Squad_Name;
    }

    public static ArrayList<Squad> getmInstances() {
        return mInstances;
    }
}