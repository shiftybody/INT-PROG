public class Main {
    public static void main(String[] args) {

        Professor p = new Professor ();
        Teacher t;

        t = p;

        ((Professor) t).setDepartment();

    }
}
