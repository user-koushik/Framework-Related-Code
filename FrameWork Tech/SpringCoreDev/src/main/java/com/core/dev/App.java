package com.core.dev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.core.models.Bank;
import com.core.models.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/core/resources/spring-context.xml");
        
        // Spring IOC applying
        
        /*Customer cust = (Customer) applicationContext.getBean("customer");
    	
        cust.setCustomerId(007);
        cust.setCustomerName("Jack");
        // Read dependencies
        System.out.println(cust.getCustomerId());
        System.out.println(cust.getCustomerName());
        System.out.println(cust.getAddress().getCity());
        System.out.println(cust.getAddress().getStreetName());
        */
        
        
        //IOC : inversion of Object creation
        Bank bank = (Bank) applicationContext.getBean("bank");
        Customer customer = bank.getInstance();
        customer.setCustomerId(5555);
        customer.setCustomerName("Martin"); 
        
        // Read dependencies
        // You are defining the bean in the .XML file and here you are getting the value from getter methods, which can be called
        // as Dependency Injection
        System.out.println(customer.getCustomerId());
        System.out.println(customer.getCustomerName());
        System.out.println(customer.getAddress().getCity());
    }
}






