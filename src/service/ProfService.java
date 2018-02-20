/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Prof;

/**
 *
 * @author lenovo
 */
public class ProfService extends AbstractFacade<Prof> {

    public ProfService() {
        super(Prof.class);
    }

    public int isConnecter(Prof prof) {
        Prof loadedProf = find(prof.getId());
        if (loadedProf == null) {
            return -1;
        } else if (!loadedProf.getPassword().equals(prof.getPassword())) {
            return -2;
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {
        System.out.println("isConnecter");
        Prof prof = new Prof("P1", "a.souhaili@gmail.com", "souhaili", "p1", "ahmed");
        ProfService instance = new ProfService();
        instance.create(prof);

    }
}
