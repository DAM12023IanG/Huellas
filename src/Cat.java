public class Cat extends Animal {

    private String virusPositive;

    public Cat(String code, String name, String birthdate, String virusPositive) {
        super(code, name, birthdate);
        this.virusPositive=virusPositive;
    }

    //-Constructor

    public String getVirusPositive() {
        return virusPositive;
    }

    public void setVirusPositive(String virusPositive) {
        this.virusPositive = virusPositive;
    }
}
