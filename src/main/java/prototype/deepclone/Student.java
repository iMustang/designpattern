package prototype.deepclone;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Student implements Cloneable {
    private String name;
    private ClassRoom classRoom;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        ClassRoom classRoom = (ClassRoom) student.classRoom.clone();
        student.setClassRoom(classRoom);
        return student;
    }
}
