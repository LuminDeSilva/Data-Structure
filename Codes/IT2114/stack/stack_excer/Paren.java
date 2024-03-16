import java.util.*;
class Paren
{
	static boolean isCorrect(String equ)
	{
		boolean result=true;
		Stack cs=new Stack(equ.length());
		for(int i=0;i<equ.length();i++)
		{
			char p=equ.charAt(i);
			switch(p)
			{
				case '{' :
				case '[' :
				case '(' :
							cs.push(p);  //a{b(c[d]e)f}
							break;
				case '}' :
				case ']' :
				case ')' :
							if(!(cs.isEmpty()))
							{
								char e=cs.pop();
								if((e=='{' && p!='}') || (e=='[' && p!=']') || (e=='(' && p!=')'))
								{
									result=false;
									break;									
								}
							}
							else
							{
								result=false; //(A+B)]
								break;
							}
							break;
				default :
							break;
			}
		}
		return (result && cs.isEmpty());
	}
	
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Equation : ");
		String equation=sc.next();
		
		if(isCorrect(equation))
			System.out.println("Parentheses nested correctly");
		else
			System.out.println("Parentheses nested wrong");
	}
}