package epn;
	public class Nodo { 
		private String element;
		private Nodo next; 
		
	public Nodo(String s, Nodo n) {
		element = s;
		next = n;
	}
	
	public Nodo(String s) {
		element = s;
		next = null;
	}
  
	public String getElement() { 
		return element;
	} 
 
	public Nodo getNext(){
		return next; 
	} 
	 
	public void setElement(String newElem) { 
		  element = newElem; 
		  }
	public void setNext( Nodo newNext) {
		 next=newNext;
	}

	@Override
	public String toString() {
		return "Nodo [element=" + element + ", next=" + next + "]";
	}
	
	
	
	}
