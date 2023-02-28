import java.util.Scanner;


public class Array {
    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the row and coln:");
        int row=sc.nextInt();
        int coln =sc.nextInt();
        int numbers[][]=new int[row][coln];

        // INPUT

        for(int i=0;i<row;i++){
            for(int j=0;j<coln;j++){
                numbers[i][j]=sc.nextInt();
            }
        }

        // OUTPUT
        for(int i=0;i<row;i++){
            for(int j=0;j<coln;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

        // TRAVERSING

        int x=sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<coln;j++){
                if(numbers[i][j]==x){
                    System.out.println("x is found at location("+i+","+j+")");
                }
            }
        }



        //  FIND A MAX AND MIN NUMBER

        // int  numbers[]= new int [size];

        // // for input 
        // for(int i=0;i<size;i++){
        //     numbers[i]=sc.nextInt();
           
        // }
       
        // int min=Integer.MIN_VALUE;
        // int max=Integer.MAX_VALUE;

        // // output
        // for(int i=0;i<numbers.length;i++){
        //     if(numbers[i]<min){
        //         min=numbers[i];
        //         //System.out.println(Integer.MIN_VALUE);
        //     }
        //     if(numbers[i]>max){
        //         max =numbers[i];
        //        // System.out.println(Integer.MAX_VALUE);
        //     }
        //     System.out.println("largest number is:" +max);
        //     System.out.println("smallest numbers is:" +min);
        // } 




      //  GIVE A SIZE AND PRINT THE CHARACTER NAME

        // for input
        // for(int i=0;i<size;i++){
           
        //     name[i]=sc.next();
        //    System.out.println();
        // }

        // // for Output
        // for(int i=0;i<name.length;i++){
        //   System.out.print("name is :"+name[i]);
        //   System.out.println();   
        // }

       
    //  Scanner sc=new Scanner(System.in);
    //  int size=sc.nextInt();
    //  int numbers[]=new int[size];

    //  for(int i=0;i<size;i++){
    //     numbers[i]=sc.nextInt();
    //  }

    //  int x=sc.nextInt();

    //  for(int i=0;i<numbers.length;i++){
    //     if(numbers[i]==x){
    // //         System.out.println("x is found at index:"+ i);
    //     }
    //  }

    
     // intput take a by user 

     
        // Scanner sc =new Scanner(System.in);
        // int size=sc.nextInt();
        // int numbers[]=new int[size];
        // // loop for input from user 
        // for(int i=0;i<size;i++){
        //     numbers[i]=sc.nextInt();
        // }
        //  // loop for output 
        // for(int i=0;i<=size;i++){
        //     System.out.println(numbers[i]);
        // }


        //int[]marks=new int[3];  defining array first type
       // int marks[]=new int[3];   // defining array second type
       // int marks[]={90,95,99};  // defining array third type
        
        // marks[0]=90;
        // marks[1]=95;
        // marks[2]=99;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // for(int i=0;i<3;i++){
        //     System.out.println(marks[i]);
        // }



        // FIRST ARRAY PROGRAM

        // int[]marks=new int[3];
        // marks[0]=90;
        // marks[1]=95;
        // marks[2]=99;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
    }
}
