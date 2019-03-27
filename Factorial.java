
/**
 * Write a description of class factorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Factorial
{
    public Factorial(){
    
    }
    
    public  int fact(int n){
    int factorial;
      if(n==0){
      factorial=1;
      }
    else{
    factorial= fact(n-1)*n;
    }
    return factorial;
    
    }
}
