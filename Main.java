import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

   public static void main(String[] args) {
       int d = 0;

       List<Student> students = new ArrayList<>();
       List<Instructeur> instructeurs = new ArrayList<>();
       List<Cours> courses = new ArrayList<>();
       do {
           Scanner sc = new Scanner(System.in);
           System.out.print("=== Menu Gestion des Cours ===\n");
           System.out.println("1. Ajouter un étudiant");
           System.out.println("2. Ajouter un instructeur");
           System.out.println("3. Ajouter un cours");
           System.out.println("4. Inscrire un étudiant à un cours");
           System.out.println("5. Assigner un instructeur à un cours");
           System.out.println("6. Afficher les détails d’un cours");
           System.out.println("7. Quitter");
           int c = sc.nextInt();
           switch (c) {
               case 1:
                   System.out.print("Enter l'ID : ");
                   int id = sc.nextInt();
                   System.out.print("Entrer le nom : ");
                   String nom = sc.next();
                   System.out.print("Entrer l'email : ");
                   String email = sc.next();
                   Student e = new Student(id, nom, email);
                   students.add(e);
                   System.out.print("Etudiant ajouté avec succès");
                   break;
               case 2:
                   System.out.print("Entrer l'ID' : ");
                   int id1 = sc.nextInt();
                   System.out.print("Entrer le nom : ");
                   String nom1 = sc.next();
                   System.out.print("Entrer l'email : ");
                   String email1 = sc.next();
                   System.out.print("Entrer la specialitée : ");
                   String specialitee = sc.next();
                   Instructeur i = new Instructeur(id1, nom1, email1, specialitee);
                   instructeurs.add(i);
                   System.out.print("Instructeur ajouté avec succès");
                   break;
               case 3:
                   System.out.print("Entrer l'ID : ");
                   int id2 = sc.nextInt();
                   System.out.print("Entrer le titre : ");
                   String titre = sc.next();
                   System.out.print("Entrer la description : ");
                   String desc = sc.next();
                   Cours c1 = new Cours(id2, titre, desc);
                   courses.add(c1);
                   System.out.print("Cours ajouté avec succès");
                   break;
               case 4:
                   System.out.print("Entrer l'ID de l'etudiant: ");
                   int id3 = sc.nextInt();
                   System.out.print("Entrer le titre de cours : ");
                   String titreDeCours = sc.next();
                   boolean flag = false, flag2 = false;
                   for (Cours ci : courses) {
                       if (ci.title.equals(titreDeCours)) {
                           flag = true;
                           for (Student s : students) {
                               if (s.studentId == id3) {
                                   flag2 = true;
                                   s.inscrire(ci);
                                   System.out.print("Cours asigné avec succès");

                               }
                           }
                       }
                   }
                   if (!flag) {
                       System.out.println("Le cours n'existe pas");
                   }
                   if (!flag2) {
                       System.out.println("L'etudiant n'existe pas");
                   }
                break;
               case 5:
                   Boolean trouve = false, trouve2 = false;
                   System.out.print("Entrer l'ID de l'instructeur : ");
                   int id4 = sc.nextInt();
                   System.out.print("Entrer l'ID de cours : ");
                   int id5 = sc.nextInt();
                   for (Instructeur i2 : instructeurs) {
                       if (i2.instructeurId == id4) {
                           trouve = true;
                           for (Cours c2 : courses) {
                               if (c2.coursId == id5) {
                                   trouve2 = true;
                                   c2.assignerInstructeur(i2);
                                   i2.assignerCours(c2);
                                   System.out.print("Cours asigné avec succès");
                               }
                           }
                       }
                   }
                   if (!trouve2) {
                       System.out.println("L'instructeur n'existe pas");
                   }
                   if (!trouve) {
                       System.out.println("Le cours n'existe pas");
                   }
                   break;
               case 6:
                   System.out.println("L'ID de cours :");
                   int id6 = sc.nextInt();
                   boolean t = false;
                   for (Cours c2 : courses) {
                       if (c2.coursId == id6) {
                           t = true;
                           c2.afficherDetails();
                       }
                   }
                   if (!t) {
                       System.out.println("Le cours n'existe pas");
                   }
                   break;
           }

           System.out.println("voulez vous continuez 1/0 :");
            d = sc.nextInt();


       } while (d == 1);
   }

}

