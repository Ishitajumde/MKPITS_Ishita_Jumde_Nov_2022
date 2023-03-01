class two{
 public static void main(String[]args)
 {
     String src="mam";
     String rev=" ";
     int len=src.length();
     for(int i=len-1;i>=0;i--)
     {
        rev=rev+src.charAt(i);
     }
     System.out.println(rev);
     if(src.equals(rev))
     {
		 System.out.println("it is pallindrom");
	}
	else{
		  System.out.println("it is not pallindrom");
		}
 }
   }