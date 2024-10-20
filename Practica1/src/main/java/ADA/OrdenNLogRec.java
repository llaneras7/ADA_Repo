package ADA;

class OrdenNLogRec extends Metodo {
    @Override
    public int codigo(int n) {
        int resultado = 0;
        for (int i = 0; i < n; i++) {
            resultado += recursivoLog(n);
        }
        return resultado;
    }

    int recursivoLog(int n) {
        if (n <= 1) {
            return 1;
        }
        return 1 + recursivoLog(n / 2);
    }
}

