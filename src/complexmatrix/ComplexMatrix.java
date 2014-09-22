/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package complexmatrix;

import java.util.Scanner;

/**
 *
 * @author Windows 7
 */
public class ComplexMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        
        testmatrix a = new testmatrix();
        testmatrix b = new testmatrix();
        a.scanInput();
        b.scanInput();
        testmatrix c = a.add(b);
        testmatrix e = testmatrix.mul(a,b);
        System.out.println("Sum of matrix of complex number is:" );
        c.printMatrix();
        System.out.println("Multiple of matrix of complex number is:" );
        e.printMatrix();
        
    }
    
}

