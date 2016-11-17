import java.util.ArrayList;
import java.util.Collection;


public class Drive extends FileSystemComponent {
	protected String name;
	protected Collection<FileSystemComponent> files = new ArrayList<FileSystemComponent>();

	
	public Drive(String name) {
		this.name = name;
	}

	

	public void add(FileSystemComponent file) {
		files.add(file);
	}

	
	public void print(){
		System.out.println("drive : "+name);
		 for(FileSystemComponent fileSystemComponent : files){
			 fileSystemComponent.print();
			 
		 }
	
	}
	@Override
	int getSizeInBytes() {
		int sizeInBytes = files.stream().mapToInt(FileSystemComponent::getSizeInBytes).sum();
		return sizeInBytes;
	} 
}
