import java.io.*;
import java.util.*;

public class Main {
/* 
cb=current box
tb=total box
ssf=searched so far    (boxes traversed so far)
ts=total searches
asf =alloted searches so far (box  situations)
*/
  public static void combinations(int cb, int tb, int ssf, int ts, String asf){
      if(cb>tb)
      return;
      if(ts==ssf)
      {
          
          System.out.print(asf);
          if(cb<=tb)
          {
              for(;cb<tb;cb++)
          {
              System.out.print("-");
          } 
          }
         
          System.out.println();
          
          
          return;
      }
      
   
      combinations(cb+1,tb,ssf+1,ts,asf+"i");
         combinations(cb+1,tb,ssf,ts,asf+"-");
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int nboxes = Integer.parseInt(br.readLine());
    int ritems = Integer.parseInt(br.readLine());
    
    combinations(1, nboxes, 1, ritems, "i");
    combinations(1, nboxes, 0, ritems, "-");
  }
  

}
