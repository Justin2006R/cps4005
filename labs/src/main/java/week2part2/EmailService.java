/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2part2;

/**
 *
 * @author 2403851
 */
public class EmailService {
  private String recipient;
  private String sender;
  private String subject;
  
  
    public EmailService(){
        this.recipient = "team@company.com";
        this.sender = "admin@company.com";
        this.subject = "Team Email";
    }
    
    public String getRecipient(){
        return recipient;
    }
    
    public String getSender(){
        return sender;
    }
    
    public String subject(){
        return subject;
    }
    
    public void sendEmail(String content){
        System.out.println("Email.....");
        System.out.println(content);
    }
    
    public void sendEmail(String content, String recipient) {
        System.out.println("Sending email to " + recipient + " from " + sender + " with subject: " + subject);
        System.out.println("Content: " + content);
    }

    public void sendEmail(String content, String recipient, String subject) {
        System.out.println("Sending email to " + recipient + " from " + sender + " with subject: " + subject);
        System.out.println("Content: " + content);
    }
    
    public void printInfo(){
        System.out.println("Sending email with default settings");
    }
    
}
