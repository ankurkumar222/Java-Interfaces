package Code.AbstractClasses;

import Models.music.*;
import static util.Print.*;

abstract class Instruments {
	private int i; // Storage allocated for each

	public abstract void play(Note n);

	public String what() {
		return "Instrument";
	}

	public abstract void adjust();
}

class Winds extends Instruments {
	public void play(Note n) {
		print("Wind.play() " + n);
	}

	public String what() {
		return "Wind";
	}

	public void adjust() {
	}
}

class Percussions extends Instruments {
	public void play(Note n) {
		print("Percussion.play() " + n);
	}

	public String what() {
		return "Percussion";
	}

	public void adjust() {
	}
}

class Stringes extends Instruments {
	public void play(Note n) {
		print("Stringed.play() " + n);
	}

	public String what() {
		return "Stringed";
	}

	public void adjust() {
	}
}

class Brasss extends Winds {
	public void play(Note n) {
		print("Brass.play() " + n);
	}

	public void adjust() {
		print("Brass.adjust()");
	}
}

class Woodwinds extends Winds {
	public void play(Note n) {
		print("Woodwind.play() " + n);
	}

	public String what() {
		return "Woodwind";
	}
}

public class Music4 {
	// Doesn't care about type, so new types added to the system still work right:
	static void tune(Instruments i) {
		// ...
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Instruments[] e) {
		for (Instruments i : e)
			tune(i);
	}

	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Instruments[] orchestra = { new Winds(), new Percussions(), new Stringes(), new Brasss(), new Woodwinds() };
		tuneAll(orchestra);
	}
}
