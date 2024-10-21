package ADA;

class OrdenExponencial2Rec extends Metodo {
    @Override
    public int codigo(int n) {
        if (n <= 1) {
            return 1;
        }
        return codigo(n - 1) + codigo(n - 1);
    }
}

