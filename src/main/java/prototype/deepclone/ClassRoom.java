package prototype.deepclone;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ClassRoom implements Cloneable {
    private String roomName;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
