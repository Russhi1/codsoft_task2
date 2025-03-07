# Task 2


# Student Grade System


The code asks the user for the marks of a Student and calculates the total, average and percentage and accordingly gives the grades


## Marks class to be inherited

```
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
```


## Main class that inherits the Marks class

```
import java.util.Scanner;
class StudentGrade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Scanner object
        //Taking input
        System.out.println("Enter the marks of English:");
        int English = sc.nextInt();

        System.out.println("Enter the marks of Physics:");
        int Physcis = sc.nextInt();

        System.out.println("Enter the marks of Chemistry:");
        int Chemistry = sc.nextInt();


        System.out.println("Enter the marks of Mathematics:");
        int Mathematics = sc.nextInt();


        System.out.println("Enter the marks of Javaprogramming:");
        int JavaProgramming = sc.nextInt();

        Marks marks1 = new Marks(English, Physcis, Chemistry, Mathematics, JavaProgramming);//Creating an object of the Marks class

        marks1.displayInfo();
        //Grading System

        if (marks1.sum() >=450){
            System.out.println("Grade: O");
        }
        else if(marks1.sum()>=400){
            System.out.println("Grade: A+");
        }
        else if(marks1.sum()>=350){
            System.out.println("Grade: A");
        }
        
        else if (marks1.sum()>=300){
            System.out.println("Grade: B+");
        }
        else if(marks1.sum()>=250){
            System.out.println("Grade: B");
        }
        else if(marks1.sum()>=200){
            System.out.println("Grade: C");
        }
        else{
            System.out.println("Fail");   
        }
        sc.close();
        
        }
    }

// Final main class to print the calculated sum and average as well as grade them according to the total
```

# Example output
![Screenshot 2025-03-04 081350](https://github.com/user-attachments/assets/fcf133bc-c81f-4c99-93e6-a7cc30480e02)

