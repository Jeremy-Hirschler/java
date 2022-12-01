class ProjectTest{
    public static void main(String[] args){
        //default constructor
        Project elevatorPitch = new Project();
        String pName = elevatorPitch.getName();
        String pDesc = elevatorPitch.getDescription();
        double pCost = elevatorPitch.getCost();
        System.out.println(String.format("%s ($%s): %s", pName, pCost, pDesc));

        //constructor with name
        Project projectWithName = new Project("Spear Break");
        String namedProject = projectWithName.getName();
        projectWithName.setDescription("Now, Starlight Kick!");
        String namedDesc = projectWithName.getDescription();
        projectWithName.setCost(200.14);
        double namedCost = projectWithName.getCost();
        System.out.println(String.format("%s ($%s): %s", namedProject, namedCost, namedDesc));

        //constructor with name and desc
        Project nameAndDesc = new Project("Air Fang", "One, Two, Cross Impact", 500.12);
        nameAndDesc.setName("Mag Storm instead");
        String fullName = nameAndDesc.getName();
        String fullDesc = nameAndDesc.getDescription();
        double fullCost = nameAndDesc.getCost();
        System.out.println(String.format("%s ($%s): %s", fullName, fullCost, fullDesc));

        //Portfolio
        Portfolio productPortfolio = new Portfolio();
        productPortfolio.AddToPortfolio(elevatorPitch);
        productPortfolio.AddToPortfolio(nameAndDesc);
        System.out.println(productPortfolio.getPortfolio());
        productPortfolio.showPortfolio();
    }
}