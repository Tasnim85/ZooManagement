package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        /*Scanner myObj = new Scanner(System.in);
        System.out.println("Entrer le nom du zoo ");
        String zooName  = myObj.nextLine();
        System.out.println("Entrer le nombre du cages");
        int nbrCages   = myObj.nextInt();
        System.out.println("Le zoo "+ zooName +" contient "+ nbrCages+" cages");*/

       /* Zoo zoo1 = new Zoo("", "Tunis");

        Zoo zoo2 = new Zoo("Zoo2", "Sousse");

        Animal lion = new Animal("felidae", "lion", -5, true);

        lion.setAge(5);

        zoo2.addAnimal(lion);
        zoo2.displayAnimals();*/

        Dolphin dolphin = new Dolphin("Mammal", "Dolphin", 5, true, "Ocean", 30.5f);
        Penguin penguin = new Penguin("Bird", "Penguin", 3, false, "Antarctic", 15.0f);
        Terrestrial terrestrial = new Terrestrial("Mammal", "Elephant", 10, true, 4);
        Aquatic aquatic = new Aquatic("Fish", "Shark", 8, false, "Ocean");

        System.out.println(dolphin);
        System.out.println(penguin);
        System.out.println(terrestrial);
        System.out.println(aquatic);

        aquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}
