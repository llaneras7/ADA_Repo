package ADA;

class OrdenCubicoRec extends Metodo {
    @Override
    int codigo(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + codigoInterno1(n - 1);
    }

    int codigoInterno1(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + codigoInterno2(n - 1);
    }

    int codigoInterno2(int n) {
        if (n <= 1) {
            return 1;
        }
        return 1 + codigoInterno2(n - 1);
    }
}

