class String_Method {
    public static void main(String[] args) {
        String str = "GeekForGeeks";
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.substring(2, 8));
        System.out.println(str.substring(3));
        String s1 = "Geeks";
        String s2 = "Geeks";
       
       
        String s3 = new String("Geeks");
        // s3 =s1;
        if(s1==s3)
        System.out.println("Same");
        else
        System.out.println("Not same");

        String s4 = "GeeksForGeeks";
        System.out.println(s4.indexOf(s1,1));
        System.out.println(s1.equals(s2));


        //example of concat

        String name = "Ritul ";
        String fullName = name;
        // String fullName ="Ritul Jain";
        name = name + "Jain";
        System.out.println(name);
        System.out.println(fullName);

        //example of comparTo 

        String a = "Ritul Dosi";
        String b ="Ritul Dosi";
        int res = a.compareTo(b);
        if(res > 0) 
          System.out.println("a is greater than b");
        else if(res == 0)
          System.out.println("a is equal  to b");
        else
          System.out.println("a is less than b");


    }
}
