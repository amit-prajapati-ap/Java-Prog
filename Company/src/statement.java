import java.util.Scanner; // Corrected import statement

class Larger {
    public static void main(String[] args) { // Corrected "string" to "String"
      /*  int a, b, large;

        System.out.println("Enter two numbers:");
        Scanner s = new Scanner(System.in); // Corrected "scanner" to "Scanner" and "system" to "System"

        a = s.nextInt(); // Corrected "nextint" to "nextInt"
        b = s.nextInt();

        large = a;
        if (b > large) {
            large = b;
        }

        System.out.println("Larger number = " + large);*/
//nested if statement

      /*  int a, b, c, large;

        System.out.println("Enter three numbers:");
        Scanner s = new Scanner(System.in); // Correct capitalization

        a = s.nextInt(); // Correct capitalization
        b = s.nextInt();
        c = s.nextInt();

        if (a > b) {
            if (a > c)
                large = a;
            else
                large = c;
        } else {
            if (b > c)
                large = b;
            else
                large = c;
        }

        System.out.println("The largest number is " + large);*/

        //else if ladder
       /* int marks;
        char grade;
        System.out.println("enter marks of the student");
        Scanner s=new Scanner(System.in);
        marks=s.nextInt();
        if (marks>=80)
            grade='A';
        else if (marks>=60)
        grade='B';
        else if (marks>=40)
        grade='C';
        else
        grade='D';
        System.out.println("grade="+grade);*/

        //sum of two
       /* int a,b,sum;
        System.out.println("enter two number");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        sum= a+b;
        System.out.println(sum);*/

        /*int a=5,b=8,c=9,d;
        d=a*b*c;
        System.out.println(d);*/

      /*  int r;
        float pie=3.14f;
        float area;
        System.out.println("enter the value of r");
        Scanner s=new Scanner(System.in);
        r=s.nextInt();
        area=(pie*r*r);
        System.out.println(area);*/

        /*int[] marks = new int[5];
        marks[0] = 100;
        marks[1] = 98;
        marks[2] = 104;
        marks[3] = 106;
        marks[4] = 105;
        System.out.println(marks[2]);*/

       /* float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("the value of sum is" + sum);*/

       /* float[]
       marks={45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
                float num=1001;
        boolean isInArray= false;
        for (float element:marks){
            if (num==element){
                isInArray=true;
                break;
            }
        }
   if (isInArray){
       System.out.println("the value is present in the array");
   }
   else {
       System.out.println("the value is not present in the array");
   }*/


        //error

/*  int[][] mat1={{1,2,3},
                {4,5,6}};
 int[][] mat2={{7,8,9},
               {8,9,8}};
 int[][] result={{0,0,0},
                 {0,0,0}};
 for (int i=0;i<mat1.length;i++){
     for (int j=0;j<mat1[i].length;j++) {
        // System.out.println(result[i][j] + " ");
        System.out.println(j);
     result[i][j] = mat1[i][j] + mat2[i][j];
     }
     System.out.println(i);
     }*/


 }
    }













