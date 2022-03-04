package CSCI2020uAssignment1.assignment1;       //this is the facade class
                                                //we use this class to access the implementations of the interface
public class Calculator {
    private Calculation add;        //initializes implementations
    private Calculation sub;        //right now they have no use, cannot use them for calculations
    private Calculation mul;
    private Calculation div;

    public Calculator(){
        add = new Addition();           //gives each implementation their properties
        sub = new Subtraction();        //since all the implementation implement Calculation, each of the classes are
        mul = new Multiplication();     //Calculations. this is why you can do an operation like Calculation = Addition.
        div = new Division();
    }

    public float preformAdd(float var1, float var2){
        return add.calc(var1,var2);                     //each of these implementations have the function calc,
    }                                                   //but what the function does is different for each class

    public float preformSub(float var1, float var2){
        return sub.calc(var1,var2);
    }

    public float preformMul(float var1, float var2){
        return mul.calc(var1,var2);
    }

    public float preformDiv(float var1, float var2){
        return div.calc(var1,var2);
    }
}

//Zachariah Friesen -- Frank Delgado