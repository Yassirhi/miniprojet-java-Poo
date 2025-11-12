import java.util.ArrayList;
import java.util.List;

public class Instructeur {
    int instructeurId;
    String nom;
    String email;
    String specialisation;
    List<Cours> courses;

    Instructeur(int instructeurId,String nom,String email,String specialisation){
        this.instructeurId = instructeurId;
        this.nom=nom;
        this.email=email;
        this.specialisation=specialisation;
        this.courses=new ArrayList<>();
    }
    public void assignerCours(Cours c){
        courses.add(c);
    }
    public void afficherCours(){
        for(Cours c : courses){
            System.out.println(c);
        }
    }
}
