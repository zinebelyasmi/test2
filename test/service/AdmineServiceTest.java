/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Admine;
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
public class AdmineServiceTest {
    
    public AdmineServiceTest() {
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
     * Test of isConnecter method, of class AdmineService.
     */
    @Test
     public void testIsConnecter() {
        System.out.println("isConnecter");
        Admine admine = new Admine("A1","z1");
        AdmineService instance = new AdmineService();
        instance.create(admine);
        
    }
    
}
