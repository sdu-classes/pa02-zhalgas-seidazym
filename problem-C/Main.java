public class Main {
    public static void main(String[] args) {
        Person person = new Person("Nurik", "Abylaihan 5/b");
        System.out.println(person);
        System.out.println(person.getAddress());
        System.out.println(person.getName());

        Student student = new Student("Omar", "Lenina 5", "IS", 1, 36600);
        System.out.println(student);
        System.out.println(student.getName());
        System.out.println(student.getAddress());
        System.out.println(student.getProgram());
        System.out.println(student.getFee());
        System.out.println(student.getYear());

        Staff staff = new Staff("Dimash", "Suleimanova 19", "KTL", 500000);
        System.out.println(staff);
        System.out.println(staff.getName());
        System.out.println(staff.getAddress());
        System.out.println(staff.getSchool());
        System.out.println(staff.getPay());

    }
}
