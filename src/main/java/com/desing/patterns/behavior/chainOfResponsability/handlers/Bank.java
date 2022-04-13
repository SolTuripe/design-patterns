package com.desing.patterns.behavior.chainOfResponsability.handlers;

import com.desing.patterns.creational.singleton.Printer;

public class Bank implements IApprover {
    private IApprover next;
    private static Bank instanceBank;
    public static Bank getInstance() {
        if(instanceBank ==null){ instanceBank= new Bank();}
        return instanceBank;
    }

    @Override
    public IApprover getNext() {
        return next;
    }
    @Override
    public void loanApplication(int amount) {
        CountExecutive executive = new CountExecutive();
        this.setNext(executive);
        ExecutiveLeaderTeam leader = new ExecutiveLeaderTeam();
        executive.setNext(leader);
        Manager manager = new Manager();
        leader.setNext(manager);
        Director director = new Director();
        manager.setNext(director);

        next.loanApplication(amount);

    }
    @Override
    public void setNext(IApprover approver) {
        next = approver;
    }
}
