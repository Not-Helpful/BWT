/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bwt;

/**
 *
 * @author Brandon
 */
public class BWT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String T = "abbaabbc$";
        transform BWT = new transform();
        BWT.Transformer(T);
        BWT.test();
    }
    
}
