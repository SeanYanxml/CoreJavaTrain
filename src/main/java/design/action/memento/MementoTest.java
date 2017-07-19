package design.action.memento;

/**
 * 备忘录模式的测试类。
 * @author Sean
 * @since 2017-07－17
 * */
public class MementoTest {
	public static void main(String[] args) {
		Original original = new Original("Original");
		Memento memento = original.createNewMemento();
		Storage storage = new Storage(memento);
		System.out.println(original.getValue());
		original.setValue("Hello");
		System.out.println(original.getValue());
		original.restoreMemento(storage.getMemento());
		System.out.println(original.getValue());
	}
}
