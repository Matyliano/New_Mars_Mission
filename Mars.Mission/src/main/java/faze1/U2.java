package faze1;

import java.util.Random;

public class U2 extends Rocket {

    private static final int cost = 120000000;
    private final int weight = 18000;
    private final int maxCargo = 11000;
    private static int U2Counter;
    private double chanceLaunched;
    private double chanceLanded;

    public U2(int lastWeight) {
        setCost(cost);
        setCurrentWeight(lastWeight);
        setMaxCargo(maxCargo);
        setWeight(weight);

        U2Counter++;
    }

    public U2() {

    }

    @Override
    public boolean launch() {
        System.out.println(" launching ");
        Random randomNumber = new Random();
        double random = randomNumber.nextDouble();
        chanceLaunched = 0.04 * (getTotalWeight() / getMaxCargo());

        System.out.println(" cargo : " + getCurrentWeight());
        if(chanceLaunched >= random) {
            System.out.println(" U2 exploded ");
            System.out.println(" sanding another rocket ");
            return false;
        } else {
            System.out.println(" U2 launched successfully");
            return true;
        }
    }

    @Override
    public boolean land() {
        System.out.println(" landing ");
        Random randomNumber = new Random();
        double random = randomNumber.nextDouble();
        chanceLanded = 0.08 * (getTotalWeight() / maxCargo);

        if (chanceLanded >= random) {
            System.out.println(" U2 crashed ");
            System.out.println(" sending another rocket");
            return false;
        } else {
            System.out.println(" U2 landed successefully");

            return true;
        }
    }
    public static int getU2Counter() {
        return U2Counter;
    }

    public static void setU2Counter( int u2Counter ) {
        U2.U2Counter = u2Counter;
    }

    public static long getTotalCost() {
        return (long) getU2Counter() * cost;
    }
}
