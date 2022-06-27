package com.metrosys.rewards;

public class RewardReport {
    
    private Customer[] customers;

    public RewardReport(){
        // data generated for demo purposes 
        Customer c1 = new Customer("1");
        Customer c2 = new Customer("2");
        Customer[] customers = { c1, c2 };
        this.customers = customers;
    }

    public Customer[] getCustomers(){
        return customers;
    }
}
