public class Main {
    public static void main(String[] args) {

        Professor p = new Professor ();
        Student s = new Student();
        Teacher t;

        // puedo asignarle a una variable de referencia Teacher
        // un tipo Student, porque un Student es un Teacher
        // t = p;
        t = s;

        // sin embargo no puedo forzar un casteo aquí, pues
        // no hay manera de transformar a Student, en un Professor
        //a pesar de estar contenido en un Teacher.

        p = (Professor) t;

    }
}
