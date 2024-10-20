package ADA;

public class ComparaNyN2ConLimite {
    public static void main(String[] args) {

        Complejidad complejidad = new Complejidad();
        OrdenCuadradoIter ordenCuadradoIter = new OrdenCuadradoIter();
        OrdenLinealRec ordenLinealRec = new OrdenLinealRec();

        int[] tam = {1, 5, 10, 50, 100, 500, 1000};

        // Medir tiempos de OrdenCuadradoIter
        long[] tiempoIter = complejidad.medirTiempos(ordenCuadradoIter, tam);

        // Medir tiempos de OrdenLinealRec
        long[] tiempoRec = complejidad.medirTiempos(ordenLinealRec, tam);

        // Simulación de carga extra para n = 10
        for (int i = 0; i < tam.length; i++) {
            if (tam[i] == 10) {
                tiempoRec[i] += 1000; // Incrementar en 1000 nanosegundos
            }
        }

        // Mostrar los tiempos
        System.out.println("Tiempos iteración orden cuadrado:");
        for (long tiempo : tiempoIter) {
            System.out.println(tiempo);
        }

        System.out.println("Tiempos recursión orden lineal:");
        for (long tiempo : tiempoRec) {
            System.out.println(tiempo);
        }

        // Mostrar la tendencia del cociente T1(n) / T2(n)
        System.out.println("Cociente T1(n) / T2(n):");
        for (int i = 0; i < tam.length; i++) {
            double cociente = (double) tiempoRec[i] / (double) tiempoIter[i];
            System.out.printf("n = %d: %.5f%n", tam[i], cociente);
        }
    }
}
