
class prg_12
{
  public static void main(String[]args)
  {
  char chr;

  for ( chr = 65; chr <= 122; chr = chr + 1)
  {
    if ( chr > 90 && chr < 97)
      continue;
    System.out.println(chr);
  }
  }
}