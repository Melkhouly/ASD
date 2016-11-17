import java.util.ArrayList;
import java.util.Collection;



public class Directory extends FileSystemComponent  {
	 protected String name;
	 
	 protected Collection<FileSystemComponent> files = new ArrayList<FileSystemComponent>();


	 public Directory(String name) {
		 this.name = name;
	 }
	 
	 public void print(){
		 System.out.println("dir : "+name+" size="+getSizeInBytes()+" bytes");
		 
		 for(FileSystemComponent fileSystemComponent : files){
			 fileSystemComponent.print();
			 
		 }
	}
	 
	public void add(FileSystemComponent file) {
		files.add(file);
	}

	
	int getSizeInBytes() {
		int sizeInBytes = files.stream().mapToInt(FileSystemComponent::getSizeInBytes).sum();
		return sizeInBytes;
	} 
}
