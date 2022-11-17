package compositeExecises;

public class File extends FileSystemComponent {

	public File(String name, String type) {
		this.name = name;
		if (type.equalsIgnoreCase("TXT")) {
			this.type = "txt";
		}
		else if (type.equalsIgnoreCase("PDF")) {
			this.type = "pdf";
		}
		else {
			System.out.println("Ce type n'est pas pris en charge."
					+ "\nEssayez (txt/pdf)");
		}
		
	}

	@Override
	public void describe() {
		System.out.println(this.getClass()+"\nName: "+this.name+"\tType: "+this.type+"\n");
	}
	

}
