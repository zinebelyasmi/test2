/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Admine;

/**
 *
 * @author lenovo
 */
public class AdmineService extends AbstractFacade<Admine> {

    public AdmineService() {
        super(Admine.class);
    }

    public int isConnecter(Admine admine) {
        Admine loadedAdmine = find(admine.getId());
        if (loadedAdmine == null) {
            return -1;
        } else if (!loadedAdmine.getPassword().equals(admine.getPassword())) {
            return -2;
        } else {
            return 1;
        }

    }
    public static void main(String[] args) {
        System.out.println("isConnecter");
        Admine admine = new Admine("A1","z1");
        AdmineService instance = new AdmineService();
        instance.create(admine);
    }
    
}
