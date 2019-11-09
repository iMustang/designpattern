package prototype;

/**
 * title: RealizeTypeTest
 * description:
 */
public class RealizeTypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType rt = new RealizeType();
        RealizeType art = (RealizeType) rt.clone();

        System.out.println(rt == art);
    }
}

class RealizeType implements Cloneable {
    RealizeType() {
        System.out.println("RealizeType实例创建成功");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}