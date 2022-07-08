package models;

public class EquiposModel {

    private int id;
    private String name;
    private String trainer;

    public EquiposModel(int id, String name, String trainer) {
        this.id = id;
        this.name = name;
        this.trainer = trainer;
    }
    
    public EquiposModel(String name) {
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return (this.id + " - " + this.getName() + " - " + this.getTrainer());
    }

}
