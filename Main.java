import java.util.Scanner;

class Main {

    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("=== Menu Gestion des Cours ===");
        System.out.println("1. Ajouter un étudiant");
        System.out.println("2. Ajouter un instructeur");
        System.out.println("3. Ajouter un cours");
        System.out.println("4. Inscrire un étudiant à un cours");
        System.out.println("5. Assigner un instructeur à un cours");
        System.out.println("6. Afficher les détails d’un cours");
        System.out.println("7. Quitter");
        int c= sc.nextInt();
        switch (c){
            case 1:
                System.out.print("Enter l'ID : ");
                int id = sc.nextInt();
                System.out.print("Entrer le nom : ");
                String nom = sc.next();
                System.out.print("Entrer l'email : ");
                String email = sc.next();
                Student e = new Student(id,nom,email);
            case 2:
                System.out.print("Entrer l'ID' : ");
                int id1=sc.next();
                System.out.print("Entrer le nom : ");
                String nom1=sc.next();
                System.out.print("Entrer l'email : ");
                String email1=sc.next();
                System.out.print("Entrer la specialitée : ");
                String specialitee=sc.next();
                Instructeur i = new Instructeur(id1,nom1,email1,specialitee);
            case  3:
                System.out.print("Entrer l'ID : ");
                


        }




 /*     Student e1 =new Student(1,"Ali","hname@gmail.com");
        Student e2=new Student(1,"ahmed","haha@hoho.com");
        Student e3 = new Student(3,"anas","ana@ksa.com");
        Cours a =new Cours(1,"JS","la description ");
        Cours b = new Cours(2,"JEE","la description");
        Cours c = new Cours(3,"Java","la description");
        Instructeur r1 = new Instructeur(1,"El marnissi","elmarnisi@jshd.com","JEE");
        Instructeur r2 = new Instructeur(2,"jabbar","hhh@hhh.com","JAVA");
        Instructeur r3 = new Instructeur(3,"Ibrahim","hshs@hhh.com","JS");

        r1.assignerCours(b);
        r2.assignerCours(c);
        r3.assignerCours(a);
        b.ajouterEtudiant(e1);
        b.ajouterEtudiant(e2);

        b.afficherDetails();
        r1.afficherCours();*/




    }

}

