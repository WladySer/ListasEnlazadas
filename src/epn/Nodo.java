package epn;
	public class Nodo { 
		private String element;
		private Nodo next; 
		public Nodo(String s, Nodo n) {
			element = s;
			next = n;
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
	
	}


