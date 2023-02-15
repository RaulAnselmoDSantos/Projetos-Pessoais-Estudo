
public class exercicio2 {
    public static int pot(int x, int n){
        
        if(n == 0){
            return 1;
        } else 
            return (x * pot(x, n-1));
    }
   
    public static void main(String[] args) {
        System.out.println(pot(2,3));
    }
    
}
