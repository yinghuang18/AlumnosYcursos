public class Alumnos {
    private String nombre;
    private String apellido;
    private String matricula;
    private String carrera;
        public Alumno(String nombre, String apellido, String matricula, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.carrera = carrera;

        }

        public Alumno() {

        }

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }




}
