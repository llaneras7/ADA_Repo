package ADA;

public class OrdenCuadradoRec extends Metodo {
    @Override
    public int codigo(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + codigoInterno(n - 1);
    }

    int codigoInterno(int n) {
        if (n <= 1) {
            return 1;
        }
        return 1 + codigoInterno(n - 1);
    }
}
