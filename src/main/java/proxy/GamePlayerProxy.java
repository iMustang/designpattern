package proxy;

/**
 * Proxy（代理角色）:实现抽象角色，是真实角色的代理，通过真实角色的业务逻辑方法来实现抽象方法，并可以附加自己的操作。
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void playGame() {
        this.beforeGame();
        gamePlayer.playGame();
    }

    private void beforeGame() {
        System.out.println("喝个咖啡");
    }
}
