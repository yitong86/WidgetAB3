package com.example.AC1demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WidgetA {

	@Autowired
   private WidgetB b;
   
   //Tight Coupling
   public WidgetA(){
    	this.b = new WidgetB();
    	b.doSomething();
   }

    // dependency injection   
    // YOUR CODE HERE
public WidgetA(WidgetB widgetB){
	   b = widgetB;
}
	public String doSomething() {
		return("CALLED doSomething() in WidgetA");
	}

}