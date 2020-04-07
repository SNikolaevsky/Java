package Level2;

//---------------------=====================  Музей ======================------------------------ //


public class Artifact {

	int catalog;
	String culture;
	int century;
	
//	static int count = 0;
		
	public Artifact(int catalog) {
		this.catalog = catalog;
		System.out.println("Добавлен артефакт со свойствами: "+ "Номер в каталоге - "+ catalog);
//		count++;		
	}
	
	public Artifact(int catalog, String culture) {
		this.catalog = catalog; // + count;
		this.culture = culture;
		System.out.println("Добавлен артефакт со свойствами: "+ "Номер в каталоге - " + catalog +"; "+"Культура - " + culture);
//		count++;
	}
	
	public Artifact(int catalog, String culture, int century) {
		this.catalog = catalog; // + count;
		this.culture = culture;
		this.century = century;
		System.out.println("Добавлен артефакт со свойствами: "+ "Номер в каталоге - " + catalog +"; "+"Культура - " + culture + "; " +"Век - " + century);
//		count++;
	}
	
	
    public static void main(String[] args) {
    	Artifact item1 = new Artifact (212121);
    	Artifact item2 = new Artifact (218121, "Aztec");
    	Artifact item3 = new Artifact (212191, "Persian", 2);	   	
    }
}
