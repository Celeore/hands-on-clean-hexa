package com.happytown.core.entities;

import java.math.BigDecimal;


public class Cadeau {

    private String reference;
    private String description;
    private BigDecimal montant;
    private TrancheAge trancheAge;

    public Cadeau(String reference, String description, BigDecimal montant, TrancheAge trancheAge) {
        this.reference = reference;
        this.description = description;
        this.montant = montant;
        this.trancheAge = trancheAge;
    }

    public static CadeauBuilder builder() {
        return new CadeauBuilder();
    }

    public String getDetail() {
        return this.description + " " +
                "(Montant : " + this.montant + "€ - " +
                "Référence : " + this.reference + ")";

    }

    public static class CadeauBuilder {
        private String reference;
        private String description;
        private BigDecimal montant;
        private TrancheAge trancheAge;


        public CadeauBuilder reference(String reference) {
            this.reference = reference;
            return this;
        }

        public CadeauBuilder description(String desc) {
            this.description = desc;
            return this;
        }

        public CadeauBuilder montant(BigDecimal montant) {
            this.montant = montant;
            return this;
        }

        public CadeauBuilder trancheAge(TrancheAge trancheAge) {
            this.trancheAge = trancheAge;
            return this;
        }


        public Cadeau build() {
            return new Cadeau(reference,description,montant,trancheAge);
        }
    }
}
