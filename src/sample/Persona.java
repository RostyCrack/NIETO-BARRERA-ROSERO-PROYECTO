package sample;

public class Persona {

    private String name;
    private String lastName;
    private String causeOfDeath;

    public Persona(){
        this.name = "N/A";
        this.lastName = "N/A";
        this.causeOfDeath = "N/A";
    }

    public Persona(String name, String lastName, String causeOfDeath){
        this.name = name;
        this.lastName = lastName;
        this.causeOfDeath = causeOfDeath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCauseOfDeath() {
        return causeOfDeath;
    }

    public void setCauseOfDeath(String causeOfDeath) {
        this.causeOfDeath = causeOfDeath;
    }
}
