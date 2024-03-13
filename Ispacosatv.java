package atv1303;

public class Ispacosatv {

	public static void main(String[] args) {
	String espaços = "ispaços";
	String corrigir = espaços.replace("i", "e");
	
	String todosEspacos="e s p a c o ";
	String tiraespacos = todosEspacos.replaceAll(" ", "");
			
	System.out.println("Antes: "+ espaços + " Depois: " + corrigir);
	System.out.println("Antes: "+ todosEspacos + " Depois: " + tiraespacos);
	
	
	
	}

}
