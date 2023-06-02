import java.util.Scanner;

public class Main {
    //portée //static ou non //la sortie
    public static void main(String[] args) {
        int nb1= 10;
        int nb2=12;
        int nb3= nb1 + nb2;
        /**System.out.println("la somme des deux nombres est égale à " + (nb1+nb2) + ".");
        System.out.println("le résultat de la soustraction est égal à : " +(soustraction(50,8,25))); intervertir(20,100);
        soustraction(lire(),lire(),lire());
        System.out.println(scannerAsk()); **/
        System.out.println(afficherCategorie(5));


    }
    public static int afficherCategorie(int choix) {
        if (choix == 6 | choix == 7) {
            System.out.println("Tu es un poussin");
        } else if (choix == 7 | choix == 8) {
            System.out.println("Tu es une pupille");
        } else if (choix == 10 | choix == 11) {
            System.out.println("Tu es un minime");
        } else if (choix >= 12) {
            System.out.println("Tu es un cadet");
        } else {
            System.out.println("Age non catégorisé");
        }
        return choix;
    }

    //version switch case

    public void categorieAvecSwitch(int choix){

        switch(choix){

            case 1:
                System.out.println("Poussin");
                break;

            case 2:
                System.out.println("Pupille");
                break;

            case 3:
                System.out.println("Minime");
                break;
            default:
                System.out.println("Pas de ton âge");
                break;
        }

    }

    public static int lire(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre");
        int nbr = scanner.nextInt();
        return nbr;

    }

    /**Exercice 5 scanner :
    Ecrire une fonction qui demande(scanner) le prix HT d’un article, la quantité d’articles et le taux de TVA dans la console, et qui retourne le prix total TTC correspondant.
    Faire en sorte que des libellés apparaissent clairement**/

    public static float scannerAsk(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir le prix HT de l'article");
        int prixHt = scanner.nextInt();
        System.out.println("Quantité d'article");
        int quantité = scanner.nextInt();
        System.out.println("Saisir le taux");
        int tauxTva = scanner.nextInt();
        return (prixHt+quantité)/tauxTva;
    }

    /**instancier un objet Scanner : permet de récupérer le prochain élément de la console
    Scanner scanner = new Scanner(System.in);
    //affichage d'une chaine dans la console
        System.out.println("Saisir un nombre");
    //instance d'une variable int pour stocker le nbr (int) saisi
    int nbr = scanner.nextInt();
    //affichage dans la console du résultat
        System.out.println("le nombre saisi est : ");
    /**Exercice 2 fonctions :
    Ecrire une fonction qui va s’appeler soustraction et qui va prendre en paramètre 3 entiers i, j et k et va retourner la soustraction des nombres en entrée.
            NB :* la fonction sera statique **/

    public static int soustraction (int i, int j, int k){
        return i-j-k;
    }

    public static void intervertir (int i, int j){
        int change = i;
        i=j;
        i= change;
    }



    //variables = typage +nom (pas besoin de mot clef)
    boolean active = true;
    //les variables sont verrouillées on ne peut pas les changer
    int nbr = 10;

    //pour une chaine de caractere il faudra toujours appeler la classe
    String texte = "exercice";

}