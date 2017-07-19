package design.action.observer;

public class MySubject extends AbstractSubject{
	public void operation(){
		System.out.println("update self!");
		notifyObservers();
	}

}
