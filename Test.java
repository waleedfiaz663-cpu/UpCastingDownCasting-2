
public class Test {
    
    public static void main(String[] args){
        
        //UpCasting
        
        Employee E = new Developer();
        
        E.name="Waleed";
        
        System.out.println(E.name);
        
        E.Work();
        
        
        Employee e = new Manager();
        
        e.Work();
        
        
        
        
        
        System.out.println("");
        
        //DownCasting
        
        Developer D = (Developer)E;
        
        D.ProgrammingLanguage="OOP";
        
        System.out.println(D.ProgrammingLanguage);
        
        D.Work();
        
        D.WriteCode();
        
        System.out.println("");
        
        Manager M = (Manager)e;
        
        M.TeamMembers=135;
        
        System.out.println(M.TeamMembers);
        
        M.Work();
        
        M.ManageTeam();

        
    }
    
}
    

