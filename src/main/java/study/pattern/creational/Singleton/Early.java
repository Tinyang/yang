package study.pattern.creational.Singleton;

public class Early {

    private static Early early = new Early();

    private Early(){

    };

    public static Early getEarly(){
        return early;
    }
}
