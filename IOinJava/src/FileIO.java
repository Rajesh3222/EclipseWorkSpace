import java.io.*;
public class FileIO {
    public static void main(String[] args) {
    	try{
    	String path1="D:\\JavaIO\\Avg\\input.txt";
    	String path2="D:\\JavaIO\\Avg\\output.txt";
//		FileInputStream fis=new FileInputStream(path1);
//		FileOutputStream fos=new FileOutputStream(path2);
    	FileReader fr= new FileReader(path1);
    	FileWriter fw= new FileWriter(path2);
    	BufferedReader br=new BufferedReader(fr);
    	BufferedWriter bw= new BufferedWriter(fw);
		       int temp;
		       while((temp=br.read())!=-1){
		    	  
		    	   bw.write(temp);
		       }
		       bw.flush();
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
	}
}
