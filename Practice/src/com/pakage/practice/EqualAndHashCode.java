package com.pakage.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Equal{
	String name;
	int id;
	
	public Equal(int id,String name){
		this.name=name;
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)return true;
		if(obj==null|| getClass()!=obj.getClass()) return false;
		Equal e=(Equal)obj;
		return id==e.id && Objects.equals(name,e.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,id);
	}
	
}
public class EqualAndHashCode {

	public static void main(String[] args) {
		Map<Equal,String>mp=new HashMap<>();
		Equal e1=new Equal(101,"Raj");
		Equal e2=new Equal(101,"Raj");
		mp.put(e1, "Raj");
		mp.put(e2, "Raj");
		
		mp.put(e1, "Praj");
		mp.put(e2, "Mraj");
		System.out.println(mp.size());
		System.out.println(mp.get(e2));
		
	}

}
