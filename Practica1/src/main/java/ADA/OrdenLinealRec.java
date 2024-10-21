package ADA;

public class OrdenLinealRec extends Metodo{

    @Override
    public int codigo(int n) {
        if (n <= 1) {
            return 1;
        }
        return 1 + codigo(n - 1);
    }
}
