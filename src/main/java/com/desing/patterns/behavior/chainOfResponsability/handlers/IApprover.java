package com.desing.patterns.behavior.chainOfResponsability.handlers;

public interface IApprover {
    public void setNext(IApprover approver);
    public IApprover getNext();
    public void loanApplication(int amount);

}
