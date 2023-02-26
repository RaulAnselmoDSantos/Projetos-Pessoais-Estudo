public class exercicio3 {
    
    public static int crecent(int n){
        if(n>0){
            System.out.println(crecent(n-1));
            
        } return n;
         
    }
    
    public static void main(String[] args) {
        System.out.println(crecent(6));
    }

}
