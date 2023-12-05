/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datosCaja;

/**
 *
 * @author macha
 */
public class  ColaPedido{
    //Apuntador principal de la estructura
    public ProductoCaja cola;
    public int cantNodos;
    
    public ColaPedido(){
        //Inicializar el apuntador principal
        cola = null;
        cantNodos = 0;
    }
    
    //Operacion agregar al final de la cola
    public void Encolar(String nombre, float precio, int cant){
        //Crear el nodo con el valor
        ProductoCaja nuevo = new ProductoCaja(nombre, precio, cant);
        //Para agregrar, primero se valida si hay mas nodo o ninguno(vacio)
        if (cola == null) {
            cola = nuevo;
        } else {
            ProductoCaja aux = cola;
            while (aux.getAptSiguiente() != null) {                
                aux = aux.getAptSiguiente();
            }
            aux.setAptSiguiente(nuevo);
        }
        cantNodos++;
    }
    
    public void RecorrerPila(){
        ProductoCaja aux = cola;
        
        if (cola == null) {
            System.out.println("Pila vacia.");
        } else {
            while (aux != null) {                
                System.out.println("Producto: " + aux.getNombre());
                aux = aux.getAptSiguiente();
            }
        }
    }
    
    public void Desencolar(){
        //Eliminar el primer elemento de la pila
        ProductoCaja aux = cola;
        if (cola == null) {
            System.out.println("Pila vacia.");
        } else {
            //Se evalua si existe mas de un elemento
            if (aux.getAptSiguiente() == null) {
                //Existe solamente un elemento la pila se elimina
                cola = null;
            } else {
                //Existe mas de un elemento en la pila y se elimina el primero
                cola = aux.getAptSiguiente();
            }
            System.out.println("Primer elemento elimminado.");
            cantNodos--;
        }
    }
    
    public void limpiarDatos(){
        for (int i = cantNodos; i >= 0; i--) {
            Desencolar();
        }
    }
    
    public String[] imprimirNombre(){
        //Se crea un nodo auxiliar
        ProductoCaja aux = cola;
        
        //Declarar arreglo temporal donde se guarda informacion de la lista
        String[] arreglo = new String[cantNodos];
        
        //Variable que servira de indice de posicion del arreglo
        int j = 0;
        if (cola == null) {
        } else {
            //Se recorre la lista mientras no este vacia
            while (aux != null) {
                //Copiando el valor del nodo a una posicion del arreglo
                arreglo[j] = aux.getNombre();
                aux = aux.getAptSiguiente();
                j++; //Se incrementa el indice de posicion
            }
        }
        return arreglo;
    }
    
    public float[] imprimirPrecio(){
        //Se crea un nodo auxiliar
        ProductoCaja aux = cola;
        
        //Declarar arreglo temporal donde se guarda informacion de la lista
        float[] arreglo = new float[cantNodos];
        
        //Variable que servira de indice de posicion del arreglo
        int j = 0;
        if (cola == null) {
        } else {
            //Se recorre la lista mientras no este vacia
            while (aux != null) {
                //Copiando el valor del nodo a una posicion del arreglo
                arreglo[j] = aux.getPrecio();
                aux = aux.getAptSiguiente();
                j++; //Se incrementa el indice de posicion
            }
        }
        return arreglo;
    }
    
    public int[] imprimirCant(){
        //Se crea un nodo auxiliar
        ProductoCaja aux = cola;
        
        //Declarar arreglo temporal donde se guarda informacion de la lista
        int[] arreglo = new int[cantNodos];
        
        //Variable que servira de indice de posicion del arreglo
        int j = 0;
        if (cola == null) {
        } else {
            //Se recorre la lista mientras no este vacia
            while (aux != null) {
                //Copiando el valor del nodo a una posicion del arreglo
                arreglo[j] = aux.getCant();
                aux = aux.getAptSiguiente();
                j++; //Se incrementa el indice de posicion
            }
        }
        return arreglo;
    }
}
