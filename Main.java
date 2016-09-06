package ua.epaam;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //task_1.1
 int i, k, m;
        i=12*4;
        k=3;
        m=158*2;
        System.out.println (i/k+m);
        //task_1.2
 int a, b;
        a=14;
        b=a/20*9+a*(29-a*2+a/3);
        System.out.println (b);
        //task_1.3
 int q, w;
        q=21;
        w=8;
        int result1=q/w;
        int result2=q%w;
        System.out.println(result1+" and the rest "+result2);
        //task_2.1
 int r=12;
        int l=r%10;
        int p=(r/10)%10;
        System.out.println("Sum is " + "= " + (l+p));
        //task_2.2
 int n=256;
        int n1=n%10;
        int n2=(n/10)%10;
        int n3=(n/100)%10;
        System.out.println("Sum is " + "= " + (n1+n2+n3));
        //task_2.3
 System.out.println ("Enter a two-digit number from the keyboard");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println((num%10)+((num/10)%10));
        //task_2.4,2.5
 double t =6.43;
        double x = (double)Math.round(t);
        System.out.println(x);
        //task_3.1
 int value=19;
        if(value%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Uneven");
        }
        //task_3.2
 double j=8.5;
        double z=11.45;
        int g=10;
        double v=Math.abs(g-j);
        double h=Math.abs(g-z);
        if(v>h){
            System.out.println(z+" is closer to "+g);
        }
        else {
            System.out.println(j+" is closer to "+g);
        }
        //task_3.3
 int min=100;
        int max=999;
        int random = (int) (min + Math.random() * (max - min)) ;
        int s=random%10;
        int s1=(random/10)%10;
        int s2=(random/100)%10;
        System.out.println("Number is " +random+ " and max digit in it is " +Math.max(s, Math.max(s1,s2)));
        //task_3.4
 int minimum=5;
        int maximum=155;
        int rand = (int) (5 + Math.random() * (155- 5)) ;
        if (rand>=25 && rand<=100){
            System.out.println ("Number " + rand+ " is within [25;100]");
        }
        else {
            System.out.println ("Number " + rand+ " is not within [25;100]");
        }
        //task_3.5
  int value1=8; int value2=5; int value3=1;
        System.out.println(value1+value2+value3);
        if(value1<value2&&value1<value3){
            if(value2<value3)
                System.out.println(value1+value2+value3);
            else System.out.println(value1+value3+value2);
        }
        if(value2<value1&&value2<value3){
            if(value1<value3)
                System.out.println(value2+value1+value3);
            else System.out.println(value2+value3+value1);
        }
        if(value3<value1&&value3<value2){
            if(value1<value2)
                System.out.println(value3+value1+value2);
            else System.out.println(value3+value2+value1);
        }




















    }

}
