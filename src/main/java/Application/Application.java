package src.main.java.Application;
import java.util.Scanner;

import src.main.java.Service.ChatbotService;

public class Application{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("input language 1:");
        String language1 = sc.nextLine();
        System.out.println("input language 2:");
        String language2 = sc.nextLine();

        ChatbotService chatService1 = new ChatbotService();
        chatService1.language = language1;
        ChatbotService chatService2 = new ChatbotService();
        chatService2.language = language2;

        String result1 = chatService1.helloMessage();
        System.out.println(result1);
        String result2 = chatService2.helloMessage();
        System.out.println(result2);
    }
}
/*
 * key takeaways:
 * we're able to define a new 'custom datatype' called a class(and java makes everything a class, basically)
 * we're able to create new instances of that custom datatype knowns as objects
 * the class, with funtions as a template or blueprint for objects, can have different variables(which we call fields, states)
 * as well as methods(behaviors), and the behaviour of those methods could change depending on the object's own individual fields
 * the process of creating a new object is known as instantiation
 * OOP is good, but it's tricky to figure out!
 */