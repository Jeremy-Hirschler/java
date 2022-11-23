class Project {
    private String name;
    private String description;
    private double initialCost;
    //set a default for fields in constructor
    //need to overload
    public Project(){
        this("My Project", "The best you've ever seen!", 100.58);
    }

    public Project(String name){
        this.name = name;
    }

    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }

    public Project(String name, String description, double initialCost){
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }

    //getters and setters
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public double getCost(){
        return initialCost;
    }

    public void setCost(double cost){
        this.initialCost = cost;
    }
}