package com.project.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.project.model.Entry;
import com.project.model.Project;
import com.project.model.ProjectDesc;
import com.project.repository.ProjectDao;

@RestController
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ProjectDao projectDao;
	
	@GetMapping("/{category}")
	public List<Entry> findByCategory(@PathVariable("category") String category){
		
		String url ="https://api.publicapis.org/entries";
		
		ResponseEntity<ProjectDesc> desc = restTemplate.getForEntity(url, ProjectDesc.class);
		
		if(desc.getStatusCodeValue()==200) {
			
			ProjectDesc data = desc.getBody();

			return data.getEntries().stream().filter((e)->e.getCategory().equals(category)).collect(Collectors.toList());

		}
		
		return null;
		
	}
	
	
	
	@PostMapping("/category")
       public String saveByCategory(@PathVariable("category") String category){
		
		String url ="https://api.publicapis.org/entries";
		
		ResponseEntity<ProjectDesc> desc = restTemplate.getForEntity(url, ProjectDesc.class);
		
		if(desc.getStatusCodeValue()==200) {
			
			ProjectDesc data = desc.getBody();

			List<Entry> list =  data.getEntries().stream().filter((e)->e.getCategory().equals(category)).collect(Collectors.toList());

			for(Entry item:list) {
				Project newProject = new Project(item.getaPI(), item.getDescription(), item.getAuth(), item.ishTTPS(), item.getCors(), item.getLink(), item.getCategory());
			    projectDao.save(newProject);
			}
			
			return "Saved";
		}
		
		return "Not Saved";
		
	}
	
	
}
