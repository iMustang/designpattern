package prototype;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Student implements Cloneable {
    private String name;
    private ClassRoom classRoom;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
