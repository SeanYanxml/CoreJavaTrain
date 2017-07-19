package design.action.chain;

/**
 * The class for get and set（Like Template）.
 * */
public abstract class AbstractHandler {
	public Handler handler;
	public void setHandler(Handler handler){
		this.handler = handler;
	}
	public Handler getHandler(){
		return handler;
	}

}
