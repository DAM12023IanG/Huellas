public class Animal {
    private String code;
    private String name;
    private String birthdate;

    public Animal(String code, String name, String birthdate) {
        this.code=code;
        this.name=name;
        this.birthdate=birthdate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
