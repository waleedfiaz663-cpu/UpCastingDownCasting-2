
public class Employee {
    
    String name;
    
    public void Work(){
        
        System.out.println("Employee is Working");
        
    }
    
}

class Developer extends Employee {
    
    String ProgrammingLanguage;
    
    @Override
    
    public void Work(){
        
        System.out.println("Developer is Developing Software");
        
    }
    
    public void WriteCode(){
        
        System.out.println("Developer is Writing Code ");
        
    }   
}

class Manager extends Employee {
    
      int TeamMembers;
    
    @Override
    
    public void Work(){
        
        System.out.println("Manager is Working");
        
    }
    
    public void ManageTeam(){
        
        System.out.println("Manager is Managing Team Members");
        
    }
}
