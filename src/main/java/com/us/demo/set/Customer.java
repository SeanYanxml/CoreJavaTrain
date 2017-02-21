package com.us.demo.set;

public class Customer {
	public String name;
	public int size;
	public Customer(String name,int size){
		this.name=name;
		this.size=size;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public String getName(){
		return this.name;
	}
	public boolean equals(Object o){
		if(this==o){return true;}
		if(! (o instanceof Customer)){
			return false;}
		else{
			Customer other=(Customer) o;
			if((other.name==this.name)&&(other.size==this.size)){
				return true;
			}else{
				return false;
			}
		}
	}
	
	public int hashCode(){
		return this.size;
	}

}
