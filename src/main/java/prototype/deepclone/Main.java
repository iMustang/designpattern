package prototype.deepclone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ClassRoom classRoom = new ClassRoom("1班");
        Student student = new Student();
        student.setClassRoom(classRoom);
        student.setName("xMustang");
        System.out.println(student);

        Student cloneStu = (Student) student.clone();
        System.out.println(cloneStu);
        cloneStu.setName("Horse");
        System.out.println(cloneStu);
    }
}
