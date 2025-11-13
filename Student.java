import java.util.ArrayList;
import java.util.List;

public class Student {
    int studentId;
    String nom;
    String email;
    List<Cours> courses;


    Student(int studentId, String nom, String email) {
        this.studentId = studentId;
        this.nom = nom;
        this.email = email;
        this.courses = new ArrayList<>();
    }

    public void inscrire(Cours c){
        courses.add(c);
        c.ajouterEtudiant(this);
    }


}
