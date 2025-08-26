public class funcprimo {
    public static boolean ehPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int numero = 17;
        System.out.println(numero + (ehPrimo(numero) ? " é primo." : " não é primo."));
        
    }
}