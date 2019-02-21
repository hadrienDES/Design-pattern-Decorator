abstract class EmailDecorator implements Email {

    protected Email addtext;

    public EmailDecorator(Email newEmail){
        addtext = newEmail;
    }

    public String signature(){
        return addtext.signature();
    }

    public String entete(){
        return addtext.entete();
    }
}
