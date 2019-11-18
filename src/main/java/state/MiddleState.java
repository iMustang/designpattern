package state;

/**
 * MiddleState
 *
 * @author: xMustang
 * @since: 1.0
 */
public class MiddleState extends AbstractState {
    public MiddleState(AbstractState state) {
        this.context = state.context;
        this.stateName = "良好";
        this.score = state.score;
    }

    @Override
    public void checkState() {
        if (score < 60) {
            context.setState(new LowState(this));
        } else if (score >= 90) {
            context.setState(new HighState(this));
        }
    }
}
