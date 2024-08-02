package test240724.object1;

public class FileController {
	FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		
		return fd.checkName(file);
	}
	
	public void fileSave(String file, StringBuilder sb) {
		fd.fileSave(file, null);
	}
	
	public StringBuilder fileOpen(String file) {
		return null;
	}
	
	public void fileEdit(String file, StringBuilder sb) {
		
	}

}
