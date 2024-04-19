package com.labjunit;

public class BankAccount {
    private double solde;
    
    public void debiter(double montant) {
        // control data
        if(montant < 0) {
            throw new IllegalArgumentException("montant must be positive");
        }
        // control data
        if(montant > solde) {
            throw new IllegalArgumentException("montant must be less than solde");
        }
        solde -= montant;
    }

    public void crediter(double montant) {
        // control data
        if(montant < 0) {
            throw new IllegalArgumentException("montant must be positive");
        }
        solde += montant;
    }

    public double getSolde() {
        return solde;
    }
}
