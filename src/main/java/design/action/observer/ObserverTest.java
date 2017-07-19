package design.action.observer;


public class ObserverTest {
	public static void main(String[] args) {
		Subject mysubject = new MySubject();
		mysubject.add(new Observer1());
		mysubject.add(new Observer2());
		mysubject.operation();
	}

}

/**
 * 示例输出:
 * update self!
 * Observer1 update method.
 * Observer 2 update method.
 * */