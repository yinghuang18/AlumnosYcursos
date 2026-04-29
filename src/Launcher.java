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

        System.out.println("\n   Lista inicial de alumnos: \n");
        System.out.println(curso.toString());

        System.out.println("\n   Eliminar alumno3 de la lista \n");
        curso.eliminarAlumno(alumno3);

        System.out.println("\n   Lista de alumnos después de eliminar alumno3: \n");
        System.out.println(curso.toString());

        System.out.println("Comprobar si alumno4 pertenece al curso:");
        curso.comprobarAlumno(alumno4);

        System.out.println("Comprobar si alumno3 pertenece al curso:");
        curso.comprobarAlumno(alumno3);


    }
}
