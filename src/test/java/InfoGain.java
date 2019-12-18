public class InfoGain {
    public static void main(String[] args){
        String sentence = "Java coding is fun and challenging";
        //swap first and last char of each word in sentence
        swap(sentence);
    }

    private static void swap(String sentence){
        String[] words = sentence.split(" ");
        int len;
        char first, last;
        char[] ch;

        for(String word: words){
            ch = word.toCharArray();

            len = ch.length;
            first = ch[0];
            last = ch[len-1];

           ch[len-1] = first;
            ch[0] = last;

           System.out.print(String.valueOf(ch)+ " ");
        }
    }
}
