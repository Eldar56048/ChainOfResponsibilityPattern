package com.company;

public class Main {

    public static void main(String[] args) {
        DispenseChain dispenseChain50 = new Dollar50Dispenser();
        DispenseChain dispenseChain20 = new Dollar20Dispenser();
        DispenseChain dispenseChain10 = new Dollar10Dispenser();
        dispenseChain50.setNextChain(dispenseChain20);
        dispenseChain20.setNextChain(dispenseChain10);
        dispenseChain50.dispense(130);
    }
}
