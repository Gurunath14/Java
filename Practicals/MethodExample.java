import java.util.Scanner;
class MethodExample{

//non- static parameter method
public void evenOdd(int num){

if(num % 2 == 0){
System.out.println("its even "+num);
}
else
System.out.println("its odd "+num);
}

//------------------------------------------------------

//static parameter method with return keyword
public static int add(int n1, int n2){
int result = n1 + n2;
return result;
}

//-------------------------------------------------------


public static void main(String args[]){

int n1 = 50;
int n2 = 100;
//invoke static method with class
int result = add(n1,n2);
System.out.println("the addition is "+result);


Scanner s = new Scanner(System.in);
System.out.println("enter number");
int num = s.nextInt();

MethodExample m = new MethodExample();
//invoke non-static method with object of class
m.evenOdd(num);
}
//------------------------------------------------

}