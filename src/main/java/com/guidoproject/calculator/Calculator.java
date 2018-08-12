
package com.guidoproject.calculator;

public class Calculator {
    
    private int result;
    
    public void add(int number1, int number2) {
        result = number1 + number2;
    }
    
    public void subtract(int number1, int number2) {
        result = number1 - number2;
    }
    
    public void multiply(int number1, int number2) {
        result = number1 * number2;
    }
    
    public void divide(int number1, int number2) {
        result = number1 / number2;
    }
    
    public int getResult() {
        return result;
    }
}
