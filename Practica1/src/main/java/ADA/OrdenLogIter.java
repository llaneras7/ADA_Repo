package ADA;

public class OrdenLogIter extends Metodo{
    @Override
    public int codigo(int n) {
        int resultado = 0;

        // Un bucle que se ejecuta mientras n sea mayor que 1, dividiendo n entre 2 en cada iteración
        while (n > 1) {
            n = n / 2;  // Dividimos n a la mitad en cada iteración
            resultado++; // Incrementamos el contador en cada iteración
        }

        return resultado;
    }
}
