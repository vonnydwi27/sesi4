/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

	Calculator calculator = new calculator;
	int[] nums = {2,5,6,4,1}
	System.out.println(Calculator.max(nums));	
	System.out.println(Calculator.min(nums));
	System.out.println(Calculator.avn(nums));
    }
    
}
