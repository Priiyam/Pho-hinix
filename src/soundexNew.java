import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class soundexNew {
	int cnt= 0;

    public static int value(int i, int n, String h) {
        if (i == n)
            return 1;
         if ((h.charAt(i + 1) != ('ा') && h.charAt(i + 1) != ('ि') && h.charAt(i + 1) != ('ी') && h.charAt(i + 1) != ('ु') && h.charAt(i + 1) != ('ू') && h.charAt(i + 1) != ('ृ') && h.charAt(i + 1) != ('ॅ') && h.charAt(i + 1) != ('े') && h.charAt(i + 1) != ('ै') && h.charAt(i + 1) != ('ो') && h.charAt(i + 1) != ('ौ') && h.charAt(i + 1) != ('्') && h.charAt(i + 1) != ('़'))
                )
            return 0;
        
            return 1;
    }

    public static void main(String args[]) throws UnsupportedEncodingException, FileNotFoundException {
        Scanner scan = new Scanner(System.in);
       // String h = scan.next();
        //String k = scan.next();
//        System.out.println(h);
        PrintWriter writer = new PrintWriter("output1.txt", "UTF-8");
        try{
            File f = new File("input1.txt");
            Scanner sc = new Scanner(f);

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] details = line.split("\\s+");
                String h =details[0];
                String k =details[1];
                String l =details[2];

        String e = "";
        String d = "";
        int i = 0 ;
        if ((h.charAt(1) != ('ा') && h.charAt(1) != ('ि') && h.charAt(1) != ('ी') && h.charAt(1) != ('ु') && h.charAt(1) != ('ू') && h.charAt(1) != ('ृ') && h.charAt(1) != ('ॅ') && h.charAt(1) != ('े') && h.charAt(1) != ('ै') && h.charAt(1) != ('ो') && h.charAt(1) != ('ौ') && h.charAt(1) != ('्') && h.charAt(1) != ('़'))
                )
        {
           // i = 1;
            switch (h.charAt(0)) {
                case 'क':
                    e = e + "ka";
                    break;

                case 'ख': e = e + "kha";
                    break;
                case 'ग':  e = e + "ga";
                    break;
                case 'घ':  e = e + "gha";
                    break;
                case 'च':  e = e + "cha";
                    break;
                case 'छ':  e = e + "chha";
                    break;
                case 'ज':  e = e + "ja";
                    break;
                case 'झ':  e = e + "jha";
                    break;
                case 'ट':  e = e + "ta";
                    break;
                case 'ठ':  e = e + "tha";
                    break;
                case 'ड':  e = e + "da";
                    break;
                case 'ढ':  e = e + "dha";
                    break;
                case 'ण':  e = e + "na";
                    break;
                case 'त':   e = e + "tta";
                    break;
                case 'थ':   e = e + "ttha";
                    break;
                case 'द':   e = e + "dda";
                    break;
                case 'ध':   e = e + "ddha";
                    break;
                case 'न':   e = e + "na";
                    break;
                case 'प':   e = e + "pa";
                    break;
                case 'ब':   e = e + "ba";
                    break;
                case 'फ':  e = e + "pha";
                    break;
                case 'भ':   e = e + "bha";
                    break;
                case 'म':   e = e + "ma";
                    break;
                case 'य':   e = e + "ya";
                    break;
                case 'र':   e = e + "ra";
                    break;
                case 'ल':  e = e + "la";
                    break;
                case 'व':  e = e + "va";
                    break;
                case 'ह':  e = e + "ha";
                    break;
                case 'स':  e = e + "sa";
                    break;
                case 'श':  e = e + "sha";
                    break;
                case 'ष':  e = e + "sha";
                    break;
                case 'अ': e = e + "a";
                    break;
                case 'आ': e = e + "aa";
                    break;
                case 'इ': e = e + "e";
                    break;
                case 'ई': e = e + "ee";
                    break;
                case 'उ': e = e + "u";
                    break;
                case 'ऊ': e = e + "uu";
                    break;
                case 'ए':  e = e + "e";
                    break;
                case 'ऐ': e = e + "ee";
                    break;
                case 'ओ': e = e + "o";
                    break;
                case 'औ': e = e + "au";
                    break;
                case '्':if(i+1 < h.length())
                {
                    if(h.charAt(i-1) == h.charAt(i+1)){
                        e = e + "";
                        i++;
                    }
                    else{
                        e = e + "";
                    }
                }

                    break;
                default: e = e + "0";
                    break;



            }

        }
        else
        {
            //i = 2;
            switch (h.charAt(0)) {
                case 'क':
                    e = e + "f";
                    break;

                case 'ख': e = e + "f";
                    break;
                case 'ग':  e = e + "g";
                    break;
                case 'घ':  e = e + "g";
                    break;
                case 'च':  e = e + "h";
                    break;
                case 'छ':  e = e + "h";
                    break;
                case 'ज':  e = e + "i";
                    break;
                case 'झ':  e = e + "i";
                    break;
                case 'ट':  e = e + "j";
                    break;
                case 'ठ':  e = e + "j";
                    break;
                case 'ड':  e = e + "k";
                    break;
                case 'ढ':  e = e + "k";
                    break;
                case 'ण':  e = e + "n";
                    break;
                case 'त':   e = e + "l";
                    break;
                case 'थ':   e = e + "l";
                    break;
                case 'द':   e = e + "m";
                    break;
                case 'ध':   e = e + "m";
                    break;
                case 'न':   e = e + "n";
                    break;
                case 'प':   e = e + "o";
                    break;
                case 'ब':   e = e + "p";
                    break;
                case 'फ':  e = e + "o";
                    break;
                case 'भ':   e = e + "p";
                    break;
                case 'म':   e = e + "q";
                    break;
                case 'य':   e = e + "r";
                    break;
                case 'र':   e = e + "s";
                    break;
                case 'ल':  e = e + "t";
                    break;
                case 'व':  e = e + "u";
                    break;
                case 'ह':  e = e + "v";
                    break;
                case 'स':  e = e + "w";
                    break;
                case 'श':  e = e + "w";
                    break;
                case 'ष':  e = e + "w";
                    break;

                case '्':if(i+1 < h.length())
                {
                    if(h.charAt(i-1) == h.charAt(i+1)){
                        e = e + "";
                        i++;
                    }
                    else{
                        e = e + "";
                    }
                }

                    break;
                default: e = e + "0";
                    break;



            }
        }
        for (i = 1; i < h.length()-1; i++) {
            char c = h.charAt(i);
            switch (c) {
                case 'क':
                        e = e + "f";
                    break;

                case 'ख': e = e + "f";
                    break;
                case 'ग':  e = e + "g";
                    break;
                case 'घ':  e = e + "g";
                    break;
                case 'च':  e = e + "h";
                    break;
                case 'छ':  e = e + "h";
                    break;
                case 'ज':  e = e + "i";
                    break;
                case 'झ':  e = e + "i";
                    break;
                case 'ट':  e = e + "j";
                    break;
                case 'ठ':  e = e + "j";
                    break;
                case 'ड':  e = e + "k";
                    break;
                case 'ढ':  e = e + "k";
                    break;
                case 'ण':  e = e + "n";
                    break;
                case 'त':   e = e + "l";
                    break;
                case 'थ':   e = e + "l";
                    break;
                case 'द':   e = e + "m";
                    break;
                case 'ध':   e = e + "m";
                    break;
                case 'न':   e = e + "n";
                    break;
                case 'प':   e = e + "o";
                    break;
                case 'ब':   e = e + "p";
                    break;
                case 'फ':  e = e + "o";
                    break;
                case 'भ':   e = e + "p";
                    break;
                case 'म':   e = e + "q";
                    break;
                case 'य':   e = e + "r";
                    break;
                case 'र':   e = e + "s";
                    break;
                case 'ल':  e = e + "t";
                    break;
                case 'व':  e = e + "u";
                    break;
                case 'ह':  e = e + "v";
                    break;
                case 'स':  e = e + "w";
                    break;
                case 'श':  e = e + "w";
                    break;
                case 'ष':  e = e + "w";
                    break;
                case 'ा': e = e + "a";
                    break;
                case 'ि': e = e + "b";
                    break;
                case 'ी': e = e + "b";
                    break;
                case 'ु': e = e + "c";
                    break;
                case 'ू': e = e + "c";
                    break;
                case 'ृ': e = e + "sb";
                    break;
                case 'े': e = e + "d";
                    break;
                case 'ै': e = e + "d";
                    break;
                case 'ो': e = e + "e";
                    break;
                case 'ौ': e = e + "e";
                    break;
                case '़': e = e + "q";
                    break;
                case 'ं': e = e + "n";
                    break;
                case '्':if(i+1 < h.length())
                {
                    if(h.charAt(i-1) == h.charAt(i+1)){
                        e = e + "";
                        i++;
                    }
                    else{
                        e = e + "";
                    }
                }

                    break;
                default: e = e + "0";
                    break;



            }

        }

///////////////////////////////////////////////////////////
        i = 0 ;
        if ((k.charAt(1) != ('ा') && k.charAt(1) != ('ि') && k.charAt(1) != ('ी') && k.charAt(1) != ('ु') && k.charAt(1) != ('ू') && k.charAt(1) != ('ृ') && k.charAt(1) != ('ॅ') && k.charAt(1) != ('े') && k.charAt(1) != ('ै') && k.charAt(1) != ('ो') && k.charAt(1) != ('ौ') && k.charAt(1) != ('्') && k.charAt(1) != ('़'))
                )
        {
            // i = 1;
            switch (k.charAt(0)) {
                case 'क':
                    d = d + "ka";
                    break;

                case 'ख': d = d + "kha";
                    break;
                case 'ग':  d = d + "ga";
                    break;
                case 'घ':  d = d + "gha";
                    break;
                case 'च':  d = d + "cha";
                    break;
                case 'छ':  d = d + "chha";
                    break;
                case 'ज':  d = d + "ja";
                    break;
                case 'झ':  d = d + "jha";
                    break;
                case 'ट':  d = d + "ta";
                    break;
                case 'ठ':  d = d + "tha";
                    break;
                case 'ड':  d = d + "da";
                    break;
                case 'ढ':  d = d + "dha";
                    break;
                case 'ण':  d = d + "na";
                    break;
                case 'त':   d = d + "tta";
                    break;
                case 'थ':   d = d + "ttha";
                    break;
                case 'द':   d = d + "dda";
                    break;
                case 'ध':   d = d + "ddha";
                    break;
                case 'न':   d = d + "na";
                    break;
                case 'प':   d = d + "pa";
                    break;
                case 'ब':   d = d + "ba";
                    break;
                case 'फ':  d = d + "pha";
                    break;
                case 'भ':   d = d + "bha";
                    break;
                case 'म':   d = d + "ma";
                    break;
                case 'य':   d = d + "ya";
                    break;
                case 'र':   d = d + "ra";
                    break;
                case 'ल':  d = d + "la";
                    break;
                case 'व':  d = d + "va";
                    break;
                case 'ह':  d = d + "ha";
                    break;
                case 'स':  d = d + "sa";
                    break;
                case 'श':  d = d + "sha";
                    break;
                case 'ष':  d = d + "sha";
                    break;
                case 'अ': d = d + "a";
                    break;
                case 'आ': d = d + "aa";
                    break;
                case 'इ': d = d + "e";
                    break;
                case 'ई': d = d + "ee";
                    break;
                case 'उ': d = d + "u";
                    break;
                case 'ऊ': d = d + "uu";
                    break;
                case 'ए':  d = d + "e";
                    break;
                case 'ऐ': d = d + "ee";
                    break;
                case 'ओ': d = d + "o";
                    break;
                case 'औ': d = d + "au";
                    break;
                case '्':if(i+1 < k.length())
                {
                    if(k.charAt(i-1) == k.charAt(i+1)){
                        d = d + "";
                        i++;
                    }
                    else {
                        d = d + "";
                    }
                }

                    break;
                default: d = d + "0";
                    break;



            }

        }
        else
        {
            //i = 2;
            switch (k.charAt(0)) {
                case 'क':
                    d = d + "f";
                    break;

                case 'ख': d = d + "f";
                    break;
                case 'ग':  d = d + "g";
                    break;
                case 'घ':  d = d + "g";
                    break;
                case 'च':  d = d + "h";
                    break;
                case 'छ':  d = d + "h";
                    break;
                case 'ज':  d = d + "i";
                    break;
                case 'झ':  d = d + "i";
                    break;
                case 'ट':  d = d + "j";
                    break;
                case 'ठ':  d = d + "j";
                    break;
                case 'ड':  d = d + "k";
                    break;
                case 'ढ':  d = d + "k";
                    break;
                case 'ण':  d = d + "n";
                    break;
                case 'त':   d = d + "l";
                    break;
                case 'थ':   d = d + "l";
                    break;
                case 'द':   d = d + "m";
                    break;
                case 'ध':   d = d + "m";
                    break;
                case 'न':   d = d + "n";
                    break;
                case 'प':   d = d + "o";
                    break;
                case 'ब':   d = d + "p";
                    break;
                case 'फ':  d = d + "o";
                    break;
                case 'भ':   d = d + "p";
                    break;
                case 'म':   d = d + "q";
                    break;
                case 'य':   d = d + "r";
                    break;
                case 'र':   d = d + "s";
                    break;
                case 'ल':  d = d + "t";
                    break;
                case 'व':  d = d + "u";
                    break;
                case 'ह':  d = d + "v";
                    break;
                case 'स':  d = d + "w";
                    break;
                case 'श':  d = d + "w";
                    break;
                case 'ष':  d = d + "w";
                    break;

                case '्':if(i+1 < k.length())
                {
                    if(k.charAt(i-1) == k.charAt(i+1)){
                        d = d + "";
                        i++;
                    }
                    else{
                        d = d + "";
                    }
                }

                    break;
                default: d = d + "0";
                    break;



            }
        }
        for (i = 1; i < k.length()-1; i++) {
            char c = k.charAt(i);
            switch (c) {
                case 'क':
                    d = d + "f";
                    break;

                case 'ख': d = d + "f";
                    break;
                case 'ग':  d = d + "g";
                    break;
                case 'घ':  d = d + "g";
                    break;
                case 'च':  d = d + "h";
                    break;
                case 'छ':  d = d + "h";
                    break;
                case 'ज':  d = d + "i";
                    break;
                case 'झ':  d = d + "i";
                    break;
                case 'ट':  d = d + "j";
                    break;
                case 'ठ':  d = d + "j";
                    break;
                case 'ड':  d = d + "k";
                    break;
                case 'ढ':  d = d + "k";
                    break;
                case 'ण':  d = d + "n";
                    break;
                case 'त':   d = d + "l";
                    break;
                case 'थ':   d = d + "l";
                    break;
                case 'द':   d = d + "m";
                    break;
                case 'ध':   d = d + "m";
                    break;
                case 'न':   d = d + "n";
                    break;
                case 'प':   d = d + "o";
                    break;
                case 'ब':   d = d + "p";
                    break;
                case 'फ':  d = d + "o";
                    break;
                case 'भ':   d = d + "p";
                    break;
                case 'म':   d = d + "q";
                    break;
                case 'य':   d = d + "r";
                    break;
                case 'र':   d = d + "s";
                    break;
                case 'ल':  d = d + "t";
                    break;
                case 'व':  d = d + "u";
                    break;
                case 'ह':  d = d + "v";
                    break;
                case 'स':  d = d + "w";
                    break;
                case 'श':  d = d + "w";
                    break;
                case 'ष':  d = d + "w";
                    break;
                case 'ा': d = d + "a";
                    break;
                case 'ि': d = d + "b";
                    break;
                case 'ी': d = d + "b";
                    break;
                case 'ु': d = d + "c";
                    break;
                case 'ू': d = d + "c";
                    break;
                case 'ृ': d = d + "sb";
                    break;
                case 'े': d = d + "d";
                    break;
                case 'ै': d = d + "d";
                    break;
                case 'ो': d = d + "e";
                    break;
                case 'ौ': d = d + "e";
                    break;
                case '़': d = d + "q";
                    break;
                case 'ं': d = d + "n";
                    break;
                case '्':if(i+1 < k.length())
                {
                    if(k.charAt(i-1) == k.charAt(i+1)){
                        d = d + "";
                        i++;
                    }
                    else{
                        d = d + "";
                    }
                }

                    break;
                default: d = d + "0";
                    break;



            }

        }

        
        
        if (e.equals(d)){
        	writer.println(h + "\t" + k + "\t" + "1");
        		
        }
        else{
        	writer.println(h + "\t" + k + "\t" + "0");
        }


            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        writer.close();
    }
}