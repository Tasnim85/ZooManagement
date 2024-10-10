package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private int animalCount;
    private String name;
    private String city;
    private final int nbrCages = 25;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Erreur : Le nom du zoo ne peut pas être vide.");
        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void displayZoo() {
        System.out.println("Zoo: " + name + ", Ville: " + city + ", Cages: " + nbrCages);
    }

    public void displayAnimals() {
        System.out.println("Animaux dans le zoo:");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Zoo plein. Impossible d'ajouter plus d'animaux.");
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println("L'animal est déjà dans le zoo.");
            return false;
        }
        animals[animalCount++] = animal;
        System.out.println(animal.getName() + " a été ajouté.");
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("Animal non trouvé.");
            return false;
        }

        animals[index] = animals[animalCount - 1];
        animals[animalCount - 1] = null;
        animalCount--;
        System.out.println(animal.getName() + " a été supprimé.");
        return true;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;
        } else if (z2.animalCount > z1.animalCount) {
            return z2;
        } else {
            return null;
        }
    }
}
