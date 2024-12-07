package com.example;

public class Registeration {
	
	
	 private int id;
	 private String name;
	 private String email;
	 
	 

	public int getId() {
		return id;
	}

    public void setId(int id) {
		this.id = id;
	}

    public String getName() {
		return name;
	}

    public void setName(String name) {
		this.name = name;
	}

    public String getEmail() {
		return email;
	}

   public void setEmail(String email) {
		this.email = email;
	}


 
     public static void main(String[] args) {
    	
    	 Registeration reg=new Registeration();
    
    	reg.setId(10);
    	 reg.setName("Rutuja Tambade");
    	 reg.setEmail("rututambade@gmail.com");
    	 
    	 System.out.println("Enter the Id:"+ reg.getId());
    	
    	 System.out.println("Enter the Name:"+reg.getName());
    	 System.out.println("Enter the Email:"+reg.getEmail());

	}

}
