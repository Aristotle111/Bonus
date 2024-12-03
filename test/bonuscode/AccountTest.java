/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package bonuscode;

import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 6312971
 */
public class AccountTest {

    public AccountTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    /**
     * Test of getId method, of class Account.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Account instance = new Account();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class Account.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        Account instance = new Account();
        double expResult = 0.0;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAnnualInterestRate method, of class Account.
     */
    @Test
    public void testGetAnnualInterestRate() {
        System.out.println("getAnnualInterestRate");
        double expResult = 0.0;
        double result = Account.getAnnualInterestRate();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Account.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int newId = 0;
        Account instance = new Account();
        instance.setId(newId);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setBalance method, of class Account.
     */
    @Test
    public void testSetBalance() {
        System.out.println("setBalance");
        double newBalance = 0.0;
        Account instance = new Account();
        instance.setBalance(newBalance);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setAnnualInterestRate method, of class Account.
     */
    @Test
    public void testSetAnnualInterestRate() {
        System.out.println("setAnnualInterestRate");
        double newAnnualInterestRate = 0.0;
        Account.setAnnualInterestRate(newAnnualInterestRate);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getMonthlyInterest method, of class Account.
     */
    @Test
    public void testGetMonthlyInterest() {
        System.out.println("getMonthlyInterest");
        Account instance = new Account();
        double expResult = 0.0;
        double result = instance.getMonthlyInterest();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getDateCreated method, of class Account.
     */
    @Test
    public void testGetDateCreated() {
        System.out.println("getDateCreated");
        Account instance = new Account();
        Date expResult = null;
        Date result = instance.getDateCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of withdraw method, of class Account.
     */
    @Test
    public void testWithdraw() {
        System.out.println("withdraw");
        double amount = 0.0;
        Account instance = new Account();
        instance.withdraw(amount);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of deposit method, of class Account.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        double amount = 0.0;
        Account instance = new Account();
        instance.deposit(amount);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
