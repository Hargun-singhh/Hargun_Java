package netflix;

public class catergory {
	String name;
	int numOfMovie;
	int rating;
	Movie[] movies;
	
	
	
	catergory(String name, int numOfMovie, int rating,Movie[] movies) {
		super();
		this.name = name;
		this.numOfMovie = numOfMovie;
		this.rating = rating;
		this.movies = movies;
	}
	
	void showTitle() {
		System.out.println(name+" |");
	}
	
	void show() {
		System.out.println("~~~~~~~~"+name+"~~~~~~~~");
		System.out.println("Total Movie"+numOfMovie);
		
		
	}
	void showmovie() {
		for(int idx=0;idx<movies.length;idx++) {
			movies[idx].show();
	}
	
	
	}

}
