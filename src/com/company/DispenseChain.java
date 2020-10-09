package com.company;

public interface DispenseChain {
    void setNextChain(DispenseChain dispenseChain);
    void dispense(int currency);
}
