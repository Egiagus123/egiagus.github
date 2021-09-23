package bhp.erp.model;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import org.compiere.model.MAttachment;
public class tetsaha {
		
	//nomor 1
//	public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Masukkan kata: ");
//        String kata = input.nextLine();
//        char[] huruf = kata.toCharArray();
//        String kata2 = "";
//        for (int j = huruf.length - 1; j >= 0; j--) {
//            System.out.print(huruf[j]);
//        }
//	}

	//Nomor 3
	public static void main(String[] args) {
      String[] alfabet = { "A","B","C","D","E","C"};

      Arrays.sort(alfabet);
      int test = 0;    	  
	  
      for(int i = 1; i < alfabet.length; i++) {   //menentukan array yang duplikat
    	  if(alfabet[i].equals("C")) {
    		  test = test+1;
    	  }
    	  String hhj = alfabet[i - 1];
	      if(alfabet[i] == alfabet[i - 1]) {	    	 
	         System.out.println("Duplicate : " + alfabet[i] +" "+ test );
	      }    	  
      }
   }

	//nomor 4
//	public static void main(String[] args) {
//	      String[] alfabet = { "A","A","B","C","C","B","B","C","C"};
//
//	      Arrays.sort(alfabet);
//	      int test = 0;
//	      int b = 0;
//	      String Cs = "";
//	      String Bs = "";
//	      
//	      for(int i = 1; i < alfabet.length; i++) {   //menentukan array yang duplikat
//	    	  if(alfabet[i].equals("C")) {
//	    		  test = test+1;
//	    		  Cs = alfabet[i];
//	    	  }else if(alfabet[i].equals("B")) {
//	    		  b = b+1;
//	    		  Bs =alfabet[i];
//	    	  }
//	    	  
//	      }
//	      System.out.println("Duplicate : " + Cs +test+Bs+b);
//	}
//
}

