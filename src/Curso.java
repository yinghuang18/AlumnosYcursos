import java.util.ArrayList;
public class Curso {
    private String nombreCurso;
    private ArrayList<Alumno> ListaAlumnos;

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        this.ListaAlumnos = new ArrayList<Alumno>();

    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return ListaAlumnos;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void agregarAlumno(Alumno alumnoNuevo) {
        for (Alumno alumno : this.ListaAlumnos) {
            if (alumno.getMatricula().equals(alumnoNuevo.getMatricula())) {
                System.out.println("El alumno ya está registrado en el curso.");
                return;
            }
        }
        this.ListaAlumnos.add(alumnoNuevo);
        System.out.println(alumnoNuevo + "\n" + "agregado");
    }

    public void eliminarAlumno(Alumno quitarAlumno) {
        for (Alumno alumno : this.ListaAlumnos) {
            if (alumno.getMatricula().equals(quitarAlumno.getMatricula())) {
                this.ListaAlumnos.remove(quitarAlumno);
                System.out.println("Alumno eliminado");
                return;
            }
        }
        System.out.println("El alumno no estpa registrado en el curso");
    }

    public void comprobarAlumno(Alumno alumnoPertenece) {
        for (Alumno alumno : this.ListaAlumnos) {
            if (alumno.getMatricula().equals(alumnoPertenece.getMatricula())) {
                System.out.println("El alumno pertenece al curso");
                return;
            }
        }
        System.out.println("El alumno no pertenece al curso");
    }

    @Override
    public String toString() {
        if (this.ListaAlumnos.isEmpty()) {
            return "No hay alumnos registrados en el curso";
        }
        String curso = "Curso: " + nombreCurso + "\n";
        for (Alumno alumno : this.ListaAlumnos) {
            curso += alumno.toString() + "\n";

        }
            return curso;

    }


}
