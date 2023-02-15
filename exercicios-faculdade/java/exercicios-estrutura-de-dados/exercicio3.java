public class exercicio3 {

    public static int escreve(int num) {
        
        if(num == 0){
            return 0;
        } else
            System.out.println(num);
            return escreve(num-1);
           
    }

    public static void main(String[] args) {
        System.out.println(escreve(3));
    }
    
}
