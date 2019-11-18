package state;

import lombok.Data;

/**
 * ScoreContext
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
