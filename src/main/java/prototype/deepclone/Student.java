package prototype.deepclone;

public class Student implements Cloneable {
    private String name;
    private ClassRoom classRoom;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classRoom=" + classRoom +
                '}' + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        ClassRoom classRoom = (ClassRoom) student.classRoom.clone();
        student.setClassRoom(classRoom);
        return student;
    }
}
