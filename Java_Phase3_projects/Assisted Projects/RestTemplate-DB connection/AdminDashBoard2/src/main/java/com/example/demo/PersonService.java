package com.example.demo;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PersonService {
    
   
    
    RestTemplate restTemplate = new RestTemplate(); // to exchange information
        
   
    public void addPerson(PersonEntity pe){
    	final String uri = "http://localhost:8081/auth/person";
        //Prepare parameter to pass
    	HttpHeaders headers = new HttpHeaders();
    	headers.setContentType(MediaType.APPLICATION_JSON);
         //Find Record of a Person
         
         HttpEntity<PersonEntity> httpEntity = new HttpEntity<>(pe, headers);

     	RestTemplate restTemplate = new RestTemplate();
     	PersonEntity obj = restTemplate.postForObject(uri, httpEntity, PersonEntity.class);

     	
        
    }
}
