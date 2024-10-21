package ADA;

public class OrdenNLogIter extends Metodo{

    @Override
    public int codigo (int n){
        int resultado = 0;

        for (int i = 0; i <= n; i++){
            int aux = n;
            while (n > 1) {
                aux = aux / 2;  // Dividimos n a la mitad en cada iteración
                resultado++; // Incrementamos el contador en cada iteración
            }
        }
        return resultado;
    }
}
