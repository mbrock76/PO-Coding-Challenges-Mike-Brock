
import java.util.*;

public class Main
{
    public static void printMedians(int N, int[][] A){
        
        for(int i = 0; i < N; i++){
            
            Arrays.sort(A[i]);
            System.out.println(A[i][1]);
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();
        int[][] A = new int[N][3];
        
        for (int i = 0; i < N; i++)
        {
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();
            A[i][2] = sc.nextInt();
        }
        
        sc.close ();
        
        printMedians(N, A);
        
    }
}
