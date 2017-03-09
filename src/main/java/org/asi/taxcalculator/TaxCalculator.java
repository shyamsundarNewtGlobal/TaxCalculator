/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.asi.taxcalculator;

/**
 *
 * @author shyams
 */
public class TaxCalculator {
    
    public int calcTax(int income) {

        double tax = 0.0;
        Math.round(tax);
        if (income > 0 && income < 10000) {
            tax = tax + 0;
        }
        if (income > 10000) {
            if (income > 50000) {
                tax = tax + (40000 * .10);
            } else {
                return (int) (tax + ((income - 10000) * .10));
            }
        }
        if (income > 50000) {
            if (income > 100000) {
                tax = tax + (50000 * .15);
            } else {
                return (int) (tax + ((income - 50000) * .15));
            }
        }
        if (income > 100000) {
            return (int) (tax + ((income - 100000) * .2));
        }
        return (int) tax;
        
    }
    
}
