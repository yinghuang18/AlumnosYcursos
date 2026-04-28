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
            this.ListaAlumnos.add(alumnoNuevo);
            System.out.println("Alumno agregado");
        }

    }



}
