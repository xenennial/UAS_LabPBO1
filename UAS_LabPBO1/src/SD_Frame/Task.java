package SD_Frame;

import java.io.Serializable;

public class Task implements Serializable {
    
    private String title = "";
    private String text = "";
    private String date = "";
    private boolean done = false;
    
    private Task next = null;
    
    //constructor
    public Task(){
        
    }
    
    public Task(String title, String text){
        this.title = title;
        this.text = text;
        this.date = date;
    }
    
    public Task(String title, String text, boolean done){
        this.title = title;
        this.text = text;
        this.date = date;
        this.done = done;
    }
    
    public Task(String title, String text, Task next){
        this.title = title;
        this.text = text;
        this.date = date;
        this.next = next;
    }
    
    
    //methods
    
    public void displayData(){
        
        String status;
        
        if (this.done = false){
            status = "not done";
        }
        else {
            status = "done";
        }
        System.out.println("title: " + this.title + "deadline: " + this.date + ", done: " + status + ", desc: " + this.text);
    }
    
    //get
    public Task getNext(){
        return this.next;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getDeadline(){
        return this.date;
    }
    
    public String getText(){
        return this.text;
    }
    
    public boolean getDone(){
        return this.done;
    }
    
    //set
    public void setNext(Task next){
        this.next = next;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setText(String text){
        this.text = text;
    }
    
    public void setDeadline (String date){
        this.date = date;
    }
    
    public void setDone(boolean done){
        this.done = done;
    }

    void setDate(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
