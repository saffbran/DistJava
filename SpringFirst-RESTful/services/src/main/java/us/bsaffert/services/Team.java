package us.bsaffert.services;

@Entity
public class Team {
    @Id
    private String name;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setCityName(String location) {
        this.location = location;
    }
}
