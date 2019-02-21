public class Texte implements Email{

    public String signature() {
        return "\n" + "Cordialement Hadrien DESCHET";
    }

    public String entete() {
        return "Bonjour Madame, Monsieur, " + "\n";
    }
}
