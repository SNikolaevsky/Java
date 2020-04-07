package Level2;

//-----------===================================== Meeting site ============================================--------------------//

public class Lover {
	
    String name;
    short age;
    int height;

    public Lover(String name,short age,int height) {
    	this.name = name;
    	this.age = age;
    	this.height = height;   
    	System.out.println("Пользователь: " + name +" " + "Возраст: " + age + " " + "Рост: " + height);
    }
    
    public Lover(short age,String name,int height) {
    	this.age = age;
    	this.name = name;
    	this.height = height;
    	System.out.println("Пользователь: " + name +" " + "Возраст: " + age + " " + "Рост: " + height);
    }
    
    public Lover(int height,String name,short age) {
    	this.height = height;
    	this.name = name;
    	this.age = age;   
    	System.out.println("Пользователь: " + name +" " + "Возраст: " + age + " " + "Рост: " + height);
    }
    
    public Lover(String name,int height,short age) {
    	this.height = height;
    	this.name = name;
    	this.age = age;   
    	System.out.println("Пользователь: " + name +" " + "Возраст: " + age + " " + "Рост: " + height);
    }
    
    public Lover(int height,short age,String name) {
    	this.height = height;
    	this.name = name;
    	this.age = age;
    	System.out.println("Пользователь: " + name +" " + "Возраст: " + age + " " + "Рост: " + height);
    }
    
    public Lover(short age,int height,String name) {
    	this.height = height;
    	this.name = name;
    	this.age = age;
    	System.out.println("Пользователь: " + name +" " + "Возраст: " + age + " " + "Рост: " + height);
    }
        
    
    public static void main(String[] args) {
    	
    	Lover user1 = new Lover ("Billy",(short) 33,155);
    	Lover user2 = new Lover ("Shally",182,(short) 16);
    	Lover user3 = new Lover ((short) 48,"Strip",170);
    }
}
