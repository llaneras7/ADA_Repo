package ADA;

public class DosCasos extends Metodo{

    @Override
    public int codigo(int n){
        //Mejor caso: Si n es mejor o igual a 0
        if (n <= 0) {
            return 0;  // Complejidad constante
        }

        // Peor caso: Si n es mayor que 0, recorremos un bucle hasta n (complejidad O(n))
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        return suma;  // Complejidad lineal O(n)
    }
}
