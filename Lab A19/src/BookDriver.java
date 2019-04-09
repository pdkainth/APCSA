import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookDriver {

	private static String removePunctuation(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'z')
				newStr += str.charAt(i);
		}
		return newStr;
	}

	public static void main(String[] args) {
		System.out.println("Indexed Words 2018-19");
		ArrayList<ArrayList<String>> pages = new ArrayList<ArrayList<String>>();
		ArrayList<String> page = new ArrayList<String>();
		try{
			Scanner pagesFile = new Scanner(new File("book1.txt"));
			while (pagesFile.hasNext()){
				String fname = pagesFile.nextLine();
				page = new ArrayList<String>();
				try {
					Scanner sc = new Scanner(new File(fname));
					while (sc.hasNext()){
						String word = sc.next();
						word = removePunctuation(word);
						if (!word.equals("") && page.indexOf(word.toLowerCase()) < 0 && page.indexOf(word) < 0)
							page.add(word);
					}
					pages.add(page);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
			Book b = new Book(pages);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println();
		pages = new ArrayList<ArrayList<String>>();
		page = new ArrayList<String>();
		try{
			Scanner pagesFile = new Scanner(new File("hitchhiker.txt"));
			while (pagesFile.hasNext()){
				String fname = pagesFile.nextLine();
				page = new ArrayList<String>();
				try {
					Scanner sc = new Scanner(new File(fname));
					while (sc.hasNext()){
						String word = sc.next();
						word = removePunctuation(word);
						if (!word.equals("") && page.indexOf(word.toLowerCase()) < 0 && page.indexOf(word) < 0)
							page.add(word);
					}
					pages.add(page);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
			Book b2 = new Book(pages);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}