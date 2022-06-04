package practical3;
public class practical3f {
    public static void main(String[] args) {
        String test = "GEC PATAN",rev="";
        char c;
        for(int i=0;i<test.length();i++){
            c=test.charAt(i);
            rev=c+rev;
        }    
        StringBuffer s = new StringBuffer("GEC PATAN");
        System.out.println("The Reverse string: "+rev);
        System.out.println("The Reverse string: "+s.reverse());    // USING STRINGBUFFER CLASS!!
        String rep = test.replace("EC", "OV");
        System.out.println("The Replaced string: "+rep);
        System.out.println("Dose Original string contains PAT? ");
        System.out.println(test.contains("PAT"));
        System.out.println("Dose Original string contains PAT? ");
        System.out.println(test.contains("UNI"));
    }
        
    }
