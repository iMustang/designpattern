package memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * Memento:备忘录角色，负责存储发起人的内部状态，在需要的时候提供这些内部状态给发起人。
 */
@Data
@AllArgsConstructor
@ToString
public class ArticleMemento {
	private String title;
	private String content;
}
