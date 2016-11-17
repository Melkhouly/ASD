


public abstract class FileSystemComponent {
	abstract int getSizeInBytes();

	abstract void print();
	
	void add(FileSystemComponent fileSystemComponent){
		throw new UnsupportedOperationException();
	}
}
