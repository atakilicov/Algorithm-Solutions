package DSALG;



/**
 *
 * @author atakilic
 */
public class DisplayDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         DisplayDigits(643);
    }
    
      public static void DisplayDigits(int n){
          
            
            if(n!=0){
                System.out.println(n%10);
                
                
            }
            else if(n==0){
                 return;
            }
            DisplayDigits(n/10);
           
                
            
            
                
             
           
            
        }
    
}
