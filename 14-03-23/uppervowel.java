/*Java program to convert uppercase vowel to lowercase  in string.*/
class uppervowel{
public static void main(String[]args)
{
  String str="MY VOWEL PROGRAM";
  char c[]=str.toCharArray();
  char lowercase;
  for(int i=0;i<c.length;i++)
  {
     if(c[i]=='A' || c[i]=='E' || c[i]=='I' || c[i]=='O' || c[i]=='U')
     {
        lowercase=Character.toLowerCase(c[i]);
        c[i]=lowercase;
     }
      System.out.print(c[i]);
  }
}
}