package faze1;

import faze1.Item;

public abstract class Rocket implements SpaceShip {

    private int currentWeight;
    private int weight;
    private int cost;
    private double totalWeight = currentWeight + weight;
    private int maxCargo;

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry( Item item ) {

        if(maxCargo >= (currentWeight + item.getWeight())){
            return true;
        } else {
            System.out.println("Can't carry item: " + item.getName() + " \t Weight : " + item.getWeight());
        }
        return false;
    }

    public void carry( Item item ) {
        System.out.println("Carrying item : " + item.getName() + " \t Weight : " + item.getWeight());
        currentWeight += item.getWeight();

    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight( int currentWeight ) {
        this.currentWeight = currentWeight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight( int weight ) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost( int cost ) {
        this.cost = cost;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight( double totalWeight ) {
        this.totalWeight = totalWeight;
    }

    public int getMaxCargo() {
        return maxCargo;
    }

    public void setMaxCargo( int maxCargo ) {
        this.maxCargo = maxCargo;
    }
}
