package ADA;

public class OrdenCubicoIter extends Metodo{

    @Override
    int codigo (int n){
        int resultado = 0;
        for (int i = 0; i < n; i++){ //Primer bucle que ejecuta n veces
            for (int j = 0; j < n; j++){//Segundo bucle anidadado se ejceuta n * n veces
                for (int k = 0; k < n; k++){
                    resultado += 1;
                }
            }
        }

        return resultado;
    }
}
