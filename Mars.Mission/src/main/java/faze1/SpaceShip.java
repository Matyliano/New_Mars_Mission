package faze1;

import faze1.Item;

public interface SpaceShip {

    public boolean launch();
    public boolean land();
    public boolean canCarry( Item item);
    public void carry(Item item);

}
