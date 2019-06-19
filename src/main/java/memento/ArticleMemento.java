package memento;

/**
 * Memento:备忘录角色，负责存储发起人的内部状态，在需要的时候提供这些内部状态给发起人。
 */
public class ArticleMemento {
    private String title;
    private String content;

    public ArticleMemento(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
