package template;

/**
 * 模板模式
 */
public class Main {
	public static void main(String[] args) {
		ExamPaper examPaperA = new ExamPaperA();
		examPaperA.question();
		ExamPaper examPaperB = new ExamPaperB();
		examPaperB.question();
	}
}
