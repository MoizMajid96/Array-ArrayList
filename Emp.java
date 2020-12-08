class Emp{
    
    // Class Fields
    private int ID;
    private String Name;

    
    // Default Ctor
    public Emp(){
        System.out.println("Ctor Called!");
    }
    
    // Parameterize Ctor
    public Emp(int ID, String Name){
        
        // Current class ka context hai
        this.Name = Name;
        this.ID = ID;
    }
    
    
    public void Display(){

        System.out.println("Id : "+ID);
        System.out.println("Name : "+Name);
    }
    
    void SetName(String Name){
        this.Name = Name;
    }
    
    String GetName(){
        return Name;
    }
    
    
}