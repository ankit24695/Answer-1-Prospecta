package com.project.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class ProjectDesc {

	 public int count;
	 public List<Entry> entries;
	
	 
	 public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Entry> getEntries() {
		return entries;
	}
	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}
	
	




	
	
	
}
