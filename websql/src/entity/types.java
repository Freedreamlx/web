package entity;

public class types {
	private int id;
    private String name;
    private String address;
    private String teacher1;
    private String teacher2;
    private String student1;
    private String student2;
    
    public int getId(){
    	return id;
    }

    public void setId(int id){
    	this.id=id;
    }
    public String getName(){
    	return name;
    }
    public void setName(String name){
    	this.name=name;
    }
    public String getAdress(){
    	return address;
    }
    public void setAdress(String address){
    	this.address=address;
    }
    public String getTeacher1(){
    	return teacher1;
    }
    public void setTeacher1(){
    	this.student1=teacher1;
    	
    }
    public String getTeacher2(){
    	return teacher2;
    }
    public void setTeacher2(){
    	this.student2=teacher2;
    	
    }
    public String getStudent1(){
    	return student1;
    }
    public void setStudent1(){
    	this.student1=student1;
    }
    public String getStudent2(){
    	return student2;
    }
    public void setStudent2(){
    	this.student2=student2;
    }
    public types(){}
    public types(int id,String name,String teacher1,String teacher2,String student1,String student2,String address){
    	this.id=id;
    	this.name=name;
    	this.address=address;
    	this.teacher1=teacher1;
    	this.teacher2=teacher2;
    	this.student1=student2;
    	this.student2=student2;
    }
}
