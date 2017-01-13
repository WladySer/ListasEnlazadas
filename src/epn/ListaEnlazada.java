package epn;

public class ListaEnlazada {

	protected Nodo head;  
	protected long size; 
	
	public ListaEnlazada() {
		head = null;
		size = 0;
	}
	
	public void ListaVacia() {
        head = null;
    }
	
	public boolean estaVacia(){
	 
		return head==null;
	 
	}

	public void insertaralInicio(String a){
		if (estaVacia()) 
		  head= new Nodo(a);
		else 
		  head = new Nodo(a,head); 
	}
 
	public void insertaralFinal(String a){

		Nodo aux = new Nodo(a);
		Nodo inicio;
		if (estaVacia()) {
        insertaralInicio(a);
		}
		else {
			inicio = head;         
			while(inicio.getNext() != null){
				inicio=inicio.getNext();
			}              
			inicio.setNext(aux);
		}
	}
	
	public Nodo devolverNodo(int pos){
        Nodo aux=head;
        int cont=0;
        
        if(pos<0 || pos>=numeroElementos()){
            System.out.println("La posicion insertada no es correcta");
        }else{
            while(aux!=null){
                if (pos == cont){
                    return aux; 
                }
                
                aux=aux.getNext();
                cont++;
                
            }
        }
        
        return aux;
    }
	
	public int numeroElementos(){
        Nodo aux;
        int numero=0;
        aux =  head;

        while(aux != null){
            numero++;
            aux = aux.getNext();
        }
        return numero;

    }
	
	public void modificarDato(int pos, String dato){
        Nodo aux=head;
        int contador=1;
        
        if(pos<0 || pos>=numeroElementos()){
            System.out.println("La posicion insertada no es correcta");
        }else{
            while(aux!=null){
                if (pos == contador){
                    aux.setElement(dato); 
                }
                contador++;
                aux=aux.getNext();
            }
        }
        
    }
	public void borraElementos(int pos){

        Nodo auxiliar=head;
        Nodo antes=null;
        int contador=0;

        if(pos<0 || pos>=numeroElementos()){
        	System.out.println("La posicion insertada no es correcta");
        }else{
            while(auxiliar!=null){
                if (pos == contador){
                    if (antes==null){
                        head = head.getNext();
                    }else {
                        antes.setNext(auxiliar.getNext());
                    }
                    auxiliar=null;
                }else{
                    antes=auxiliar;
                    auxiliar=auxiliar.getNext();
                    contador++;
                }
            }
        }
    }
	
	public void imprimirLista(){
		System.out.println("Contenido de la lista\n");
     
		Nodo auxiliar= head;
     
     while(auxiliar!=null){
         System.out.println(auxiliar.getElement());
         auxiliar=auxiliar.getNext();
     }
     
	}
}