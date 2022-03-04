package CSCI2020uAssignment1.assignment1;

public class Addition implements Calculation{

    @Override
    public float calc(float x, float y){        //the implementation needs this class to function
        return x + y;                           //without it, an error is given, as it is not following the interface
    }

}
