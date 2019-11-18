package state;

/**
 * HighState
 *
 * @author: xMustang
 * @since: 1.0
 */
public class HighState extends AbstractState {
    public HighState(AbstractState state) {
        this.context = state.context;
        this.stateName = "优秀";
        this.score = state.score;
    }

    @Override
    public void checkState() {
        if (score < 60) {
            context.setState(new LowState(this));
        } else if (score < 90) {
            context.setState(new MiddleState(this));
        }
    }
}
