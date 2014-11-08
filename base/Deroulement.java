package base;
import content.*;
import letter.*;
public class Deroulement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City roubaix = new City("Roubaix");
		Inhabitant perso1 = new Inhabitant("perso1", roubaix);
		Inhabitant perso2 = new Inhabitant("perso2", roubaix);
		roubaix.addInhabitant(perso1);
		roubaix.addInhabitant(perso2);
		Text<String> t = new Text<String>("bonjour perso 2 comment vas tu ?");
		perso1.postsLetter(new SimpleLetter(perso1, perso2, t));
		
		
		roubaix.playDay();
		roubaix.playDay();
		perso1.postsLetter(new RegistredLetter<SimpleLetter>(new SimpleLetter(perso1, perso2, t)));
		
		roubaix.playDay();
		roubaix.playDay();
		Money<Integer> content = new Money<Integer>(15);
		perso2.postsLetter(new RegistredLetter<PromissoryNote>(new PromissoryNote(perso1, perso2,content)));
		
		roubaix.playDay();
		roubaix.playDay();
		roubaix.playDay();
		content = new Money<Integer>(100);
		perso2.postsLetter(new UrgentLetter<RegistredLetter<PromissoryNote>>(new RegistredLetter<PromissoryNote>(new PromissoryNote(perso1, perso2,content))));

		roubaix.playDay();
		roubaix.playDay();
		perso1.postsLetter(new SimpleLetter(perso1, perso2, t));

		roubaix.playDay();
		roubaix.playDay();
		roubaix.playDay();
		System.out.println(roubaix.toString());
	}
}
