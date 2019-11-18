package state;

import lombok.Data;

/**
 * AbstractState
 *
 * @author: xMustang
 * @since: 1.0
 */
@Data
public abstract class AbstractState {
    protected ScoreContext context;
    protected String stateName;
    protected int score;

    public abstract void checkState();

    public void addScore(int x) {
        score += x;
        System.out.println("加上：" + x + "分，当前分数为：" + score);
        checkState();
        System.out.println("当前状态为：" + context.getState().getStateName());
    }
}
