public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

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

    public static boolean contains(String str1, String str2) {
        boolean contains= false;
        str1= lowerCase(str1);
        str2=lowerCase(str2);

        if (str2.length() == 0) {
            return true;
        }

        if (str1.length() < str2.length()) {
            return false;
        }


        if(str1.length()==0 || str2.length()==0){
            contains= false;
        }else{
        for(int i=0;i<=str1.length()- str2.length();i++){
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


    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
       for(int i=0; i<sentences.length; i++){
        String str1= lowerCase(sentences[i]);
        for (int t=0; t< keywords.length;t++){
            String str2=lowerCase(keywords[t]);
            if(contains(str1, str2)==true){
                System.out.println(sentences[i]);
                break;
            
            }
            }
            }

        }
       }
    
    

