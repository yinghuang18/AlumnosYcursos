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
            this.nombre = "Nombre del alumno";
            this.apellido = "Apellido del alumno";
            this.matricula = "Matrícula del alumno";
            this.carrera = "Carrera del alumno";
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public String getMatricula() {
            return matricula;
        }

        public String getCarrera() {
            return carrera;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public void setCarrera(String carrera) {
            this.carrera = carrera;
        }

        @Override
        public String toString() {
            return
        }






}
