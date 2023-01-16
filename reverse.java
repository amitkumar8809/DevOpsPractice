import java.lang.*;
import java.util.*;
public class Reverse{
public static void main(String[] args)
{

	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int revrs=0;
	while(num!=0){
		int rem=num%10;
		int revrs=revrs*10+rem;
		num=num/10;
	}
	System.out.println(revrs);
}
}
