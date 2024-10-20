package ADA;

public class OrdenConstanteIter extends Metodo{

    @Override
    public int codigo(int n){
        int resultado = 0;
        for (int i = 0; i < 4; i++){ //El bucle no depende de la entrada
            resultado += i;
        }

        return resultado;
    }
}
