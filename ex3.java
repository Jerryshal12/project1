class ex3 
{
public static void main(String args[])
{

for(int i=1;i<9;i++)
{
for(int j=1;j<9;j++)
{

if(i==9-j && j==9-i)
System.out.print("a");
else
if(i==j)
System.out.print("a");
else
System.out.print("b");

}
System.out.println();
}
}
}


