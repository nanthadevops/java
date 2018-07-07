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
public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opcode;
    private double result;
    
    public double getLeftVal () { return leftVal ;}
    public void setLeftVal ( double leftVal ) { this.leftVal = leftVal ;}
    public double getRightVal () { return rightVal ;}
    public void setRightVal ( double rightVal ) { this.rightVal = rightVal ;}
    public char getOpcode () { return opcode ;}
    public void setOpcode ( char opcode ) { this.opcode = opcode ;}
    public double getResult () { return result ;}
    
    
    public void execute(){
        switch(opcode)  {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0.0d;
                break;
        }
    }
    
    
}
