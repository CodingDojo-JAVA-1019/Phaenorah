public class Project {
    private String name;
    private String description;

    public void elevatorPitch() {
        System.out.println("The project name is: " + this.name + " Description is: " + this.description ); 
    }
    public Project() {
    }
    public Project(String name) {
        
        this.name = name;
    }
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
      
    