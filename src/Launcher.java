public class Launcher {
    public static void main(String[] args) {
        Curso curso = new Curso("A");
        Alumno alumno1 = new Alumno("María", "Amanda", "Mendez", "Perez", "2188993344", "A");
        Alumno alumno2 = new Alumno("Juan", "Carlos", "Gomez", "Perez", "2133445566", "A");
        Alumno alumno3 = new Alumno("Luisa", "Fernanda", "Lopez", "Garcia", "2199887766", "A");
        Alumno alumno4 = new Alumno("Pedro", "Alberto", "Sanchez", "Gomez", "2177665544", "A");
        Alumno alumno5 = new Alumno("Ana", "Sofia", "Martinez", "Lopez", "2166554433", "A");

        curso.agregarAlumno(alumno1);
        curso.agregarAlumno(alumno2);
        curso.agregarAlumno(alumno3);
        curso.agregarAlumno(alumno4);
        curso.agregarAlumno(alumno5);

    }
}
