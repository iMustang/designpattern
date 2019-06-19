package template;

public abstract class ExamPaper {
    public final void question() {
        System.out.println("题目：水中含有氢元素吗？回答是或者不是。");
        answerQuestion();
    }

    protected abstract void answerQuestion();
}
