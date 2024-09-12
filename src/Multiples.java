public class Multiples {
    public static int main(int n, int a, int b) {
        int c = 0;
        for(int i = 1; i <= n; i++) {
            if (i % a ==0 || i % b ==0) {
                c++;
            }
        }
        return c;
    }

    public static int main(String[] args) {
        int c = 0;
        for(int i = 1; i <= 1000; i++) {
            if (i % 3 ==0 || i % 5 ==0) {
                c++;
            }
        }
        return c;
    }
}
