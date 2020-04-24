package objects;

public class Squad{
    private int Squad_serial;
    private String Squad_Name;
    private String  Leader;
    private String  Cause;
    private int Max ;

    public Squad(int squad_serial, String squad_Name, String leader,String Cause,int Max) {
        this.Squad_serial = squad_serial;
        this.Squad_Name = squad_Name;
        this.Leader = leader;
        this.Cause = Cause;
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
}