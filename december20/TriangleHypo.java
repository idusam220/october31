import javax.swing.JOptionPane;
import java.util.Scanner;
public class TriangleHypo
{
	public static void main(String[]args)
	{
	   System.out.println("Our sytem is started");
	   Scanner sc = new Scanner(System.in);
	   int a = sc.nextInt(Integer.parseInt(JOptionPane.showInputDialog("Please enter the value of a:")));
	   System.out.println(a);
	   sc.nextInt();
	   int b = sc.nextInt(Integer.parseInt(JOptionPane.showInputDialog("Please enter the value of b:")));
	   System.out.println(b);
	   double c = (double)Math.sqrt((a*a)+(b*b));
	   System.out.println(c);




	}
}