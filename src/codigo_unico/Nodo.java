package codigo_unico;

/**
 * Nodo para un árbol binario de búsqueda, contiene un estudiante y referencias a nodos hijo.
 */
public class Nodo {
    Estudiante estudiante;  // Contiene los datos del estudiante
    Nodo izquierdo, derecho;  // Enlaces a los nodos hijo izquierdo y derecho

    /**
     * Constructor que inicializa un nodo con un estudiante.
     * @param estudiante El estudiante que será almacenado en este nodo.
     */
    public Nodo(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
