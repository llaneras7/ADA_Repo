package ADA;

import java.util.List;
import java.util.ArrayList;

public class ProcesaLista extends Metodo{
	private List<Integer> lista;
	
	public ProcesaLista() {
		super();
		lista = null;
		
	}
	public void setLista(List<Integer> l) {
		lista = l;
	}
		
	public List<Integer> getLista() {
		return lista;
	}
	
	/**
	 * Procesamos todos los elementos de la lista lista.
	 * return El número de elementos procesados en realidad.
	 */
	@Override
	public int codigo(int n) {
		procesaLista(lista);
		return n>lista.size()?n:lista.size();
	}
	
	private void procesaLista(List<Integer> lista) {
		//Completar la implementación del metodo

		if(lista == null || lista.size() == 0) {
			return;
		}

		List<Integer> listaSinRepe = new ArrayList();
		listaSinRepe.add(lista.get(0));

		int n = lista.size();
		for (int i = 1; i < n; i++) {
			if(!lista.get(i).equals(lista.get(i-1))){
				listaSinRepe.add(lista.get(i));
			}
		}
		lista.clear();
		lista.addAll(listaSinRepe);
	}
}
