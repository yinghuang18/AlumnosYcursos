import java.util.ArrayList;
public class Curso {
    private String nombreCurso;
    private ArrayList<Alumno> alumnos;

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        this.alumnos = new ArrayList<Alumno>();

    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }



}
