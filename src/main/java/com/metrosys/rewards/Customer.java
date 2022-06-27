package com.metrosys.rewards;

//import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class Customer {
    
    private String Id;
    private short totalRewards;
    private Reward[] rewards;
    
    public Customer(String Id){
        this.Id = Id;
        // example data grouped by month and limited for the last 3 months.
        // this will be replaced by DB data retriver classes
        rewards = getRewardsSampleByCustomer(Id);
    }

    public String getId() {
        return Id;
    }

    public short getTotalRewards(){
        
        for (int i = 0; i < this.rewards.length; i++) {
            this.totalRewards += this.rewards[i].getTotal();
        }
        
        return this.totalRewards;
    }

    public Reward[] getRewards(){
        return rewards;
    }

    private Reward[] getRewardsSampleByCustomer(String Id){
        Reward r1;
        Reward r2;
        Reward r3;
        short[] values;
        Reward[] rewards = new Reward[]{};

        switch (Id) {
            case "1":
                values = new short[]{ 100, 210, 40, 50, 500 }; // Expected rewards: 1170
                r1 = new Reward("4", values);
                values = new short[]{ 155, 2100, 50, 50, 800, 500, 8734 }; // 23828
                r2 = new Reward("5", values);
                values = new short[]{ 16, 30, 40, 49, 50, 21, 1 }; // 0
                r3 = new Reward("6", values);
                rewards = new Reward[]{r1, r2, r3}; // 24998
                break;
            case "2":
                values = new short[]{ 10, 280, 43, 505, 654 }; // 2428
                r1 = new Reward("4", values);
                values = new short[]{ 1755, 2700, 46, 532, 653 }; // 10680
                r2 = new Reward("5", values);
                values = new short[]{ 176, 543, 2323, 33, 865 }; // 7214
                r3 = new Reward("6", values);
                rewards = new Reward[]{r1, r2, r3};  // 20322
                break;

        }

        return rewards;
    }
}
