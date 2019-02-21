public class Envoyer extends EmailDecorator {

    public Envoyer(Email newEmail) {
        super(newEmail);

        System.out.println("Ajout entete");
        System.out.println("Ajout signature" + "\n");
    }

    public String signature(){
        return addtext.signature();
    }

    public String entete(){
        return addtext.entete() + "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "+"\n"+"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat." + "\n" +"Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur."+"\n" +"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    }
}
