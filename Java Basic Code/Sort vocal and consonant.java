import java.util.*;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        ArrayList<Character> vocs = new ArrayList<Character>();
        ArrayList<Character> consts = new ArrayList<Character>();
       
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Your words: ");
        String words = myObj.nextLine(); 
        words = words.toLowerCase();
        for (int i = 0; i < words.length(); ++i) {
            char s = words.charAt(i);
            if(s == 'a' || s== 'e' || s == 'i' || s == 'o' ||s == 'u' ) 
            { 
                vocs.add(s);
            } 
            else if((s>='a' && s<='z'))
            { 
                consts.add(s);
            }
        }
            
        System.out.println("List Vocal: " + vocs);
        System.out.println("List Consonants: " + consts);
        
        StringBuilder voc = new StringBuilder();
        for (Character vc: vocs) {
            voc.append(vc);
        }
        String vocal = voc.toString();
        System.out.println("String Vocal:" +vocal);
        
        StringBuilder con = new StringBuilder();
        for (Character cc: consts) {
            con.append(cc);
        }
        String consonant = con.toString();
        System.out.println("String Consonant: " +consonant);
        

    }}