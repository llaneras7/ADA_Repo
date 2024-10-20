package ADA;

public class ComparaNyN2 {
    public static void main(String[] args) {

        Complejidad complejidad = new Complejidad();
        OrdenCuadradoIter ordenCuadradoIter = new OrdenCuadradoIter();
        OrdenLinealRec ordenLinealRec = new OrdenLinealRec();

        int [] tam =  {1, 5, 10, 50, 100, 500, 1000};

        long [] tiempoIter = complejidad.medirTiempos(ordenCuadradoIter, tam);
        long [] tiempoRec = complejidad.medirTiempos(ordenLinealRec, tam);

        // Mostrar los tiempos
        System.out.println("Tiempos iteración orden cuadrado:");
        for (long tiempo : tiempoIter) {
            System.out.println(tiempo);
        }

        System.out.println("Tiempos recursión orden lineal:");
        for (long tiempo : tiempoRec) {
            System.out.println(tiempo);
        }
    }
}