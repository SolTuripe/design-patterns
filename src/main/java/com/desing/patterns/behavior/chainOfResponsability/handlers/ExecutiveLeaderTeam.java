package com.desing.patterns.behavior.chainOfResponsability.handlers;

public class ExecutiveLeaderTeam implements IApprover {
    private IApprover next;

    @Override
    public IApprover getNext() {
        return next;
    }
    @Override
    public void loanApplication(int amount) {
        if(amount > 10000 && amount <= 50000){System.out.println("The LeaderTeamExecutive manage the loan application");}
        next.loanApplication(amount);
    }
    @Override
    public void setNext(IApprover approver) {
        next = approver;
    }
}
