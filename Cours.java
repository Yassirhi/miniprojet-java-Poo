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
        System.out.println("Cours id: "+coursId);
        System.out.println("Title: "+title);
        System.out.println("Description: "+description);
        System.out.print("Instructeur :"+i.nom);
        System.out.println("\nStudents:");
        for( Student s: students){
            System.out.println(s);
        }
    }
}

