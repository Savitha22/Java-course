package com.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {
  
	private ApplicationEventPublisher publisher;
   //setter
   public void setApplicationEventPublisher (ApplicationEventPublisher publisher) {
      this.publisher = publisher;
   }
   
 //method
   public void publish() {
	   System.out.println("Event publisher");
      CustomEvent ce = new CustomEvent(this);
      publisher.publishEvent(ce);
   }
}