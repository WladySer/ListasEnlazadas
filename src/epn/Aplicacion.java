package epn;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		 ListaEnlazada lista = new ListaEnlazada(); 
		 
		 
		 lista.insertaralFinal("Hola");
		 lista.insertaralInicio("Sergio");
		 lista.insertaralFinal("Mundo");
		 
		 if (lista.estaVacia())
			 System.out.println("La lista esta vacia");
		 else{
			 System.out.println("La lista tiene estos datos:");
			 lista.imprimirLista();
		 }
		 
		 
		 System.out.println("Numero de elementos " + lista.numeroElementos());
		 System.out.println("Elemento de la pos 3 " + lista.devolverNodo(3));
		 int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la pocision a editar"));
		 String nuevo = JOptionPane.showInputDialog("Ingrese el texto que se actualizara");
		 lista.modificarDato(pos, nuevo);
		 
		 lista.imprimirLista();
		 
		 lista.borraElementos(2);
		 
		 lista.imprimirLista();

	}

}