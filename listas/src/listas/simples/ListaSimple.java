package listas.simples;

public class ListaSimple {
	private Nodo cabeza;

	public ListaSimple(){
		this.cabeza = null;
	}

	public void insertarInicio(int valor) {
		Nodo t = new Nodo(valor);
		if (cabeza == null) {

			cabeza = t;
		} else {
			t.setSig(cabeza);
			cabeza = t;
		}
	}

	public void recorrer() {
		Nodo itera = cabeza;

		if (cabeza == null) {
		System.out.println("Lista Vacia");
		return;
		}

		while(itera.getSig() != null) {
			System.out.println("Valor " + itera.getValor());
			itera = itera.getSig();
		}
	}

	public static void main(String a[]) {
		ListaSimple ls = new ListaSimple();
		
		ls.insertarInicio(2);
		ls.insertarInicio(3);

		ls.recorrer();
	}

}