package iterator;

public class Main {
	public static void main(String[] args) {
		// 具体聚合内部为ArrayList
		Company company = new Company();
		company.add("北京");
		company.add("上海");
		company.add("南京");
		Iterator iterator = company.createIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// 具体集合内部为数组
		Management management = new Management();
		management.add("市场部");
		management.add("人事部");
		management.add("技术部");
		Iterator iterator1 = management.createIterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
	}
}
