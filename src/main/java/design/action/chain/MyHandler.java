package design.action.chain;

public class MyHandler extends AbstractHandler implements Handler{
	private String name;
	MyHandler(){
		super();
	}
	MyHandler(String name){
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void operater() {
		System.out.println("Handler: " + name);
		if(null != this.getHandler()){
			this.getHandler().operater();
		}
	}
	

}
