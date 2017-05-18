package design.create.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Prototype implements Cloneable,Serializable{

    private static final long serialVersionUID = 1L;  
    
	private String string;
	private Object obj;
	
	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}


	/* 浅复制 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		Prototype proto = (Prototype)super.clone();
		return proto;
	}
	
	/* 深复制 */
	// 不是特别理解 这几个类的用处？
	public Object deepClone() throws IOException, ClassNotFoundException{
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos); // IOException
		oos.writeObject(this);// 将当前类 写入 oos对象内
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();//ClassNotFoundException
	}


}
