package memento;

import java.util.Stack;

/**
 * Caretaker:管理者角色，对备忘录进行管理，提供保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改。
 */
public class ArticleCaretaker {
    private Stack<ArticleMemento> stack = new Stack<>();

    public ArticleMemento getArticle() {
        if (stack.empty()) {
            throw new RuntimeException("暂存区没有数据");
        }
        ArticleMemento articleMemento = stack.get(stack.size() - 1);
        return articleMemento;
    }

    public void saveArticle(ArticleMemento articleMemento) {
        stack.push(articleMemento);
    }

    public ArticleMemento undoArticle() {
        if (!stack.empty()) {
            stack.pop();
            return this.getArticle();
        }
        return null;
    }
}
