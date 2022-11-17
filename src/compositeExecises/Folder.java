package compositeExecises;

import java.util.ArrayList;

public class Folder extends FileSystemComponent{
	private ArrayList<FileSystemComponent> subComponents;
	private FileSystemComponent tempComponent;
	
	public Folder(String name) {
		this.name = name;
		this.type = "folder";
		subComponents = new ArrayList<FileSystemComponent>();
	}

	@Override
	public void describe() {
		System.out.println(this.getClass()+
				"\nName: "+this.name+"\tType: "+this.type+"\n");
		if (subComponents.isEmpty()) {
			System.out.println("No sub component");
		}
		else {
			for (FileSystemComponent subComponent: subComponents) {
				subComponent.describe();
			}
		}
			
		}
	
	public FileSystemComponent add(String name, String type) {
		if (type.equalsIgnoreCase("TXT")) {
			this.tempComponent = new File(name, "txt");
		}
		else if (type.equalsIgnoreCase("PDF")) {
			this.tempComponent = new File(name, "pdf");
		}
		else if (type.equalsIgnoreCase("FOLDER")) {
			this.tempComponent = new Folder(name);
		}
		else {
			System.out.println("Ce type n'est pas pris en charge."
					+ "\nEssayez (txt/pdf/folder)");
		}
		subComponents.add(tempComponent);
		return tempComponent;
	}
	public void delete(int index) {
		subComponents.remove(index);
	}
	public void obtain(int index) {
		System.out.println("Component: "+subComponents.get(index).getClass());
		System.out.println("Description: ");
		subComponents.get(index).describe();
	}

}
