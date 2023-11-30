import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Adopción 'Huellas' ");

        //Animal
        Animal gato, perro;
        gato = new Cat("Feline001","Garfield","12-05-2010", "Negativo");
        perro = new Dog("Canine001", "ScoobyDoo", "13-12-2000", "Amigable");


        //Persona
        Adopter persona = new Adopter("A001","Ian", "Mendoza Portillo", "634 98 81 73");

        //Adopción
        Adoption adopcion = new Adoption("Adop001","30-12-23", gato, persona);

    }
}