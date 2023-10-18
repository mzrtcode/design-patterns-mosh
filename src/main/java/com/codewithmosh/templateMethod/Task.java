package com.codewithmosh.templateMethod;

public abstract class Task {

    private AuditTrail auditTrail;

    public  Task(){
        auditTrail = new AuditTrail();
    }

    public Task(AuditTrail auditTrail){
        this.auditTrail = auditTrail;
    }
    public void execute(){
        auditTrail.record();

        doExecute();
    }

    // Protected es similar a private pero lo hace visible a las subclases
    protected abstract void doExecute();
}
