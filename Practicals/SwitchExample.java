import java.util.Scanner;
class SwitchExample{

public void show(){

Scanner s = new Scanner(System.in);
System.out.println("Enter day");
int day = s.nextInt();
switch(day){
case 1:
System.out.println("its me MONDAY");
break;
case 2:
System.out.println("its me TUESDAY");
break;
case 3:
System.out.println("its me WEDNESDAY");
break;
case 4:
System.out.println("its me THURSDAY");
break;
case 5:
System.out.println("its me FRIDAY");
break;
case 6:
System.out.println("its me SATURDAY");
break;
case 7:
System.out.println("its me SUNDAY");
break;
default:
System.out.println("incorrect day");
}
}
public static void main(String args[]){
SwitchExample e = new SwitchExample();
e.show();

}
}