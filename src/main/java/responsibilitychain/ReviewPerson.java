package responsibilitychain;

/**
 * Handler：抽象处理者，定义一个处理请求的接口，包含抽象处理方法和一个后继连接。
 */
public abstract class ReviewPerson {
    protected ReviewPerson reviewPerson;

    abstract void handle(String program);

    public void setReviewPerson(ReviewPerson reviewPerson) {
        this.reviewPerson = reviewPerson;
    }

    public ReviewPerson getReviewPerson() {
        return reviewPerson;
    }
}
