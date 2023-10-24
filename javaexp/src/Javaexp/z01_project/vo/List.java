package Javaexp.z01_project.vo;

import java.util.ArrayList;

public class List {
	
	String date;
	String toDo;
	
	public List() {
		super();
	    
		// TODO Auto-generated constructor stub
	}
	public List(String date, String toDo) {
		this.date = date;
		this.toDo = toDo;
		
	}
	private ArrayList <List> lists = new ArrayList<List>();
	
	public void regList(List l01) {
		getLists().add(l01);
		
	}
	public void showListInfo() {
		for(List lList:getLists()) {
			System.out.println("등록한 할일 : "+lList.date+lList.toDo);
		}
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getToDo() {
		return toDo;
	}
	public void setToDo(String toDo) {
		this.toDo = toDo;
	}
	public ArrayList <List> getLists() {
		return lists;
	}
	public void setLists(ArrayList <List> lists) {
		this.lists = lists;
	}
	

}
