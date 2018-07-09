/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcengine;

/**
 *
 * @author Nantha_v01
 */
public class CalcEngine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    MathEquation[] equations = new MathEquation[4];
//     equations[0] = create(100.0d,50.0d,'d'); 
//     equations[1] = create(25.0d,92.0d,'a');
//     equations[2] = create(225.0d,17.0d,'s');
//     equations[3] = create(11.0d,3.0d,'m');
      
equations[0]= new MathEquation(100.0d,50.0d,'d');
equations[1]= new MathEquation(25.0d,92.0d,'a');
equations[2]= new MathEquation(225.0d,17.0d,'s');
equations[3]= new MathEquation(11.0d,3.0d,'m');

        

     for(MathEquation equation : equations){
         equation.execute();
         System.out.print("result=");
         System.out.println(equation.getResult());
     }
     
     System.out.println();
    System.out.println("Using overloads");
    System.out.println();
    
    double leftDouble = 9.00d;
    double rightDouble = 4.00d;
    
    int leftInt = 9;
    int rightInt = 4;
    
    MathEquation equationOverload = new MathEquation ('d');
    
    equationOverload.execute(leftDouble, rightDouble);
    System.out.print("result=");
    System.out.println(equationOverload.getResult());
    
    equationOverload.execute(leftInt, rightInt);
    System.out.print("result=");
    System.out.println(equationOverload.getResult());
    
    equationOverload.execute((double)leftInt, rightInt);
    System.out.print("result=");
    System.out.println(equationOverload.getResult());
     
     System.out.println("");
     System.out.println("Using Inheritance");
     System.out.println("");
     
     CalculateBase[] calculators ={
         
         new Adder(25.0d,92.0d),
         new Subtracter(225.0d,17.0),
         new Multiplier(11.0d,3.0d),
         new Divider(100.0d,50.0d)
     };
    
    for (CalculateBase calculator:calculators){
        calculator.calculate();
        System.out.print("result=");
    System.out.println(calculator.getResult());
    }  
     
    }
    
    
}
