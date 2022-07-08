package models;

public class PartidosModel implements Comparable<PartidosModel> {
    private int id;
    private String date;
    private EquiposModel local_team;
    private EquiposModel visiting_team;
    private int local_goals;
    private int visiting_goals;
    
    public PartidosModel(String date, EquiposModel local_team, EquiposModel visiting_team, int local_goals, int visiting_goals) {
        this.date = date;
        this.local_team = local_team;
        this.visiting_team = visiting_team;
        this.local_goals = local_goals;
        this.visiting_goals = visiting_goals;
    }

    public PartidosModel(int id, String date, EquiposModel local_team, EquiposModel visiting_team, int local_goals, int visiting_goals) {
        this.id = id;
        this.date = date;
        this.local_team = local_team;
        this.visiting_team = visiting_team;
        this.local_goals = local_goals;
        this.visiting_goals = visiting_goals;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public EquiposModel getLocalTeam() {
        return local_team;
    }

    public void setLocalTeam(EquiposModel local_team) {
        this.local_team = local_team;
    }
    
    public EquiposModel getVisitingTeam() {
        return visiting_team;
    }

    public void setVisitingTeam(EquiposModel visiting_team) {
        this.visiting_team = visiting_team;
    }
    
    public int getLocalGoals() {
        return local_goals;
    }

    public void setLocalGoals(int local_goals) {
        this.local_goals = local_goals;
    }
    
    public int getVisitingGoals() {
        return visiting_goals;
    }

    public void setVisitingGoals(int visiting_goals) {
        this.visiting_goals = visiting_goals;
    }
    
    @Override
    public int compareTo(PartidosModel p) {
            return this.getDate().compareTo(p.getDate());
    }

    @Override
    public String toString() {
        return (this.getDate() + " " + this.getLocalTeam().getName() + " ( " + this.getLocalGoals() + " ) VS ( " + this.getVisitingGoals() + " ) " + this.getVisitingTeam().getName());
    }
    
    
}
