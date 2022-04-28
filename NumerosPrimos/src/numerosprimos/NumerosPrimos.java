package numerosprimos;
import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int contador = 1;
        int divi=0;
        while(contador != 0){
            System.out.println("Por favor, digite o número que você quer verificar se é primo. Digite 0 para parar.");
            contador = teclado.nextInt();
            
            for(int i=0; i<contador; i++){
                if(i%contador ==0){
                    divi++;
                }
            }
            
            if(divi ==2){
                
                
            }
        }
        
    }
    
}
