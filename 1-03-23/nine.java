class nine{
 public static void main(String[]args)
 {
    String st="shubhayu";
    char c[]=st.toCharArray();
    for(int i=0;i<c.length-1;i++)
    {
		for(int j=i+1;j<c.length;j++)
		{
			if(c[i]==c[j])
			{
				System.out.println(c[i]);
			}
		}

	}
 }
}