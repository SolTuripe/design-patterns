package com.desing.patterns.behavior.chainOfResponsability.handlers;

public class CountExecutive implements IApprover {
    private IApprover next;

    @Override
    public IApprover getNext() {
        return next;
    }
    @Override
    public void loanApplication(int amount) {
        if(amount <= 10000){System.out.println("The CountExecutive manage the loan application");}
        next.loanApplication(amount);
    }
    @Override
    public void setNext(IApprover approver) {
        next = approver;
    }
}
