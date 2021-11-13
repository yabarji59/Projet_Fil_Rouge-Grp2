package com.simplon.formation.persistance.entities;

import javax.persistence.OneToOne;

public class FormerDo {
     
    @OneToOne(mappedBy ="SessionFormer")
    private SessionDo Session;
    
}
