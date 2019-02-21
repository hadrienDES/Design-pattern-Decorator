public class Main {
    public static void main(String[] args){

        Email basicEmail = new Envoyer(new Texte());

        System.out.println(basicEmail.entete() + "\n" + basicEmail.signature());

    }
}
