import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s= "D:/JavaIO/Avg/input.txt";
           File f= new File(s);
           if(f.exists()){
        	   if(f.isFile()){
        		   System.out.println("valid file");
        	   }else{
        		   System.out.println("valid folder");
        	   }
        	   
           }
	}

}
