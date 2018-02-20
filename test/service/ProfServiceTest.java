/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Prof;
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
public class ProfServiceTest {
    
    public ProfServiceTest() {
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
     * Test of isConnecter method, of class ProfService.
     */
    @Test
   public void testIsConnecter() {
        System.out.println("isConnecter");
        Prof prof = new Prof("P1","a.souhaili@gmail.com","souhaili","p1","ahmed");
        ProfService instance = new ProfService();
        instance.create(prof);
        
    }
    
}
