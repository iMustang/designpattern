package state;

import lombok.Data;

/**
 * Context：环境角色，也称为上下文，它定义了客户感兴趣的接口，维护一个当前状态，并将与状态相关的操作委托给当前状态对象来处理。
 *
 * @author: xMustang
 * @since: 1.0
 */
@Data
public class ScoreContext {
    private AbstractState state;

    public ScoreContext() {
        state = new LowState(this);
    }

    public void add(int score) {
        state.addScore(score);
    }
}
