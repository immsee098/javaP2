package com.day21;

import java.util.*; 

class Member { 
	private String id; 
	private String name;
	
	Member(String id, String name) { 
		this.id = id; 
		this.name = name; 
		}

	public String getId() { 
		return id; 
		} 
	
	public void setId(String id) { 
		this.id = id; 
		} 
	
	public String getName() { 
		return name; 
		} 
	public void setName(String name) { 
		this.name = name; 
		}
	
	public String toString() { 
		return "MyMember [id=" + id + ", name=" + name+ "]"; 
		}
}