package scripts;

import org.testng.annotations.Test;

public class demo {

	
@Test
public void reverse()
{
      String s="preeti";
      String empty="";
      for(int i=5;i>=0;i--)
      {
    	  empty=empty+s.charAt(i);
      }
   System.out.println(empty);

	}

}
