package z35;

public class Decoding_caesar {
    public String caesar(String stroka, int step) {
        StringBuilder text = new StringBuilder(stroka.length());
        char lstChar = 'я';
        char frstChar = 'а';
        char let;
        int countlettersAlfabet = (lstChar - frstChar) + 1;
        for (int i = 0; i < stroka.length(); i++) {
            let = stroka.charAt(i);
            if(Character.isLetter(stroka.charAt(i))) {
                let += step % countlettersAlfabet;
                if (let > lstChar){
                    let = (char)(let % lstChar + frstChar - 1);
                }
                if (let < frstChar){
                    let = (char)(let + countlettersAlfabet);
                }
            }
            text.append(let);
        }
        return text.toString();
    }




}

