
package swingproject;

/**
 *
 * @author Muhammed
 */
public class SwingProject {

  
    public static void main(String[] args) {
        GoalKeeper gk1 = new GoalKeeper("name","surname", "nationality", 5 , 6,
            "league", "team" , 8);
        System.out.println(gk1.getAge());
        new Menu().setVisible(true);
    }
    
}
