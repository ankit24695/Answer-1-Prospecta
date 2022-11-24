package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Project {

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    public Integer projectId;
	 
	    public String aPI;
	    
	    public String description;
	    
	    public String auth;
	   
	    public boolean hTTPS;
	    
	    public String cors;
	   
	    public String link;
	    
	    public String category;
	    
	    
	    

		public Project(String aPI, String description, String auth, boolean hTTPS, String cors, String link,
				String category) {
			super();
			this.aPI = aPI;
			this.description = description;
			this.auth = auth;
			this.hTTPS = hTTPS;
			this.cors = cors;
			this.link = link;
			this.category = category;
		}

		public String getaPI() {
			return aPI;
		}

		public void setaPI(String aPI) {
			this.aPI = aPI;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getAuth() {
			return auth;
		}

		public void setAuth(String auth) {
			this.auth = auth;
		}

		public boolean ishTTPS() {
			return hTTPS;
		}

		public void sethTTPS(boolean hTTPS) {
			this.hTTPS = hTTPS;
		}

		public String getCors() {
			return cors;
		}

		public void setCors(String cors) {
			this.cors = cors;
		}

		public String getLink() {
			return link;
		}

		public void setLink(String link) {
			this.link = link;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public Integer getProjectId() {
			return projectId;
		}

		public void setProjectId(Integer projectId) {
			this.projectId = projectId;
		}

	
	
	    
	    
	    
}
