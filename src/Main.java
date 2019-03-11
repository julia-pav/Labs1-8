/**
 * C2 = 1 (01 = "-")
 * C3 = 2 (C = 2)
 * C5 = 3 (02 = "+")
 * C7 = 1 (i and j type is "short")
 */
public class Main {
    public static void main (String[] args) {
int a = 3;
        int b = 1;
                int n = 5;
                        int m = 25;
                        int C = 2;
                        float S = 0;
        for (int i = a; i <= n; i++) {
            for (int j = b; j <= m; j++) {
                S = S + ((float) i / j) / (i - C);
            }
        }
                System.out.println(S);

    }
}
