public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("baba yaga", "baba")); // true
        System.out.println(contains("baba yaga", "")); // false
        System.out.println(contains("baba yaga", "John Wick is the baba yaga")); // false
        System.out.println(contains("baba yaga", "Yaga")); // true
        System.out.println(contains("baba yaga", "babayaga")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true

        //boolean test1 = MyString.contains("baba yaga", "baba");
        //boolean test2 = MyString.contains("baba yaga", "");
       // boolean test3 = !MyString.contains("baba yaga", "John Wick is the baba yaga");
       // boolean test4 = !MyString.contains("baba yaga", "Yaga");
       // boolean test5 = !MyString.contains("baba yaga", "babayaga");
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>64 && str.charAt(i)<91){
                ans=ans + (char)(str.charAt(i)+32);
            } else{
                ans=ans+ str.charAt(i);
            }
        }

        
        return ans;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        boolean contains= false;
        str1= lowerCase(str1);
        str2=lowerCase(str2);
        if(str1.length()==0 || str2.length()==0){
            contains= false;
        }else{
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)==str2.charAt(0)){
                contains=true;
                for(int j=1;j<str2.length();j++){
                 if(str1.charAt(i+j)==str2.charAt(j)){
                    contains=true;
                 }else{
                    contains=false;
                    break;
                 }
                }
                if(contains==true){
                    break;
                } 
            }
               
            }
        
        }
        return contains;
    }

    
}
