package codigo_unico;

import java.util.ArrayList;
import java.util.List;
import java.util.Random; // Asegúrate de incluir esta importación

public class Main {
    public static void main(String[] args) {
        ABB arbol = new ABB();
        Random rand = new Random(); // Ahora Random está correctamente importado

        for (int i = 1; i <= 250; i++) {
            float puntaje = 500 + rand.nextFloat() * 500; // Genera un puntaje aleatorio entre 500 y 1000
            arbol.insertar(new Estudiante(i, puntaje));
        }

        List<Estudiante> seleccionados = new ArrayList<>();
        arbol.seleccionarMejores(seleccionados, 150);

        // Aquí debes asegurarte de que la impresión también sea coherente con las definiciones
        for (Estudiante estudiante : seleccionados) {
            System.out.printf("Código: %03d, Puntaje: %.2f\n", estudiante.getCodigo(), estudiante.getPuntaje());
        }

        // Opcional: imprimir todos los estudiantes en forma de tabla
        arbol.imprimirTodosEstudiantes();
    }
}
