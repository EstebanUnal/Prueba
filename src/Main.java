import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int C = entrada.nextInt();
        for(int i = 0; i < C ; i++){
            int N = entrada.nextInt();
            Vector <Integer> A = new Vector <Integer>();
            for(int j = 0; j < N;j++){
                int a = entrada.nextInt();
                A.add(a);
            }
            int M = entrada.nextInt();
            Vector <Integer> B = new Vector <Integer>();
            for(int k = 0 ; k < M ; k++){
                int b = entrada.nextInt();
                B.add(b);
            }
            int Y = 0;
            int G = B.size();
            for(int g = 0; g < G ; g++){
                int Z = B.get(g);
                int z = A.indexOf(Z);
                if(z != -1){
                    Y = Y + 1;
                }
            }
            if(Y == G){
                System.out.println("B es subconjunto de A");
            }
            else{
                System.out.println("B no es subconjunto de A");
            }
        }
        System.out.println("Que maricada con esta mierda");
    } 
}

