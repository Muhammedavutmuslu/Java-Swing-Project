
package swingproject;

import java.io.*;


public class GoalKeeper extends Footballer implements Serializable{
    
    private int concede;
    
     public GoalKeeper(String name, String surname, String nationality, int age, int fee,
            String league, String team, int concede) {
        
         super(name,surname, nationality, age, fee, league, team);
         
         this.concede=concede;
    }

    
    
     

    public int getConcede() {
        return concede;
    }

    public void setConcede(int concedegoal) {
        this.concede = concedegoal;
    }
    
   
    
    
    
}