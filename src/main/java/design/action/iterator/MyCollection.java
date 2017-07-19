package design.action.iterator;

public class MyCollection implements Collection{
	public String str[] = {"A","B","C","D","E"};

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new MyIterator(this);
	}

	public Object get(int i) {
		// TODO Auto-generated method stub
		return str[i];
	}

	public int size() {
		// TODO Auto-generated method stub
		return str.length;
	}

}
