import java.util.Scanner;
public class Rectangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);



for(int i=1;i<4;i++){
System.out.println("Enter the length and width");
int l=scan.nextInt();
int w=scan.nextInt();

Rectangle r1=new Rectangle(l,w);

System.out.println("The area is" + r1.getArea());
System.out.println("The area is" + r1.getPerimeter());
}








	}

}
