
package swingproject;
import java.io.Serializable;





public class Footballer  {
    
    
    private  String name;
  private  String surname;
  private  String nationality;  
  private   int age;
  private  int fee;
  private  String league;
  private  String team;
  


  
  

    public Footballer(String name, String surname, String nationality, int age, int fee,
            String league, String team) {
        this.name = name;
        this.surname = surname;
        this.nationality = nationality;
        this.age = age;
        this.fee = fee;
        this.league = league;
        this.team = team;
        
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    
   

    
}
