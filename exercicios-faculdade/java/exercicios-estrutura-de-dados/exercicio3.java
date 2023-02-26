public class exercicio3 {
        
    public static void todos_crescente(int n){
        if(n>=0){
            todos_crescente(n-1);
            System.out.println(n);
        }
    }
}
