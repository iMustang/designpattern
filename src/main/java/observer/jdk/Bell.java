package observer.jdk;

import java.util.Observable;

/**
 * Bell
 * 具体目标类，具体被观察者
 *
 * @author: xMustang
 * @since: 1.0
 */
public class Bell extends Observable {
    public void belling(boolean classBegin) {
        super.setChanged();
        super.notifyObservers(classBegin);
    }
}
