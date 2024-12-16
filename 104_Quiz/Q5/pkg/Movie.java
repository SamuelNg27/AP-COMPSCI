package pkg;

public class Movie{
    String name;
    double rating;
    int ratingNum;
    int revenue;
public Movie(){
    name = "Avengers";
    rating = 8;
    ratingNum = 33;
    revenue = 623357910;
}
public Movie(String name, double rating, int ratingNum, int revenue){
    this.name = name;
    this.rating = rating;
    this.ratingNum = ratingNum;
    this.revenue = revenue;
}
public void movieToString(){
    System.out.println("Movie: "+ name);
    System.out.println("Rating: "+ rating);
    System.out.println("Number of Ratings: "+ratingNum);
    System.out.println("Revenue:  "+ revenue);
    System.out.println(" ");
}
public void setMovieName(String name){
    this.name = name;
}
public void setMovieRevenue(int revenue){
    this.revenue = revenue;
}
public String getMovieName(){
    return name;
}
public int getRevenue(){
    return revenue;
}
public void addRating(double addedrating){
    rating= rating*ratingNum;
    rating =rating + addedrating;
    ratingNum = ratingNum + 1;
    rating =rating/ratingNum;
}
public double getRating(){
    return rating;
}
public boolean compareRatings(Movie x){
    return rating>x.getRating();    
}
public int revenueToString(){
    return revenue;
}

}

