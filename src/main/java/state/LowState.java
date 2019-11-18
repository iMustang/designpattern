package state;

/**
 * LowState
 *
 * @author: xMustang
 * @since: 1.0
 */
public class LowState extends AbstractState {
    public LowState(ScoreContext context) {
        this.context = context;
        this.stateName = "不及格";
        this.score = 0;
    }

    public LowState(AbstractState state) {
        this.context = state.context;
        this.stateName = "不及格";
        this.score = state.score;
    }

    @Override
    public void checkState() {
        if (score >= 90) {
            context.setState(new HighState(this));
        } else if (score >= 60) {
            context.setState(new MiddleState(this));
        }
    }
}
