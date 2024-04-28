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

// import java.util.regex.*;
// import java.io.*;
// /**
//  * Main
//  */
// public class Main {

//     public static void main(String[] args) throws IOException{
//         PrintWriter pw = new PrintWriter("rough.txt");
//         Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
//         BufferedReader br = new BufferedReader(new FileReader("Mango.txt"));
//         String line =  br.readLine();
//         while(line != null){
//             Matcher m = p.matcher(line);
//             while(m.find()){
//                 pw.println(m.group());
//             }
//             line = br.readLine();
//         }
//         pw.flush();
//     }
// }

// // Java program to read all mobile numbers 
// // present in given file 
// import java.util.regex.*; 
// import java.io.*; 
  
// class MobileNumberExtraction  
// { 
//     public static void main(String[] args) throws IOException 
//     { 
//         // Write Mobile Numbers to output.txt file 
//         PrintWriter pw = new PrintWriter("output.txt"); 
  
//         // Regular expression for mobile number 
//         Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 
  
//         // BufferedReader for reading from input.txt file 
//         BufferedReader br = new BufferedReader 
//                                 (new FileReader("input.txt")); 
//         String line = br.readLine(); 
          
//         while (line != null)  
//         { 
//             Matcher m = p.matcher(line); 
  
//             while (m.find())  
//             { 
//                 // Write the mobile number to output.txt file 
//                 pw.println(m.group()); 
//             } 
  
//             line = br.readLine(); 
//         } 
//         pw.flush(); 
//     } 
// } 



// Java program to extract the
// email ids from a given text file
 
// import java.util.regex.*;
// import java.io.*;
 
// class EmailIdExtraction {
//     public static void extractEmailIds(
//         BufferedReader br,
//         PrintWriter pw,
//         Pattern p) throws IOException
//     {
 
//         String line = br.readLine();
 
//         while (line != null) {
 
//             Matcher m = p.matcher(line);
 
//             // If any match
//             while (m.find()) {
 
//                 // write the email id
//                 // to output.txt file
//                 pw.println(m.group());
//             }
 
//             // Goto next line in input.txt file
//             line = br.readLine();
//         }
 
//         pw.flush();
//     }
 
//     // Driver code
//     public static void main(String[] args)
//         throws IOException
//     {
 
//         // PrintWriter for writing email id
//         // to output.txt file
//         PrintWriter pw
//             = new PrintWriter("rough.txt");
 
//         // Compile() argument is the
//         // regular expression for email id
//         Pattern p
//             = Pattern.compile(
//                 "[a-zA-Z0-9]"
//                 + "[a-zA-Z0-9_.]"
//                 + "*@[a-zA-Z0-9]"
//                 + "+([.][a-zA-Z]+)+");
 
//         // BufferedReader for reading
//         // from input.txt file
//         BufferedReader br
//             = new BufferedReader(
//                 new FileReader("Mango.txt"));
 
//         // Calling extractEmailIds
//         extractEmailIds(br, pw, p);
//     }
// }


// import java.util.regex.*;
// import java.io.*;
// public class Main {

//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new FileReader("Mango.txt"));
//         Pattern p = Pattern.compile("[a-zA-Z0-9]"
//                                     +"[a-zA-Z0-9_.]"
//                                     +"*@[a-zA-Z0-9]"
//                                     +"+([.][a-zA-Z]+)+");
//         PrintWriter pw = new PrintWriter("rough.txt");
//         collectemail(br, p, pw);
//     }
//     public static void collectemail(BufferedReader br,Pattern p, PrintWriter pw) throws IOException{
//         String line = br.readLine();
//         while(line != null){
//             Matcher m = p.matcher(line);
//             while(m.find()){
//                 pw.println(m.group());
//             }
//             line = br.readLine();

//         }
//     pw.flush();
//     }
    
// }

// import java.util.ArrayList;

// public class Main {

//     public static void main(String[] args){
//         String name = "orange";
//         System.out.println(reverseVowels(name));

//     }
//     public static String reverseVowels(String s) {
//         ArrayList<Integer> index = new ArrayList<>();
//         for(int i=0; i<s.length();i++){
//             char m= s.charAt(i);
//             if(m=='a' || m=='e' || m=='i' || m=='o' || m=='u'){
//                 index.add(i);
//             }
//         }
//         System.out.println(index);
//         int size = index.size();
//         for(int i=0; i<= (int)(size/2);i++){
//             System.out.println(i);
//             System.out.println(s);
//             char t = (s.charAt(index.get(i)));
//             System.out.println(s);
//             s=s.replace(s.charAt(index.get(i)),s.charAt(index.get(size-i-1)));
//             System.out.println(s);
//             s=s.replace((s.charAt(index.get(size-i-1))),t);
//             System.out.println(s);
//         }
//         return s;
//     }
// }




// import java.util.ArrayList;

// public class Main {

//     public static void main(String[] args){
//         String name = "orange";
//         System.out.println(reverseVowels(name));

//     }
//     public static String reverseVowels(String s) {
//         char[] st = new char[s.length()];
//         ArrayList<Integer> index = new ArrayList<>();
//         for(int i=0 ; i<s.length(); i++){
//             char m = s.charAt(i);
//             st[i]=(m);
//             if(m=='a' || m=='e' || m=='i' || m=='o' || m=='u'){
//                  index.add(i);
//             }
//         }
//         System.out.println(st);
//         System.out.println(index);
//         int size = index.size();
//         for(int i=0; i< (int)(size/2);i++){
//             char f = st[index.get(i)];
//             st[index.get(i)]=st[index.get(size-1-i)];
//             st[index.get(size-1-i)]=f;
//             System.out.println(st);
//         }
//         String e="";
//         for(char i : st){
//             e=e+i;
//         }
//         return e;


//     }
// }



// public class Main {

//     public static void main(String[] args){
//         String name = "orange";
//         System.out.println(reverseVowels(name));

//     }
//     public static String reverseVowels(String s) {
//         char[] word = s.toCharArray();
//         String vowels="aeiouAEIOU";
//         int start=0;
//         int end= s.length()-1;
//         while( start < end){
//             while( start<end && vowels.indexOf(word[start])==(-1) ){
//                 start++;
//             }
//             while( start<end && vowels.indexOf(word[end])==(-1)){
//                 end--;
//             }
//             char temp = word[start];
//             word[start]=word[end];
//             word[end]=temp;
//             start++;
//             end--;

            
//         }
//         String ans = new String(word);
//         return ans;
//     }
// }


// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.

 

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
// Example 2:

// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]
 

// Constraints:

// 2 <= nums.length <= 105
// -30 <= nums[i] <= 30
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 

// Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)



// public class Main {
//     public static void main(String[] args){
//         int[] nums={1,2,3,4,5};
//         for(int i: productExceptSelf(nums)){System.out.println(i);}
//     }
//     public static int[] productExceptSelf(int[] nums) {
//         int len= nums.length;
//         int[] ans = new int[len];
//         for(int i=0; i<len;i++){
//             int k=1;
//             for(int j=0; j<len; j++){
//                 if(i!=j){
//                     k=k*nums[j];
//                 }
//             }
//             ans[i]=k;
//         }
//         return ans;
//     }
// }



// public class Main {
//     public static void main(String[] args){
//         int[] nums={1,2,3,4,5};
//         for(int m: productExceptSelf(nums)){System.out.println(m);};
//     }
//     public static int[] productExceptSelf(int[] nums){
//         int len=nums.length;
//         int[] ans= new int[len];
//         int i=0,j=0;
//         int k=1;
//         while(i<len){
//             if(i!=j){
//                 k=k*nums[i];
//             }
//             i++;
//             ans[j]=k;
//             if(i==len && j<len-1){
                
//                 k=1;
//                 i=0;
//                 j++;
//             }
//         }
//         return ans;
//     }
// }





// public class Main {
//     public static void main(String[] args){
//         int[] nums={1,100,3,4,5};
//         System.out.println(increasingTriplet(nums));
        
//     }
//     // public static boolean increasingTriplet(int[] nums) {
//     //     int len=nums.length;
//     //     boolean ans=false;
//     //     for(int i=1; i<len-1;i++){
//     //         if( nums[i-1]< nums[i] && nums[i]<nums[i+1]){
//     //             ans=true;
//     //         }
//     //     }
//     //     return ans;

//     // }
//     public static boolean increasingTriplet(int[] nums) {
//         if (nums == null || nums.length < 3) {
//             return false;
//         }
//         int a = Integer.MAX_VALUE;
//         int b = Integer.MAX_VALUE;
//         System.out.println(a+"\n\n"+b);
        
//         for (int num : nums) {
//             System.out.println(num+"lol");
//             if (num <= a) {
//                 a = num;
//                 System.out.println(a+"a");
//             } else if (num <= b) {
//                 b = num;
//                 System.out.println(b+"b");
//             } else {
//                 System.out.println("hi");
//                 return true;
//             }
//         }
        
//         return false;
//     }
// }



// Given an array of characters chars, compress it using the following algorithm:

// Begin with an empty string s. For each group of consecutive repeating characters in chars:

// If the group's length is 1, append the character to s.
// Otherwise, append the character followed by the group's length.
// The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

// After you are done modifying the input array, return the new length of the array.

// You must write an algorithm that uses only constant extra space.

 

// Example 1:

// Input: chars = ["a","a","b","b","c","c","c"]
// Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
// Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
// Example 2:

// Input: chars = ["a"]
// Output: Return 1, and the first character of the input array should be: ["a"]
// Explanation: The only group is "a", which remains uncompressed since it's a single character.
// Example 3:

// Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
// Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
// Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
 

// Constraints:

// 1 <= chars.length <= 2000
// chars[i] is a lowercase English letter, uppercase English letter, digit, or symbol.

// import java.util.ArrayList;

// public class Main{
//     public static void main(String[] args){
//         char[] chars ={'a','a','b','b','c','c','c'};
//         System.out.println(compress(chars));
//     }
//     public static int compress(char[] chars) {
//         ArrayList<Character> ans= new ArrayList<>();
//         int len = chars.length;
//         int i=0;
//         while(i<len){
//             char c=chars[i];
//             int t=0;
//             while(chars[i] == c){
//                 t++;
//                 if(i<(len-1)){
//                     i++;
//                 }
//                 else{
//                     break;
//                 }
//             }
//             ans.add(chars[i]);
//             if(t!=1){
//                 ans.add((char)t);
//             }
//             System.out.println(i+"\n");
//             System.out.println(ans);
//         }
//         int k=ans.size();
//             return k;
//     }
// }


// public class Main{
//     public static void main(String[] args){
//         String s = "abc";
//         String t = "ahbgd";
//         System.out.println(isSubsequence(s,t));
//     }
//     public static boolean isSubsequence(String s, String t) {
//         int st=0;
//         for(int tt=0; tt<t.length();tt++){
//             if(t.charAt(tt)==s.charAt(st)){
//                 st++;
//                 if(st==(s.length())){
//                     return true;
//                 }
//             }
//         }
        
//         return false;
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         int[] height = {1,8,6,2,5,4,8,3,7};
//         System.out.println(maxArea(height));
        
//     }
//     public static int maxArea(int[] height){
//         int i=0,j=(height.length-1);
//         int a=0,amax=0;
//         while(i<j){
//             System.out.println(i+"\t"+j);
//             a=(j-i)*(Math.min(height[i],height[j]));
//             if(amax<a){amax=a;}
//             if(height[i]<height[j]){
//                 i++;
//             }else if(height[j]<height[i]){
//                 j--;
//             }else{i++;
//             j--;}

//         }
//         return amax;
//     }    
// }



// You are given an integer array nums consisting of n elements, and an integer k.

// Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

 

// Example 1:

// Input: nums = [1,12,-5,-6,50,3], k = 4
// Output: 12.75000
// Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75





// public class Main{
//     public static void main(String[] args){
//         int[] nums = {1,12,-5,-6,50,3};
//         int k = 4;
//         System.out.println(findMaxAverage(nums,k));
        
//     }
//     public static double findMaxAverage(int[] nums, int k){
//         int s=0;
//         int smax=Integer.MIN_VALUE;
//         for(int i=0;i<k;i++){
//             s=s+nums[i];
//         }
//         smax=s;
//         for(int i=k;i<nums.length;i++){
//             s+=nums[i]-nums[i-k];
//             smax=Math.max(smax,s );
//         }
//         return (double)smax/k;
//     }    
// }




// Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

// Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

 

// Example 1:

// Input: s = "abciiidef", k = 3
// Output: 3
// Explanation: The substring "iii" contains 3 vowel letters.



// public class Main{
//     public static void main(String[] args){
//         String s = "abciiidef";
//         int k = 3;
//         System.out.println(maxVowels(s,k));
        
//     }
//     public static int maxVowels(String s, int k){
//         char[] S = s.toCharArray();
//         int[] b=new int[s.length()];
//         int j=0,m=0;
//         for(char i : S){
//             if("aeiou".indexOf(i) !=-1){ b[j]=1;
//             }else{b[j]=0;}
//             j++;
//         }
//         for(int l=0;l<k;l++){
//             m+=b[l];
//         }
//         int mmax=m;
//         for(int l=k;l<s.length()-1;l++){
//             m+=b[l]-b[l-k];
//             mmax=Math.max(mmax,m);
//             if(mmax==k){return k;}
//         }
//         return mmax;
//     }
// }


// Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

 

// Example 1:

// Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
// Output: 6
// Explanation: [1,1,1,0,0,1,1,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

// public class Main{
//     public static void main(String[] args){
//         int[] nums = {0,0,1,0,0,1,1,1,0,0,1,0,1,0,1,1};
//         int k = 2;
//         System.out.println(longestOnes(nums,k));
//     }
//     public static int longestOnes(int[] nums, int k) {
//         int zerocount=0,l=0,r=0,max=0;
//         while(r<nums.length){
//             if(nums[r]==0){
//                 zerocount++;
//             }
//             while(zerocount>k){
//                 if(nums[l]==0){
//                     zerocount--;
//                 }
//                 l++;
//             }
//             max=Math.max(max, r-l+1);
//             r++;
//         }
//         return max;
//     }
// }



// Longest Subarray of 1's After Deleting One Element


// Given a binary array nums, you should delete one element from it.

// Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.

 

// Example 1:

// Input: nums = [1,1,0,1]
// Output: 3
// Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.


// public class Main{
//     public static void main(String[] args){
//         int[] nums = {0,1,1,1,0,1,1,0,1};
//         System.out.println(longestSubarray(nums));
//     }
//     public static int longestSubarray(int[] nums) {
//         int l=0,r=0,max=0,Zcount=0;
//         while (r<nums.length) {
//             if(nums[r]==0){
//                 Zcount++;
//             }
//             while (Zcount>1) {
//                 if (nums[r]==0) {
//                     Zcount--;
//                 }
//                 l++;
//             }
//             max=Math.max(max,(r-l+1));
//             r++;
//         }
//         return max;
//     }
// }



// Find the Highest Altitude

// There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

// You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

 

// Example 1:

// Input: gain = [-5,1,5,0,-7]
// Output: 1
// Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.



// import java.util.ArrayList;
// public class Main{
//     public static void main(String[] args){
//         int[] nums = {1,7,3,6,5,6};
//         System.out.println(pivotIndex(nums));
//     }
//         public static int pivotIndex(int[] nums) {
//             ArrayList<Integer> sol= new ArrayList<>();
//             for(int i=0; i<nums.length; i++){
//                 int l=0,r=0;
//                 for(int j=0; j<nums.length; j++){
//                     if(j<i){
//                         l=nums[j]+l;
//                     }
//                     if(i<j){
//                         r=nums[j]+r;
//                     }
//                 }
//                 if(r==l){
//                     sol.add(i);
//                 }
//             }
//             if(sol.size()==0){return -1;
//             }else{
//             return sol.get(sol.size()-1);}
//         }
// }



// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

public class Main{
    public static void main(String[] args){
        int[] nums = {0,0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
                    public static int removeDuplicates(int[] nums) {
                        int replaced=1,replacing=1;
                        for(int i=1; i<nums.length;i++){
                            while(nums[i]==nums[replacing]){
                                i++;
                            }
                            replacing=i;
                            nums[replaced]=nums[replacing];
                            replaced++;
                        }
                        for(int k:nums){
                            System.out.println(k);
                        }
                        return replaced;
                    }
}







