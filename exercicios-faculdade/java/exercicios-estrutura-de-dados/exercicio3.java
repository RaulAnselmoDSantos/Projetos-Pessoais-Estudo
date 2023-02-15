public class exercicio3 {
        
    public static int escreve(int num) {
        int j = 0;
        if(num >= j){
            System.out.println(j);
            j = j + 1;
            return j;
           
        } else
            
            
            return escreve(num);
           
    }

    public static void main(String[] args) {
        System.out.println(escreve(3));
    }
    
}
