class StringBuilder_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Geeks");
        StringBuffer sb1 = sb;
        sb = sb.append("ForGeeks");
        System.out.println(sb);
        System.out.println(sb1);
        System.out.println();
        //String Buffer is an mutable string which is also thread safe .
        //Multithreading in StringBuffer.

        //String Builder is an mutable string which is not thread safe you can work in single threaded environment.
        //Singlethreading in StringBuilder.


        StringBuilder s = new StringBuilder("Geeks");
        StringBuilder s1 = s;
        s = s.append("ForGeeks");
        System.out.println(s);
        System.out.println(s1);
    }
}
