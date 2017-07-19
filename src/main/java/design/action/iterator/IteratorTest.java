package design.action.iterator;

/**
 * Java内迭代器的实现(行为型模式之迭代模式)
 * */
public class IteratorTest {
	public static void main(String[] args) {
		Collection collection = new MyCollection();
		Iterator iterator = collection.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
