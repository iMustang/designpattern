package prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ClassRoom classRoom = new ClassRoom("1班");
        Student student = new Student();
        student.setClassRoom(classRoom);
        student.setName("xMustang");
        System.out.println(student);

        Student cloneStudent = (Student) student.clone();

        // 发现浅拷贝中引用对象不拷贝
        System.out.println(cloneStudent);

        System.out.println(student == cloneStudent);

        cloneStudent.setName("Horse");
        System.out.println(cloneStudent);
    }
}
