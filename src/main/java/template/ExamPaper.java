package template;

public abstract class ExamPaper {
	/**
	 * 模板方法一般设置为final
	 */
	public final void question() {
		System.out.println("题目：水中含有氢元素吗？回答是或者不是。");
		answerQuestion();
		// 钩子方法
		hook();
	}
	protected abstract void answerQuestion();

	/**
	 * 钩子方法
	 */
	protected void hook() {
	}
}
