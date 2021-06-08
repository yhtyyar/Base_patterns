package com.java.base_patterns.behaviorals_patterns.chain;

public abstract class Access {

    private int securityLevel;
    private Access access;

    public Access(int securityLevel) {
        this.securityLevel = securityLevel;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public void  permissionToAccessThePremises(String accessRequest, int level){
        
        if (level >= securityLevel) {
            write(accessRequest);
        }
        if (access != null) {
            access.permissionToAccessThePremises(accessRequest, level);
        }

    }

    protected abstract void write(String accessRequest);
}
