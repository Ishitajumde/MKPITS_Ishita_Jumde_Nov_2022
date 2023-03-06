class pg9{
public static void main(String[]args)
{
   for(int i=1;i<=4;i++)
   {
        for(int j=65;j<=69-i;j++)
        {
            System.out.print(char(j) +" ");
        }
        System.out.print("\n");
   }
}
}