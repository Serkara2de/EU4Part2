package Assingments.Assignment14_OOP.Q2;

public class LameCalculator {
    /*
    The LameCalculator class has instance methods that can do simple math operations on two numbers.
    The methods are: plus, minus, multiply and divide.

All the methods get two ints then the method does the required math operation and returns the result as an int.

for example:

LameCalculator lc = new LameCalculator();

lc.plus(1,1)
returns:2

lc.minus(1,1)
returns:0

lc.multiply(2,1)
returns:2

lc.divide(10,2)
returns:5
     */

    int num1;
    int num2;
    int result;

//    public LameCalculator(int num1, int num2) {
//        this.num1 = num1;
//        this.num2 = num2;
//
//    }

    public int plus(int num1, int num2){
        result = num1+num2;
        return result;
    }

    public int minus(int num1, int num2){
        result = num1-num2;
        return result;
    }

    public int multiply(int num1, int num2){
        result = num1*num2;
        return result;
    }

    public int divide(int num1, int num2){
        result = num1/num2;
        return result;
    }
}
