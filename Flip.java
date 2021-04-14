import java.util.Scanner;
public class flip
{
public static void main(String[] args)
{
Scanner ss=new Scanner(System.in);
String s;
int i,x=0,y=0;
s=ss.nextLine();
char[] c=s.toCharArray();
int len=c.length;
for(i=0;i<len;i++)
{
if(i%2==0 && c[i]=='1')
	x++;
else if(i%2==1 && c[i]=='0')
	x++;
if(i%2==0 && c[i]=='0')
	y++;
else if(i%2==1 && c[i]=='1')
	y++;
}
int res=(x<y)?x:y;
System.out.println(res);
}
}
