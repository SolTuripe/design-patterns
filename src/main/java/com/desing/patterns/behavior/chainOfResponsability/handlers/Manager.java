package com.desing.patterns.behavior.chainOfResponsability.handlers;

public class Manager implements IApprover {
    private IApprover next;

    @Override
    public IApprover getNext() {
        return next;
    }
    @Override
    public void loanApplication(int amount) {
        if(amount > 50000 && amount <= 100000){System.out.println("The Manager manage the loan application");}
        next.loanApplication(amount);
    }
    @Override
    public void setNext(IApprover approver) {
        next = approver;
    }
}
