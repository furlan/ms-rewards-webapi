package com.metrosys.rewards;

//import java.time.LocalDate;

public class Reward {

    private String month;
    private short total;
    private short[] values;

    public Reward(String month, short[] values) {
        this.month = month;
        this.values = values;
        this.total = getTotal(); // calculate the total on the object creation
    }

    public String getMonth(){
        return month;
    }

    public short getTotal(){
        // Reward rule calculation:
        // 2 points for every dollar spent over $100
        final short twoPointLimit = 100;
        // 1 point for every dollar spent over $50
        final short onePointLimit = 50;

        short total = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > twoPointLimit ) {
                total += 2 * (values[i] - twoPointLimit) + (1 * onePointLimit); 
            } else if (values[i] > onePointLimit){
                total += 1 * (values[i] - onePointLimit);
            }
        }
        return total;
    }

}