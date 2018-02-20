/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Eleve;

/**
 *
 * @author lenovo
 */
public class EleveService extends AbstractFacade<Eleve> {

    public EleveService() {
        super(Eleve.class);
    }

    public int ajouterEleve(String id, String nomE, String prenomE,int ageE) {
        Eleve eleve = new Eleve();
        eleve.setId(id);
        eleve.setNom(nomE);
        eleve.setPrenom(prenomE);
        eleve.setAge(ageE);
        create(eleve);
        return 1;

    }

}
    

