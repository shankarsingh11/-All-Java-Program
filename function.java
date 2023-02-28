 import java.util.Scanner;
 import java.lang.Math;



 // infinite do while loop use 

// public class function{
//   public static void printHello(int n){
//     do{
//       System.out.println("hello");
//     }while(n>=0);
//   }
//   public static void main(String[] args) {
//     Scanner sc =new Scanner (System.in);
//       int n =sc.nextInt();
//       printHello(n);

//   }
// }



 // CALC A POWER 

// public class function{
//   public static int CalcPower(int exponent,int base ){
//     int  result1 =(int)Math.pow(base,exponent);
//     return result1; 
//   }
//   public static double CalcDecimalPower(int exponent,int base ){
//     double result2 =Math.pow(base,exponent); // CALC A 2.2^3
//     return result2; 
//   }
//   public static void main(String[] args) {
//     Scanner sc =new Scanner (System.in);
//        int base =sc.nextInt();
//        int exponent =sc.nextInt();
//       int   result1 = CalcPower(exponent,base);
//       double result2=CalcDecimalPower(exponent,base);
//       System.out.println("calc of power is:"+ result1);
//       System.out.println("CalcPower Is :"+ result2);
//   }
// }





 // ELIGIBLE FOR VOTE

//  public class function{
//   public static void printPerson(int age){
//     if(18<=age){
//       System.out.println("eligible for vote");
//       System.out.println("youth person");
//     }
//     else{
//       System.out.println("not eligible for vote");
//       System.out.println("not youth");
//     }

//   }
//   public static void main(String[] args) {
//     Scanner sc =new Scanner (System.in);
//     int age =sc.nextInt();
//     printPerson(age);
//   }
//  }



 // circumference // area of circle 

// public class function{
//   public static double printCircumference(int r){
    
//    double  circumference= 2*3.14*r;
//     return circumference;
//   }
//   public static double printCircleArea(int r){
//     double areacircle=3.14*r*r;
//     return areacircle;
//   }
//   public static void main(String[] args) {
//     Scanner sc =new Scanner (System.in);
//     int r=sc.nextInt();
//      double circumference = printCircumference(r);
//      double areacircle=printCircleArea(r);
//     System.out.println("circumference of circle is :"+ circumference);
//     System.out.println("circle area is :"+ areacircle);

//   }
// }



// PRINT A GREATER NUMBER

// public class function{
//   public static void printGreaterNumber(int a,int b){
//     if(a<b){
//       System.out.print("greater number is :"+b);
//     }
//     else{
//       System.out.print("greater number is :"+a);
//     }
//   }
//  public static void main(String[] args) {
//    Scanner sc = new Scanner (System.in);
//    int a=sc.nextInt();
//    int b=sc.nextInt();
//    printGreaterNumber(a,b);
//  }
// }




 // SUM OF ODD NUMBER 1 TO N

  // public class function{
  //   public static int printSumOddNumber(int n){
  //       int sum=0;
  //     for(int i=1;i<=n;i++){
  //      if(i%2!=0){
  //       sum=sum+i;
  //       i++;
  //       }
  //     } 
  //     return sum;
  //   }
  //   public static void main(String[] args) {
  //     Scanner sc =new Scanner(System.in);
  //     int n=sc.nextInt();
  //     int sum=printSumOddNumber(n);
  //     System.out.println("sum of odd number is :"+ sum);  
  //   }
  // }



 // AVERAGE A THREE NUMBERS

//   public class function{
// public static float printAverage(float a,float b,float c){
//      float average=(a+b+c)/3;
//      return average;
// }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         float a=sc.nextFloat();
//         float b=sc.nextFloat();
//         float c=sc.nextFloat();
//          float average=printAverage(a,b,c);
//         System.out.println("average is :"+ average);
//       }
//     }


// // PRINT A TABLE


// public class function{
//     public static void printTable(int n){
        
//         for(int i=1;i<=10;i++){
//             System.out.println("table is :"+i*n);
//         } 
//     }
//     public static void main(String[] args) {
//       Scanner sc = new Scanner (System.in);
//       int n=sc.nextInt();
//       printTable(n);
//     }
// }

// CHECK A NUMBER EVEN OR ODD 

// public class function{
//     public static void checkEvenOddNumber(int n){
//      if(n%2==0){
//        System.out.println("even number:");
//      }
//      else{
//         System.out.println("Odd number:");
//      }
//      return;
//     }
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in); 
//       int n=sc.nextInt(); 
//       checkEvenOddNumber(n);
//     }
// }

// PRINT A FACTORIAL 
// public class function{
//     public static void printFactorial(int n){
//         if(n<0){
//             System.out.println("invalid number");
//         }
//        int factorial=1;
//        for(int i=n;i>=1;i--){
//         factorial=factorial*i;
//        }
//        System.out.println(factorial);
//        return;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         printFactorial(n);
       
//        sc.close();
    

//     }
// }


// MULTIPLY A TWO NUMBERS
// public class function{
//     public static int Product(int a ,int b){
//         int product=a*b;
//         return product;
//     }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int product=Product(a,b);
//         System.out.println("calculate a product is :"+ product);
//         sc.close();
//     }
// }

// METHOD TWO // SUM OF TWO NUMBER 

// public class function{
//     public static int CalcSum(int a,int b){
//         int sum=a+b;
//         //System.out.println(sum);
//         return sum;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b=sc.nextInt();
//          int sum = CalcSum(a,b);
//          System.out.println("sum of two number is :"+ sum);
//         sc.close();
//     }
// }



//METHOD 1
// public class function{
//     public static int CalcSum(int a,int b){
//         int sum=a+b;
//         System.out.println(sum);
//         return sum;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b=sc.nextInt();
//         CalcSum(a,b);
//         sc.close();
//     }
// }


// PRINT A NAME USING A FUNCTION

// public class function{
//     public static  void printMyName(String name){
//       System.out.println(name);
//       return;
//     }
    
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String name=sc.next();
// //         printMyName(name);// CALL KIYA  FUNCTION KO
//         sc.close();
//     }
// }