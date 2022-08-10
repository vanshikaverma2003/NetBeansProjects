package com.mycompany.members;

public class Manager extends Members {

    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
   public static void main(String args[]){
       
Manager manager=new Manager();
Employe employe=new Employe(); 

manager.setName("Vanshika");
manager.setAddress("Kartarpur");
manager.setPhonenumber(234349373);

System.out.println(manager.getName());
System.out.println(manager.getAddress());
System.out.println(manager.getPhonenumber());


   
   
   }
}


