package ADA;

public class OrdenLinealRec extends  {

    @Override
    int codigo(int n) {
        int resultado = n;
        resultado ++;
        resultado = codigo(resultado);
        return resultado;
    }

}
