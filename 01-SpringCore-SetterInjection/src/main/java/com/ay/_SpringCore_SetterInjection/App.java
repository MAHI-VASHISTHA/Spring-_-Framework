package com.ay._SpringCore_SetterInjection;

import java.util.Date;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ay.beans.WishMessageGenerator;

public class App {
  public static void main(String[] args) {
	  
	  
DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
XmlBeanDefinitionReader reader =new XmlBeanDefinitionReader(factory);

reader.loadBeanDefinitions("com/ay/config/applicationContext.xml");
	  

WishMessageGenerator wmg =factory.getBean(WishMessageGenerator.class);
String result=wmg.generateMessage("mahi vashistha");
System.out.println(result);
	   }
}
