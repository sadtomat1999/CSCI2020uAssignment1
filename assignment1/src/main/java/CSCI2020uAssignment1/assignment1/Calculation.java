package CSCI2020uAssignment1.assignment1;

public interface Calculation {
    public float calc(float x, float y);        //only function in Calculation
}                                               //don't need any of the implementations to have any other purpose
                                                //other than basic calculations


//interfaces are like guidelines for classes
//good for large groups of classes, or just keeping your classes organised
//all implementations of the interface must have the functions the interface does
//for a facade pattern, we use a facade class to access the system of implementations
//this makes the system much easier to visualize and use
//a facade design or something similar should almost always be used when using interfaces