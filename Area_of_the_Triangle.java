import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args)
    {
        double a,b,c,s,area;
        Scanner n=new Scanner(System.in);
        a=n.nextDouble();
        b=n.nextDouble();
        c=n.nextDouble();
        s=((a+b+c)/2);
        area=Math.sqrt((s)*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
    }
}