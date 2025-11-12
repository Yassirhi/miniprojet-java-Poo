import java.util.ArrayList;
import java.util.List;

public class Cours {
    int coursId;
    String title;
    String description;
    Instructeur i;
    List<Student> students;

    Cours(int coursId, String title , String description){
        this.coursId = coursId;
        this.title = title;
        this.description = description;
        this.students=new ArrayList<>();
    }
    public void ajouterEtudiant(Student e){
        students.add(e);
    }
    public void assignerInstructeur(Instructeur i){
        this.i=i;
    }
    public void afficherDetails(){

        for( Student s: students){
            System.out.println(s);
        }
    }
}

