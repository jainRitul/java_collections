class StringBuffer_StringBuilder_method {
    public static void main(String[] args) {
        /*
        Common methods of string,stringBuffer,strignBuilder : length,indexOf,lastIndexOf,Concat,compareTo,subString,chars.
        Methods present in only stringBuffer and StrignBuilder : reverse,setCharAt,delete,deleteCharAt,insert,capactiy,append,replace.
         */

        //code
        
        StringBuilder sb = new StringBuilder("Ritul Jain");
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        sb.insert(0, "Engineer ");
        System.out.println(sb);
        sb.deleteCharAt(0);
        sb.delete(0, 8);
        System.out.println(sb);
        // sb.setCharAt(7, 'D');
        // System.out.println(sb);

      
    }
}
