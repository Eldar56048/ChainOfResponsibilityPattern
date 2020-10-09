package com.company;


public class Dollar20Dispenser implements DispenseChain{
    DispenseChain dispenseChain;
    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispense(int currency) {
        if(currency>=20){
            int num = currency/20;
            int remainder = currency%20;
            System.out.println("Number of 20$: "+num);
            if(remainder!=0){
                this.dispenseChain.dispense(remainder);
            }
        }
        else{
            this.dispenseChain.dispense(currency);
        }
    }
}
