package com.inhertance;

class User {
	String userid;
	String password;

	public void freeTrailer() {
		System.out.println("He can watch");
	}
	public void freeMovies() {
		System.out.println("Free movie");
	}
}

class PrimeUser extends User {
	public void paidMovie() {
		System.out.println("He can watch paid movie");
	}
}
public class Driver {
	public static void main(String[] args) {
//		User u = new User();
//		System.out.println(u.userid);
//		System.out.println(u.password);
//		u.freeMovies();
//		u.freeTrailer();
		System.out.println("===========================");
		// subclass
		PrimeUser pm = new PrimeUser();
		System.out.println(pm.userid);
		System.out.println(pm.password);
		pm.freeMovies();
		pm.freeTrailer();
		pm.paidMovie();
	}
}
