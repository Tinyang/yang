package study.syntax;

public class Test {

    public static String setSubject(String subject) {
        String truncatedStr = subject.trim().substring(0, Math.min(255, subject.length()));
        if(null != subject){
            subject = subject.trim();
            int maxEndIndex = 255;
            if(subject.getBytes().length > maxEndIndex){
                int endIndex = Math.min(maxEndIndex, subject.length());
                subject = subject.substring(0, endIndex);
                while(subject.getBytes().length > maxEndIndex){
                    endIndex--;
                    subject = subject.substring(0,endIndex);
                }
            }
        }
        return subject;
    }

    public static void main(String[] args) {
        String s = "es, 1 byte does encode a character (inc spaces etc) from the ASCII set. However in data units assigned to character encoding it can and often requires in practice up to 4 bytes. This is because English is not the only character set. And even in English documents other languages and characters are often represented. The numbers of these are very many and there are very many other encoding sets, which you may have heard of e.g. BIG-5, UTF-8, UTF-32. Most computers now allow for these uses and ensure the least amount of garbled text (which usually means a missing encoding set.) 4 bytes is enough to cover these possible encodings. I byte per character does not allow for this and in use it is larger often 4 bytes per possible character for all e";
        setSubject(s);
    }

}
