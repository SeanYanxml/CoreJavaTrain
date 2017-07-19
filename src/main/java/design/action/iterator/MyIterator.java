package design.action.iterator;

public class MyIterator implements Iterator{

	private Collection collection;
	private int pos = -1;// 指向头的游标
	
	public MyIterator(){
		super();
	}
	
	public MyIterator(Collection collection){
		this.collection = collection;
	}
	
	public Object previous() {
		if(pos>0){
			pos--;
		}
		return collection.get(pos);
	}

	public Object next() {
		if(pos<(collection.size()-1)){
			pos++;
		}
		return collection.get(pos);
	}

	public boolean hasNext() {
		boolean resultFlag = false;
		if(pos<(collection.size()-1)){
			resultFlag = true;
		}
		return resultFlag;
	}

	public Object first() {
		pos = 0;
		return collection.get(pos);
	}
	

}
