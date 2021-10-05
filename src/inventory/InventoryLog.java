package inventory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class InventoryLog implements Inventory {

    // ArrayList field
    private ArrayList<Character> log;

    public InventoryLog() {
        //construct ArrayList here
        this.log = new ArrayList<>();
    }
    /**
     * adding the character c to the end of the inventory list
     *
     * @param c character to track in inventory
     */
    @Override
    public void add(char c) {
        if(Character.isLetter(c)){
            c = Character.toLowerCase(c);
            log.add(c);
        }

    }

    /**
     * decrements the count of the character c in the inventory
     *
     * @param c character to track in inventory
     */
    @Override
    public void subtract(char c) {

        if(Character.isLetter(c)){
            c = Character.toLowerCase(c);
            ArrayList<Character> removedChar = new ArrayList<>();
            removedChar.add(c);
            try{
                log.removeAll(removedChar);
            }
            catch (NullPointerException e){
                System.out.println("Character " + c + " is not in the log");
            }

        }

    }

    /**
     * returns a count of the letter in the inventory, zero otherwise
     *
     * @param c character in inventory
     * @return a count of the character in the inventory
     */
    @Override
    public int get(char c) {
        return 0;
    }

    /**
     * updates the count of the character c in the inventory (if count is zero or greater)
     *
     * @param c     character to update in inventory, throws IllegalArgumentException if character not in inventory
     * @param count number to update count with, throws IllegalArgumentException if negative
     */
    @Override
    public void set(char c, int count) {

    }

    /**
     * returns true if character is contained in the inventory
     *
     * @param c character
     * @return true if character in inventory, false otherwise
     */
    @Override
    public boolean contains(char c) {
        return log.contains(c);
    }

    /**
     * returns the sum of all counts in the inventory
     *
     * @return the total count
     */
    @Override
    public int size() {
        return 0;
    }

    /**
     * Returns true if this inventory is empty (all counts are 0)
     *
     * @return true if all counts are 0, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * Returns a String representation of the inventory with the letters all in lowercase
     * surrounded by square brackets in alphabetical order. The number of occurrences of
     * each letter matches its count in the inventory.
     * For example, an inventory of 4 a’s, 1 b, 1 k and 1 m would be represented as “[aaaabkm]”.
     * @return a bracketed string representation of the letters contained in the inventory
     */
    public String toString() {
        StringBuilder toReturn = new StringBuilder("[");

        // for every count in the letters inventory
        for(int i = 0; i < log.size(); i++) {

                toReturn.append(log.get(i));

        }
        //add closing bracket
        toReturn.append("]");
        return toReturn.toString();
    }
}
