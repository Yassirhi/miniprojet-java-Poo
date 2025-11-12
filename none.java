/*import java.util.ArrayList;
import java.util.List;

public class none {
}
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gut
class Etudiant {
    int studentID;
    String nom;
    String email;

    Etudiant(int studentId, String nom, String email) {
        this.studentID = studentId;
        this.nom = nom;
        this.email = email;
    }
}
class Instructeur{
    int instructorID;
    String nom;
    String email;
    String  specialisation;
    ArrayList<Cours> cours;

    public Instructeur(int instructorID, String nom, String email, String specialisation){
        this.instructorID = instructorID;
        this.nom = nom;
        this.email=email;
        this.specialisation=specialisation;
        this.cours=new ArrayList<>();
    }
    public List<Instructeur> ajouterInstructeur(List<Instructeur> instructeurs, Instructeur instructeur){
        instructeurs.add(instructeur);
        return instructeurs;
    }
    public void supprimerInstructeur(List<Instructeur> instructeurs, Instructeur instructeur){
        instructeurs.remove(instructeur);
    }
}
class CoursEtudiant {
    Etudiant etudiant;
    Cours cours;
}


class Cours{
    int courseId;
    String name;
    String description;
    Instructeur instructeur;

    public Cours(int courseId, String name, String description){
        this.courseId = courseId;
        this.name = name;
        this.description = description;
    }
    public CoursEtudient sInscrire(Etudiant etudiant){
        return new CoursEtudient(etudiant, course);

    }


}

public class Main {
    List<Etudiant> etudiants = new ArrayList<>();
    List<CoursEtudient> subscriptions = new ArrayList<>();

    void main(String[] args) {
        Etudiant etudiant = new Etudiant(1, "alice", "hname@domaine.com");



        // etudiant.ajouterEtudiant(etudiants,etudiant);
        // etudiant.supprEtudiant(etudiants,etudiant);

    }
}


*/