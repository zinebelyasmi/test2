/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Parent;

/**
 *
 * @author lenovo
 */
public class ParentService extends AbstractFacade<Parent>{

    public ParentService() {
        super(Parent.class);
    }
    
    public int isConnecter(Parent parent){
       Parent loadedParent=find(parent.getId());
       if(loadedParent==null){
           return -1;
       }else if(!loadedParent.getPassword().equals(parent.getPassword())){
           return -2;
        }else{
           return 1;
       }
       
       
    }
    
    public static void main(String[] args) {
        
        System.out.println("isConnecter");
        Parent parent = new Parent("FM1", "chetoui", "fatima", "abc@gmail.com", "fm1",0664141204);
        ParentService instance = new ParentService();
        instance.create(parent);
    
    }
    
}
    
