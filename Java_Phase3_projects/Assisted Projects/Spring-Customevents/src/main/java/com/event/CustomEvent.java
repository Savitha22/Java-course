package com.event;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent{
  //Constructor which requires a source which generates event
	public CustomEvent(Object source) {
      super(source);
      System.out.println("CustomEvent Constructor");
   }
   public String toString(){
      return "My Custom Event";
   }
}