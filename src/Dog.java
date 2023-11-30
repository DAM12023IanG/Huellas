public class Dog extends Animal {

    private String socialBehaviour;


    //-Constructor
    public Dog(String code, String name, String birthdate, String socialBehaviour){
        super (code,name,birthdate);
        this.socialBehaviour=socialBehaviour;
    }
    public String getSocialBehaviour() {
        return socialBehaviour;
    }

    public void setSocialBehaviour(String socialBehaviour) {
        this.socialBehaviour = socialBehaviour;
    }
}
