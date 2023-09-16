package flow_proyecto;

public class nodo {
    
    String nombre, direccion;
    nodo siguiente;
    nodo anterior;

    public nodo(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
}
