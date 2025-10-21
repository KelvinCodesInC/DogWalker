import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(reader());
    }

    public static int reader() throws FileNotFoundException {
        int money = 0;

        DogWalkCompany[] companies = new DogWalkCompany[1000];
        File f = new File("Companies.txt");
        Scanner s = new Scanner(f);

        int index = 0;
        while (s.hasNextInt() && index < 1000) {
            int[] dogs = new int[24];
            for (int i = 0; i < 24; i++) {
                dogs[i] = s.nextInt();
            }
            companies[index++] = new DogWalkCompany(dogs);
        }
        s.close();

        DogWalker[] walkers = new DogWalker[10000];
        f = new File("Walkers.txt");
        s = new Scanner(f);

        index = 0;
        while (s.hasNextInt() && index < 10000) {
            int maxDogs = s.nextInt();        // how many they can walk at once
            int companyIndex = s.nextInt();   // which company they work for
            int startHour = s.nextInt();      // start time
            int endHour = s.nextInt();        // end time

            DogWalkCompany company = companies[companyIndex];
            walkers[index] = new DogWalker(maxDogs, company);
            money += walkers[index].dogWalkShift(startHour, endHour);
            index++;
        }

        s.close();
        return money;
    }
}
