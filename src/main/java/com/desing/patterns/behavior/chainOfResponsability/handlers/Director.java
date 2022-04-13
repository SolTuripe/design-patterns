package com.desing.patterns.behavior.chainOfResponsability.handlers;

public class Director implements IApprover {
    private IApprover next;

    @Override
    public IApprover getNext() {
        return next;
    }
    @Override
    public void loanApplication(int amount) {
        if(amount > 100000){System.out.println("The Director manage the loan application");}
    }
    @Override
    public void setNext(IApprover approver) {
        next = approver;
    }
}
