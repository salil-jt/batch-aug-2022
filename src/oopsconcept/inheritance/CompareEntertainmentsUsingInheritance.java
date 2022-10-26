package oopsconcept.inheritance;

public class CompareEntertainmentsUsingInheritance {
	public static void main(String[] args) {
		
		Entertainment ent_obj = new Entertainment();
		
		Movie julai = new Movie();
		julai.name = "Julai";
		julai.director = "Trivikram";
		julai.stuntMaster = "Peter Hein";
		julai.numberOfArtists = 57;
		julai.releaseDate = "15-Aug-2012";

		julai.collectionsFirstWeek = 215467.8;
		julai.collectionsRestOfTheDays = 541132.5;

		Drama ramayan = new Drama();
		ramayan.name = "Ramayana";
		ramayan.writer = "Valmiki";
		ramayan.stageSetter = "Anjaneya";
		ramayan.numberOfArtists = 200000;
		ramayan.releaseDate = "17-Mar-1659 BC";

		ramayan.collectionsFirstWeek = 3282937242.86;
		ramayan.collectionsRestOfTheDays = 93488272349.51;

		Circus jumbo = new Circus();
		jumbo.name = "Jumbo";
		jumbo.ringMaster = "Antony";
		jumbo.numberOfArtists = 316;
		jumbo.releaseDate = "16-Dec-1997";

		jumbo.collectionsFirstWeek = 2123132.21;
		jumbo.collectionsRestOfTheDays = 234936725.09;

//		if ((jumbo.getTotalCollections() > julai.getTotalCollections())
//				&& (jumbo.getTotalCollections() > ramayan.getTotalCollections())) {
//			jumbo.print();
//		} else if (julai.getTotalCollections() > ramayan.getTotalCollections()) {
//			julai.print();
//		} else {
//			ramayan.print();
//		}
//		
		
		
		
		
		
		Movie businessMan = new Movie();
		businessMan.name = "Business Man";
		businessMan.director = "Puri Jagannadh";
		
		Drama devdas = new Drama();
		devdas.name = "Devdas";
		
		compareEntertainments(julai,ramayan,jumbo);
		
		
		//printName(businessMan); 
		//printName(devdas); 
		
		printMovie(businessMan);
		//printMovie(devdas); -- NOT WORK
		
		
		//downcasting
		// DOwncasting
		Entertainment e;
		Movie m = new Movie();
		e = m; 
		
		
		Drama d = new Drama();
		e = d; 
		
		// m = d;
		
		Entertainment ent1;
		Drama d1 = new Drama();
		ent1 = d1;

		Drama d2 = (Drama)ent1; 






	}
	
	public static void printName(Entertainment e)
	{
	    System.out.println("Name of the entertainment is " + e.name);
	}
	
	public static void printMovie(Movie m)
	{
	    System.out.println(m.name + " is the director for movie " + m.name);
	}
	
	
	public static void compareEntertainments(Entertainment ent1, Entertainment ent2, Entertainment ent3)
    {
    if((ent1.getTotalCollections() > ent2.getTotalCollections()) && (ent1.getTotalCollections() > ent3.getTotalCollections()))
        {
            System.out.println(ent1.name + " has the highest collections.");
        }
        else if (ent2.getTotalCollections() > ent3.getTotalCollections())
        {
            System.out.println(ent2.name + " has the highest collections.");
        }
        else
        {
            System.out.println(ent3.name + " has the highest collections.");
        }
    }

	
	


}

class Entertainment {
	String name;
	int numberOfArtists;
	String releaseDate;
	double collectionsFirstWeek;
	double collectionsRestOfTheDays;

	double getTotalCollections() {
		return collectionsFirstWeek + collectionsRestOfTheDays;
	}

	void printEntertainment() {
		System.out.println(name + " got the following collections ");
		System.out.println("First Week : " + collectionsFirstWeek);
		System.out.println("Rest Of The Days : " + collectionsRestOfTheDays);
		System.out.println("Total Collections : " + getTotalCollections());
		System.out.println("Total Artists : " + numberOfArtists);
		System.out.println("Release Date : " + releaseDate);
	}
	
	
	

}

class Movie extends Entertainment {
	String director;
	String stuntMaster;

	void print() {
		printEntertainment();
		System.out.println("Director : " + director);
		System.out.println("Stunt Master : " + stuntMaster);
	}
}

class Drama extends Entertainment {
	String writer;
	String stageSetter;

	void print() {
		printEntertainment();
		System.out.println("Writer : " + writer);
		System.out.println("Stage Setter : " + stageSetter);
	}
}

class Circus extends Entertainment {
	String ringMaster;

	void print() {
		printEntertainment();
		System.out.println("Ring Master : " + ringMaster);
	}
}
