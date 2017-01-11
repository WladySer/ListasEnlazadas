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
	public String ImprimirContenido(){
	String contenido="";
    Nodo<T> aux=primero;
    
    while(aux!=null){
        contenido+=aux.getDato()+"\n"; //guardamos el dato
        aux=aux.getSiguiente();
    }
	}
	// "update and search methods would go here ...
}
