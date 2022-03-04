package CSCI2020uAssignment1.assignment1;

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator demo = new Calculator();         //initialization of facade class

        float x = 3.5f;                             //basic values for testing
        float y = 8.2f;

        System.out.println(demo.preformAdd(x,y));   //test for each implementation of Calculation
        System.out.println(demo.preformSub(x,y));
        System.out.println(demo.preformMul(x,y));
        System.out.println(demo.preformDiv(x,y));
    }

}

//Zachariah Friesen -- Frank Delgado