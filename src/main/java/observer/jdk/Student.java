package observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Student
 * 具体观察者
 *
 * @author: xMustang
 * @since: 1.0
 */
public class Student implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if ((boolean) arg) {
            System.out.println("学生开始上课了");
        } else {
            System.out.println("学生下课了");
        }
    }
}
