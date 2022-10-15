package patterns;

public class numberSquare {
        public static void main(String[] args) {
                pattern(5);
        }

        public static void pattern(int n){
                int originalN = n;
                n = n * 2;
                for(int i = 0; i <= n ; i++){
                        for(int j = 0; j <= n; j++){
                                int num = originalN - min(i, j, n-i, n-j);
                                System.out.print(num + " ");
                        }
                        System.out.println();
                }
        }

        public static int min(int a, int b, int c, int d){
                int minNum = Math.min(a,b);
                minNum = Math.min(minNum, c);
                return Math.min(minNum,d);
        }

}
