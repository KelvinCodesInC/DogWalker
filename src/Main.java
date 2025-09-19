//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        DogWalkCompany dogwalkcompany = new DogWalkCompany();
        int hour = dogwalkcompany.addDogs();
        DogWalker dogwalker = new DogWalker(3, dogwalkcompany);
        
        for (int i = 7; i < 10; i++) {
            dogwalkcompany.addDogs();
        }

        System.out.println("$" + dogwalker.dogWalkShift(7,10) + "dollars earned");

        dogwalker = new DogWalker(4, dogwalkcompany);
    }
}
