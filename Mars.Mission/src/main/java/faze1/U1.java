package faze1;

import java.util.Random;

public class U1 extends Rocket {

    private static final int cost = 100000000;
    private final int weight = 10000;
    private final int maxCargo = 8000;
    private double chanceLaunched;
    private double chanceLanded;
    private static int U1Counter;


    public U1(int lastWeight) {
        setCost(cost);
        setCurrentWeight(lastWeight);
        setWeight(weight);
        setMaxCargo(maxCargo);

        U1Counter++;
    }

    public U1() {

    }

    public static int getU1Counter() {
        return U1Counter;
    }

    public static void setU1Counter( int u1Counter ) {
        U1.U1Counter = u1Counter;
    }

    @Override
    public boolean launch() {
        System.out.println(" launching... ");
        Random randomNumber = new Random();
        double random = randomNumber.nextDouble();
        chanceLaunched = 0.05 * getTotalWeight() / getMaxCargo();

        System.out.println("Cargo : " + getCurrentWeight());
        if (chanceLaunched >= random) {
            System.out.println(" U1 EXPLODED");
            System.out.println(" sending another rocket...");
            return false;
        } else {
            System.out.println(" U1 launched successfully");
            return true;
        }
    }
    @Override
    public boolean land() {
        System.out.println(" landing ");
        Random randomNumber = new Random();
        double random = randomNumber.nextDouble();
        chanceLanded = 0.01 * getTotalWeight() / getMaxCargo();

        if(chanceLanded >= random) {
            System.out.println(" U1 crashed ");
            System.out.println(" sending another rocket ");
            return false;
        }else {
            System.out.println("U1 landed successfully");
            return true;
        }
    }

    public static  long getTotalCost(){
        return(long) getU1Counter() * cost;
    }
}
