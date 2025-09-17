import java.util.Scanner;

public class DogWalkCompany
{
    /**
     * Returns the number of dogs, always greater than 0, that are available
     * for a walk during the time specified by hour
     * Precondition: 0 <= hour <= 23
     */

    private int[] schedule;

    public DogWalkCompany() {
        schedule = new int[24];
    }

    public int addDogs() {
        Scanner s = new Scanner(System.in);
        System.out.println("what hour?");
        int hour = s.nextInt();
        System.out.println("How many dogs");
        int dogs = s.nextInt();
        schedule[hour] = dogs;
        return hour;
    }

    public int numAvailableDogs(int hour)
    {
        return schedule[hour];
    }

    /**
     * Decreases, by numberDogsWalked, the number of dogs available for a walk
     * during the time specified by hour
     * Preconditions: 0 <= hour <= 23
     * numberDogsWalked > 0
     */
    public void updateDogs(int hour, int numberDogsWalked)
    {
        schedule[hour] -= numberDogsWalked;
    }

/* There may be instance variables, constructors,
and methods that are not shown. */
}