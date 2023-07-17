package netflix;

public class Movie {
	String title;
	String duration;
	double rating;
	
	actor[] starcast;

	Movie(String title, String duration, double rating, actor[] starcast) {
		super();
		this.title = title;
		this.duration = duration;
		this.rating = rating;
		this.starcast = starcast;
	}
	void show() {
		System.out.println("~~~~MOVIE~~~~~~");
		System.out.println("Movie Title:" + title);
		System.out.println("Rating:" + rating);
		System.out.println("Duration: "+duration);
		
		System.out.println("STAR CAST OF "+title);
		for(int idx=0;idx<starcast.length;idx++) {
			starcast[idx].show();
		}
		
	}
	

}
