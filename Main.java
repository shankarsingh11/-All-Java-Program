class ArrayExamples{
    void  DemoArrays(){
       int [] ages=new int[3];   // declaration of array
        float weight[]=new float[4];
        String name[]=new String[5];
        int student_marks[]={60,75,90,80,57};// literal

        ages[0]=12;
        ages[1]=13;
        int i=0;

        System.out.println("print the element using while loop :");
        // use while loop

        while (i<2){
            System.out.println(ages[i]);
            i++;
        }

       // ages[-2]=50;  // out of bounded
       // ages[3]=30; // index 3  out of bounded for length 3

//        System.out.println(ages[0]);
//        System.out.println(ages[1]);
//        System.out.println(ages[2]);

        weight[0]=39;
        weight[1]=40;
        weight[2]=52;
        for ( i = 0; i <weight.length; i++) {

            System.out.println(weight[i]);

        }
//        System.out.println(weight[0]);
//        System.out.println(weight[1]);
//        System.out.println(weight[2]);
//        System.out.println(weight[3]);

        name[0]="shankar singh";
        name[1]="deepak singh";
        name[2]="minakshi";
        name[3]="Suraj";
        System.out.println("print the element using for each loop : ");
// for each loop
        for (String student:name) {

            System.out.println(name);
        }

//        System.out.println(name[0]);
//        System.out.println(name[1]);
//        System.out.println(name[2]);
//        System.out.println(name[3]);
//        System.out.println(name[4]);
    }

    void multiArrays(){

        int[][] multi=new int[2][3];

        float[][] arr_1={{30,90,40},{20,10,39},{50,58,60}}; // 2D Array

        int [][][] age_3=new int[3][2][1];

        int [][][] age_4={{{16,34,46},{43,56,67}}};


        multi[0][0]=10;
        multi[0][1]=20;
        multi[0][2]=30;
        multi[1][0]=40;
        multi[1][1]=50;
        multi[1][2]=60;

        System.out.println("print the multi dimention array using length");

        for (int i = 0; i < multi.length; i++) {

            for (int j = 0; j < multi[i].length; j++) {

                System.out.println(multi[i][j]);

            }

        }

//        System.out.println(multi[0][0]);
//        System.out.println(multi[0][1]);
//        System.out.println(multi[0][2]);
//        System.out.println(multi[1][0]);
//        System.out.println(multi[1][1]);
//        System.out.println(multi[1][2]);


    }



}


public class Main {
    public static void main(String[] args) {
        ArrayExamples obj=new ArrayExamples();
        obj.DemoArrays();
        obj.multiArrays();


    }
}