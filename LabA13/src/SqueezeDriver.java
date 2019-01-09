import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class SqueezeDriver {

	public static void main(String[] args) {
		Squeeze s = new Squeeze("squeeze.txt");
		s.squeezeText();
	}

}