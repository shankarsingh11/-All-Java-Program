import javax.swing.text.AsyncBoxView;

class Mixfunction{
    int a;
    int b;
    int ans=0;
    Mixfunction(int x,int y){

        System.out.println("here is input as reference");
      a=x;
      b=y;
    }
    int sum(){
    ans=a+b;
    return ans;
    }
    int mul(){
        int ans =a*b;
        return ans;
    }
    int sub(){
        int ans=a-b;
        return ans;

    }
}

public class shankar1 {
    public static void main(String[] args) {
       Mixfunction calc=new Mixfunction(10, 5);

       calc.sum();
       System.out.println(ans);
       
System.out.println("this is a all calculation:");
    //    System.out.println("sum is :"+ calc.sum());
    //    System.out.println(" multiplication is :"+ calc.mul()); 
    //    System.out.println("subtruction is :"+ calc.sub()); 
       
    }
}
