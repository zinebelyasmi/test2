/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Parent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lenovo
 */
public class ParentServiceTest {
    
    public ParentServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isConnecter method, of class ParentService.
     */
    @Test
    public void testIsConnecter() {
         
        System.out.println("isConnecter");
        Parent parent = new Parent("FM1", "chetoui", "fatima", "abc@gmail.com", "fm1",0664141204);
        ParentService instance = new ParentService();
        instance.create(parent);
    }

   
    
}
