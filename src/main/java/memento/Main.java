package memento;

public class Main {
	public static void main(String[] args) {
		ArticleCaretaker articleCaretaker = new ArticleCaretaker();

		Article article = new Article();
		article.setTitle("单例模式");
		article.setContent("一个类只要一个实例");
		articleCaretaker.saveArticle(article.saveArticle());
		System.out.println(articleCaretaker.getArticle());

		article.setTitle("工厂模式");
		article.setContent("生产对象");
		articleCaretaker.saveArticle(article.saveArticle());
		System.out.println(articleCaretaker.getArticle());

		ArticleMemento articleMemento = article.undoArticle(articleCaretaker.undoArticle());
		System.out.println(articleMemento);
	}
}
