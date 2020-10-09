package com.company;

public class Dollar50Dispenser implements DispenseChain{
    DispenseChain dispenseChain;
    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispense(int currency) {
        if(currency>=50){
            int num = currency/50;
            int remainder = currency%50;
            System.out.println("Number of 50$: "+num);
            if(remainder!=0){
                this.dispenseChain.dispense(remainder);
            }
        }
        else{
            this.dispenseChain.dispense(currency);
        }
    }


}
