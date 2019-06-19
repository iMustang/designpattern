package memento;

/**
 * Originator:发起人角色，记录当前时刻的内部状态信息，提供创建备忘录和恢复备忘录数据的功能，实现其他业务功能，它可以访问备忘录里的所有信息。
 */
public class Article {
    private String title;
    private String content;

    public ArticleMemento saveArticle() {
        return new ArticleMemento(title, content);
    }

    public ArticleMemento undoArticle(ArticleMemento articleMemento) {
        return articleMemento;
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
