class Pattern_Searching {
    public static void main(String[] args) {
        String num = "2.64";
        String txt = "GeeksForGeeks";
        String pat = "Geeks";
        
        patternSearchForDecimal(num);
        pattern(txt,pat);
    }
    public static void pattern(String txt,String pat){
       
        int pos = txt.indexOf(pat);

        if(pos<0)System.out.println("Pattern not found");

        while (pos>=0) {
          System.out.print(pos+" ");
          pos = txt.indexOf(pat,pos+1);
        }
    }
    public static void patternSearchForDecimal(String num){
        int pos = num.indexOf(".");

        if(pos<0)
        System.out.println("String is not a floating number");

        if(pos>=0){
          System.out.println("After decimal:" + num.substring(pos+1));
        }

    }
}
