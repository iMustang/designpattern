package interpreter;

public class Main {
	public static void main(String[] args) {
		// 计算10+(30-20)
		int interpret = new Plus().interpret(new Context(10, new Minus().interpret(new Context(30, 20))));
		System.out.println(interpret);
	}
}
