
package swingproject;
import java.io.*;



public class ActivePlayer extends Footballer implements Serializable{
    
    private int goal;
    private int assist;
    private String rundistance;
    private final Object position;
    
    public ActivePlayer(String name, String surname, String nationality, int age, int fee,
            String league, String team, int goal, int assist, String rundistance, Object position) {
        
         super(name,surname, nationality, age, fee, league, team);
         
         this.goal= goal;
         this.assist= assist;
         this.rundistance= rundistance;
         this.position = position;
    }

   
    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public int getAssist() {
        return assist;
    }

    public void setAssist(int assist) {
        this.assist = assist;
    }

    public String getRundistance() {
        return rundistance;
    }

    public void setRundistance(String rundistance) {
        this.rundistance = rundistance;
    }
    
    
    
}
