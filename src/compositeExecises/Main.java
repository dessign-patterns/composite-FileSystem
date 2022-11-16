package compositeExecises;

public class Main {

	public static void main(String[] args) {
		FileSystemComponent root, src, compositeExercises;
		
		root = new Folder("compositeExercises");
		src =  ((Folder) root).add("src","folder");
		compositeExercises = ((Folder) src).add("compositeExercises","folder");
		((Folder) compositeExercises).add("File","txt");
		((Folder) compositeExercises).add("FilseSystemComponent","txt");
		((Folder) compositeExercises).add("Folder","pdf");

		root.describe();
	}

}
