public class Marks { //Class 
    int English;
    int Physics;
    int Chemistry;
    int Mathematics;
    int JavaProgramming;

// Constructor
    Marks(int English, int Physics, int Chemistry, int Mathematics, int JavaProgramming){
        this.English=English;
        this.Physics=Physics;
        this.Chemistry=Chemistry;
        this.Mathematics=Mathematics;
        this.JavaProgramming=JavaProgramming;

    }
    public int sum(){ //Sum
        return English + Physics + Chemistry + Mathematics + JavaProgramming;
    }
    public double average(){ //Average
        return sum()/5.0;
    }
    void displayInfo(){ //Show
        System.out.println("Your total average precentage is:" + " " + average() + "%");
    }
}

//Marks class to calculate the sum and average of a Student