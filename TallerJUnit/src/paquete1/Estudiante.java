package paquete1;

public class Estudiante {

    // 1.  Declarar
    // se declaran datos o atributos con visibilidad protegido
    // # nombresEstudiante: Cadena
    protected String nombresEstudiante;
    // # apellidosEstudiante: Cadena
    protected String apellidosEstudiante;
    // # identificacionEstudiante: Cadena
    protected String identificacionEstudiante;
    // # edadEstudiante: Entero
    protected int edadEstudiante;

    public void establecerNombresEstudiante(String n) {
        nombresEstudiante = n;
    }

    public void obtenerNombresEstudiante(String n) {
        nombresEstudiante = n;
    }

    public void establecerApellidoEstudiante(String n) {
        apellidosEstudiante = n;
    }

    public void obtenerApellidoEstudiante(String n) {
        apellidosEstudiante = n;
    }

    public void establecerIdentificacionEstudiante(String n) {
        identificacionEstudiante = n;
    }

    public void obtenerIdentificacionEstudiante(String n) {
        identificacionEstudiante = n;
    }

}
