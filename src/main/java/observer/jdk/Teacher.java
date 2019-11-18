package observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Teacher
 * 具体观察者
 *
 * @author: xMustang
 * @since: 1.0
 */
public class Teacher implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if ((boolean) arg) {
            System.out.println("老师开始上课了");
        } else {
            System.out.println("老师下课了");
        }
    }
}
