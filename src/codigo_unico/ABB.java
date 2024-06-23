package codigo_unico;

import java.util.List;

public class ABB {
    private Nodo root;

    public void insertar(Estudiante estudiante) {
        root = insertarRec(root, estudiante);
    }

    private Nodo insertarRec(Nodo current, Estudiante estudiante) {
        if (current == null) {
            return new Nodo(estudiante);
        }
        if (estudiante.getPuntaje() < current.estudiante.getPuntaje()) {
            current.izquierdo = insertarRec(current.izquierdo, estudiante);
        } else {
            current.derecho = insertarRec(current.derecho, estudiante);
        }
        return current;
    }

    public void seleccionarMejores(List<Estudiante> seleccionados, int limit) {
        seleccionarMejoresRec(root, seleccionados, limit);
    }

    private void seleccionarMejoresRec(Nodo node, List<Estudiante> seleccionados, int limit) {
        if (node != null && seleccionados.size() < limit) {
            seleccionarMejoresRec(node.derecho, seleccionados, limit);
            if (seleccionados.size() < 150) {
                seleccionados.add(node.estudiante);
            }
            seleccionarMejoresRec(node.izquierdo, seleccionados, limit);
        }
    }

    public void imprimirTodosEstudiantes() {
        System.out.println("+----------+------------+");
        System.out.format("| %-8s | %-10s |\n", "Código", "Puntaje");
        System.out.println("+----------+------------+");
        imprimirEstudiantes(root);
    }

    private void imprimirEstudiantes(Nodo node) {
        if (node != null) {
            imprimirEstudiantes(node.izquierdo);
            System.out.format("| %03d      | %-10.2f |\n", node.estudiante.getCodigo(), node.estudiante.getPuntaje());
            imprimirEstudiantes(node.derecho);
        }
    }
}
