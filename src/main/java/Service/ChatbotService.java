package src.main.java.Service;
public class ChatbotService {
   
    public String language;
    public String helloMessage(){
        if(language.equals("english")){
            return "hello";
        }else if(language.equals("spanish")){
            return "hola";
        }else if(language.equals("hawaiian")){
            return "aloha";
        }
        return "language1 not recognize";
    }

public String goodbyeMessage(){
    if(language.equals("english")){
        return "goodbye";
    }else if(language.equals("spanish")){
        return "adios";
    }else if(language.equals("hawaiian")){
        return "aloha";
    }
    return "language2 not recognize";
    }
}