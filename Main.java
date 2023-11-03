//    Java Program to Read The Number From Standard Input and    Java Program to Get Input from the User
 

/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = scan.nextInt();
        System.out.println("\n\n\nYou have entered:"+a);
    }
}*/


//    Java Program to Multiply Two Floating-Point Numbers
/* 
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first float:");
        float a = scan.nextFloat();
        System.out.print("Enter the second float:");
        float b = scan.nextFloat();
        float c=a*b;
        System.out.println("The product of two floats is:"+(c));
        
    }
}
*/


//    Java Program to Swap Two Numbers
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first a:");
        int a = scan.nextInt();
        System.out.print("Enter the second b:");
        int b = scan.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("the swaped numbers are  a:"+a+"  b:"+b);
    }
}
*/

//    Java Program to Add Two Binary Strings


/* 
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first string a:");
        String a = scan.nextLine();
        System.out.print("Enter the second string b:");
        String b = scan.nextLine();
        String c=a+b;
        System.out.println("The merged String is: "+c);
        scan.close();
    }
}
*/


//    Java Program to Add Two Complex numbers
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first compless number real,imaginary");
        int i = scan.nextInt();
        int j = scan.nextInt();
        ComplexNo a = new ComplexNo(i,j);
        System.out.print("Enter the second compless number real,imaginary");
        i = scan.nextInt();
        j = scan.nextInt();
        ComplexNo b = new ComplexNo(i, j);
        ComplexNo.showinfo(a);
        ComplexNo.showinfo(b);
        ComplexNo c = ComplexNo.add(a,b);
        ComplexNo.showinfo(c);
        scan.close();
    }
}
*/
//    Java Program to Check Even or Odd Integers
/* 
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        try{
        Scanner scan = new Scanner(System.in);
        int a;
        do{
            System.out.print("Enter the interger greater that 0");
            a = scan.nextInt();
        }while(a<1);
        if(a%2 == 0){
            System.out.println("The integer is Even");
        }

        else{
            System.out.println("the integer is Odd");
        }scan.close();}
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Enter an integer");
            
        }
        

    }
}
*/

//    Java Program to Find Largest Among 3 Numbers
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three integer one by one");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        int z= c > (a > b ? a : b) ? c : ((a>b) ? a : b) ;
        System.out.println("The greatest integer is"+z);
    }
}

*/

  //  Java Program to Find LCM of 2 numbers
/* 
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Enter two numbers:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a>b){
            lcmfind(a,b);
        }
        else{
            int c=a;
            a=b;
            b=c;
            lcmfind(a,b);


        }
        
    }
    public static void lcmfind(int a,int b){
            if(a%b == 0 ){
                System.out.println("lcm:"+a);

            }
            else{
                System.out.println("lcm:"+a*b);
            }}
}
*/



 //   Java Program to Find GCD or HCF of 2 numbers
//    Java Program to Display All Prime Numbers from 1 to N
/* 
import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        ArrayList<Integer> prime = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i=1; i<=N ; i++){
            int k=0;
            for(int j=1; j<=i ; j++){
                if(i%j == 0){
                    k++;
                }

            }
            if(k==2){
                prime.add(i);
            }
        }
        System.out.println(prime);

    }
}
*/
//   Java File Programs

// //     Java Program to Create a new file
// import java.io.File;
// import java.io.IOException;
// public class Main{
//     public static void main(String[] args) throws IOException{
//         File obj = new File("/mnt/programming731/javap/roughwork.txt");
//         if(obj.createNewFile()){
//             System.out.println("File created!");
//         }
//         else{
//             System.err.println("error ouccured");
//         }
//         }
// }
// // Java program to Delete file
// import java.io.File;
// import java.io.IOException;
// public class Main{
//     public static void main(String[] args) throws IOException{
//         File obj = new File("paractice.txt");
//         if(obj.exists()){
//             obj.delete();
//             System.out.println("File deleted!");
//         }
//         else{
//             System.out.println("Error");
//         }
//     }
// }

// //    Java Program to Create a temporary file
//  import java.io.File;
// import java.io.IOException;
// public class Main{
//     public static void main(String[] args) throws IOException{
//         File obj = new File("practice.txt");
//         if(obj.createNewFile()){
//             System.out.println("file created!");
//         }
//         if(obj.delete()){
//             System.out.println("fiile deleted!");
//         }
        
//     }
// }

// //    Java Program to Write into a file

// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args){
//         File obj = new File("roughwork.txt");
//         try {
//             Scanner scan = new Scanner(System.in);
//             System.out.print("Enter the text:    ");
//             String s = scan.nextLine(); 
//             FileWriter writer = new FileWriter(obj,true);
//             writer.write("\n");
//             writer.write(s);
//             scan.close();
//             writer.close();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
        
//     }
// }



// //   Java Program to Rename a file in java
// import java.io.File;
// public class Main{
//     public static void main(String[] args){
//         File file = new File("/mnt/programming731/javap/Lol.txt");
//         File rename = new File("/mnt/programming731/javap/roughwork.txt");
//         boolean flag = file.renameTo(rename);
//         if(flag == true){
//             System.out.println("File Successfully Renamed");

//         }
//         else{
//             System.out.println("Operation Failed");
//         }
//     }
// }

//    Java Program to Make a File Read-Only

// import java.io.File;
// public class Main{
//     public static void main(String[] args){
//         boolean flag;
//         try{
//             File file = new File("Lol.txt");
//             file.createNewFile();
//             flag = file.setReadOnly();
//             System.out.println("Is File is read-only?:"+flag);
//             flag = file.canWrite();
//             System.out.println("Is File is writable?:" + flag);

//         }
//         catch(Exception e){
//             e.printStackTrace();
//         }
//     }
// }


// import java.io.File;
// public class Main{
//     public static void main(String[] args){
//         try{
//         File file = new File("Lol.txt");
//         file.setWritable(false);
//         if(!file.canWrite()){
//             System.out.println("This File is read only.");

//         }
//         else{
//             System.out.println("This File is writable.");

//         }
//     }
//     catch(Exception e){
//         System.out.println("unable to change ");
//     }

//     }
// }



// import java.io.File;
// public class Main{
//     public static void main(String[] args){
//         File obj = new File("Lol.txt");
//         boolean flag = obj.setWritable(true);
//         System.out.println("The file "+obj.getAbsolutePath()+" writable:   "+flag);

//     }
// }

 //   Java Program to Compare Paths of Two files

// import java.io.File;

// public class Main{
//     public static void main(String[] args){        
//         File lolobj = new File("Lol.txt");
//         File roughobj = new File("roughtxt");
//         String lolP = lolobj.getAbsolutePath();
//         String roughP = roughobj.getAbsolutePath();
//         System.out.println(lolP);
//         System.out.println(roughP);
//         String a = (lolobj.compareTo(roughobj) == 0) ? ("paths of files are same") : ("paths of files are NOT same");
//         System.out.println(a);
//     }
// }


 
// import java.io.File;
 
// public class Main {
   
//     public static void main(String[] args)
//     {
 
//         File file1 = new File("Lol.txt");
//         File file2 = new File("rough.txt");
 
//         // Path comparison
//         if (file1.compareTo(file2) == 0) {
//             System.out.println(
//                 "paths of file1 and file2 are same");
//         }
//         else {
//             System.out.println(
//                 "Paths of file1 and file2 are not same");
//         }
//     }
// }

  //  Java Program to Copy one file into another file

// import java.io.*;
// import java.util.*;
// public class Main{
//     public static void main(String[] args) throws Exception{
//         Scanner sc = new Scanner(System.in);
//         //get the source file name
//         System.out.println("Enter the source filename from where you have to read/copy:");
//         String a = sc.nextLine();
//         //source file
//         File x = new File(a);
//         //get the destination file name
//         System.out.println("Enter the destination filename where you have to write/copy:");
//         String b = sc.nextLine();
//         //destination file
//         File y = new File(b);
//         // methord call
//         copyContent(x, y);
//         sc.close();
//     }
//     public static void copyContent(File a, File b) throws Exception{
//         FileInputStream in = new FileInputStream(a);
//         FileOutputStream out = new FileOutputStream(b);
//         try{
//             int n;
//             //read() function to read the 
//             //byte of data
//             while ((n = in.read()) != -1){
//                 //write() function to write
//                 //the byte of data
//                 out.write(n);
//             }
//         }
//         finally{
//             if (in != null){
//                 //close() function to close the 
//                 // stream
//                 in.close();
//             }
//             if (out != null){
//                 out.close();
//             }
//         }
//         System.out.println("File Copied");
//     }
// }


//    Java Program to Print all the Pattern that Matches Given Pattern From a File


// import java.io.*;
// import java.util.*;
// public class Main{
//     public static void main(String[] args) throws IOException{
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter the name of File to check:");
//         String a = scan.nextLine();
//         System.out.println("Enter the character:");
//         char c = scan.next().charAt(0);
//         compare(a, c);
//         scan.close();

//     }
//     public static void compare(String a,char c)throws IOException{
//         FileInputStream in = new FileInputStream(a);
//         int n,m=0,o=0;
//         ArrayList<Integer> posi = new ArrayList<Integer>();
//         while((n = in.read()) != -1){
//             o++;
//             if((char)n == c){
//                 m++;
//                 posi.add(o);
//             }
//         }
//         System.out.println("the characher "+c+" ouccours "+m+" times at \n"+posi);
//         in.close();
//     }
// }




// import java.io.*;

// import java.util.regex.*;

// public class Main{
//     public static void main(String[] args) throws IOException{
//         try{
//             FileWriter writer = new FileWriter("test.txt");

//             writer.write("Writing in the test file!\n"+
//             "Lol lol ho ha hu ho\nI don't think so you ass lol\n "+
//             "needs me ho ho ha ha ho  hoh lol");
//             writer.close();
//             System.out.println("Successfully wrote to the file.\n");

//         }
//         catch(IOException e){
//             System.out.println("An error occurred.");
//             e.printStackTrace();
//         }
//         BufferedReader read = new BufferedReader( new FileReader("test.txt"));

//         Pattern pattern = Pattern.compile("lol");

//         System.out.println("Matched Content");
//         String line;
//         while((line = read.readLine())!= null){
//             System.out.print(line);
//             Matcher match = pattern.matcher(line);
//             while(match.find()){
//                 //System.out.println(match.group(0));
//                 int start = match.start(0);
//                 int end = match.end(0);
//                 System.out.println(line.substring(start,end));
//             }
//         }
//         read.close();
//     }
// }

//    Java Program to Append a String in an Existing File


// import java.util.*;
// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;

// public class Main{
//     public static void main(String[] args) throws IOException{
//         FileWriter obj = new FileWriter("rough.txt",true);
//         obj.append("ha ho halo loha hola poha soha pakoda sakoda");
//         obj.close();
        
//     }
// }

//   Java Program to Read content from one file and writing it into another file

// import java.io.File;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOError;
// import java.io.IOException;
// public class Main{
//     public static void main(String[] args)throws IOException{
//         FileWriter write = new FileWriter("Lol.txt");
//         FileReader reader = new FileReader("rough.txt");
//         int n;
//         String str="";
//         while((n= reader.read()) != -1){
//             str += (char)n;
//         }
//         System.out.println(str);
//         write.append(str);
//         write.close();
//         reader.close();
//     }
// }

// Java program to read all mobile numbers present in given file
// Java program to read all mobile numbers
//present in given file

import java.util.regex.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        //Write Mobile Nu
    }
}










































































