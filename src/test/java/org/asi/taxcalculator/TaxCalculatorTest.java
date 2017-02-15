/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.asi.taxcalculator;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author shyams
 */
public class TaxCalculatorTest {
    
    @Test
    public void testMe() {
        //Yes, this should be multiple test cases...
        TaxCalculator sut = new TaxCalculator();
        assertTrue(sut.calcTax(1)==0);

    }

    @Test
    public void testMe2() {
        TaxCalculator sut = new TaxCalculator();
        assertTrue(sut.calcTax(10100)==10);
    }

    @Test
    public void testMe3() {
        TaxCalculator sut = new TaxCalculator();
        assertTrue(sut.calcTax(50100)==4015);
    }

    @Test
    public void testMe4() {
        TaxCalculator sut = new TaxCalculator();
        assertTrue(sut.calcTax(100100)==11520);
    }

}
