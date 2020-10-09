package com.company;

public class Dollar10Dispenser implements DispenseChain{
    DispenseChain dispenseChain;
    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispense(int currency) {
        if(currency>=10){
            int num = currency/10;
            int remainder = currency%10;
            System.out.println("Number of 10$: "+num);
        }
    }
}
