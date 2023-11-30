public class Adoption {
    private Adopter Adopter;
    private String code;
    private String adoptionDate;
    private Animal animal;
    private Adopter adopter;

    //-Constructor

    public Adoption(String code, String adoptionDate, Animal animal, Adopter adopter) {
        this.code = code;
        this.adoptionDate = adoptionDate;
        this.animal = animal;
        this.adopter= adopter;

    }


    public String getCode() {
        return code;
    }
    public String getAdoptionDate(){
        return adoptionDate;
    }


}
