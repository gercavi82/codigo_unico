package codigo_unico;

/**
 * Representa a un estudiante con un código único y un puntaje.
 * Se utiliza para almacenar información sobre estudiantes en un árbol binario de búsqueda.
 */
public class Estudiante {
    private int codigo;  // Código del estudiante como entero
    private float puntaje;  // Puntaje del estudiante como número flotante

    /**
     * Constructor para crear un nuevo estudiante.
     * @param codigo Código único del estudiante.
     * @param puntaje Puntaje obtenido por el estudiante.
     */
    public Estudiante(int codigo, float puntaje) {
        this.codigo = codigo;
        this.puntaje = puntaje;
    }

    public int getCodigo() {
        return codigo;
    }

    public float getPuntaje() {
        return puntaje;
    }
}
