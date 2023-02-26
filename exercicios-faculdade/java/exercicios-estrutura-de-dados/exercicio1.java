
public class exercicio1 {
    
    public static int soma(int n) {
        if(n==1){
            return 1; 
        } else 
            return (n+soma(n-1));  
    }
    public static void main(String[] args) {
        System.out.println(soma(4));
    }
}