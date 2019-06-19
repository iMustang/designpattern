package interpreter;

/**
 * @Title: Context
 * @Description:
 * @Author: xMustang
 * @Version: 1.0
 * @create: 2019/6/19 17:53
 */
public class Context {
    private int numberA;
    private int numberB;

    public Context(int numberA, int numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public int getNumberA() {
        return numberA;
    }

    public void setNumberA(int numberA) {
        this.numberA = numberA;
    }

    public int getNumberB() {
        return numberB;
    }

    public void setNumberB(int numberB) {
        this.numberB = numberB;
    }
}
