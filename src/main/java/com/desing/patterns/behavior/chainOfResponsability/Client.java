package com.desing.patterns.behavior.chainOfResponsability;

import com.desing.patterns.behavior.chainOfResponsability.handlers.Bank;

public class Client {
    public static void main(String[] args){
       // Bank bank = new Bank();
        var bank = Bank.getInstance();

        System.out.println("If client want a loan of 9999");
        bank.loanApplication(9999);
        System.out.println("If client want a loan of 11111");
        bank.loanApplication(11111);
        System.out.println("If client want a loan of 55555");
        bank.loanApplication(55555);
        System.out.println("If client want a loan of 222222");
        bank.loanApplication(222222);
    }
}
