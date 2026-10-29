package labubu;

import java.io.Serializable;

public class Item implements Serializable{
	private String tem;
	
	public Item(String t) {
		tem = t;
	}
	
	public String getName() {
		return tem;
	}
	public void setName(String t) {
		tem = t;
	}
	
	public void use() {
		CozyAdventureGUI.addStory("It doesn't seem like this is going to be any help."+"\n");
	}
	public String toString() {
		return tem;
	}
	

}
