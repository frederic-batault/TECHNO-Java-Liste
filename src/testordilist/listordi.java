package testordilist;

import java.util.ArrayList;
import java.util.List;

public class listordi {

	public static void main(String[] args) {
		Ordi ordinateur1 = new Ordi("Dell","Vostro");
		List <Ordi>refListe = new ArrayList <Ordi>();
		refListe.add(ordinateur1);
		boolean bResult;
		bResult = refListe.contains(ordinateur1);
		if (bResult == true) {
			System.out.println("Cet ordinateur est dans la liste");
		}
		else {
			System.out.println("Cet ordinateur n'est pas dans la liste");
	}
	}
}
