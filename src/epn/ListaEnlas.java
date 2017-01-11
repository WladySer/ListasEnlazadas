package epn;

public class ListaEnlas {
	protected Nodo head; 
	long size;
	
	public ListaEnlas() {
	head = null;
	size = 0;
	}
	
	public Boolean estaVacia(){
		return head.getNext()==null;
		
	}
	public void InsertarAlInicio(String entrada)
	{
	 if(estaVacia())
		 head = new Nodo(entrada);
	 else
		 head = new Nodo(entrada,head);
		 
	}
	
	// "update and search methods would go here ...
}
