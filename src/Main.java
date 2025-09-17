//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DogWalkCompany d = new DogWalkCompany();
        int hour = d.addDogs();
        DogWalker dogwalker = new DogWalker(4, d);

        for (int i = 7; i <= 10; i++) {
            d.addDogs();

        }
        System.out.println("Number of dogs walked: " + dogwalker.walkDogs(hour));
        System.out.println("Number of dogs remaining: "+ d.numAvailableDogs(hour));


    }
}