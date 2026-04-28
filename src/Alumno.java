public class Alumnos {
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String matricula;
    private String curso;

        public Alumno(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String matricula, String curso) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.matricula = matricula;
        this.curso = curso;

        }

        public Alumno() {
            this.primerNombre = "Primer nombre del alumno";
            this.segundoNombre = "Segundo nombre del alumno";
            this.primerApellido = "Primer apellido del alumno";
            this.segundoApellido = "Segundo apellido del alumno";
            this.matricula = "Matrícula del alumno";
            this.curso = "Curso del alumno";
        }

        public String getPrimerNombre() {
            return this.primerNombre;
        }
        public String getSegundoNombre() {
            return this.segundoNombre;
        }

        public String getPrimerApellido() {
            return this.primerApellido;
        }
        public String getSegundoApellido() {
            return this.segundoApellido;
        }

        public String getMatricula() {
            return matricula;
        }

        public String getCurso() {
            return curso;
        }

        public void setPrimerNombre(String primerNombre) {
            this.primerNombre = primerNombre;
        }
        public void setSegundoNombre(String segundoNombre) {
            this.segundoNombre = segundoNombre;
        }

        public void setPrimerApellido(String primerApellido) {
            this.primerApellido = primerApellido;
        }
        public void setSegundoApellido(String segundoApellido) {
            this.segundoApellido = segundoApellido;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }

        @Override
        public String toString() {
            return "Nombre completo del alumno: " + primerNombre + " " + segundoNombre + " " + primerApellido + " " + segundoApellido + "\n" +
                    "Matrícula: " + matricula + "\n" + "Curso: " + curso;
        }






}
