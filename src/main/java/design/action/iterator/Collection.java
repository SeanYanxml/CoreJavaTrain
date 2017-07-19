package design.action.iterator;


public interface Collection {
	
	public Iterator iterator();
	
	/*获取集合元素*/
	public Object get(int i);
	
	/*获取集合元素个数*/
	public int size();

}
