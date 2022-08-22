package my_app;

public class Person {
    private String[] hobbies;
	
	public Person(){
		hobbies = new String[]{};
	}
	
    String[] getHobbies(){ return hobbies;}
	
    void setHobbies(String[] hobbies){ this.hobbies = hobbies;}
}
