package br.com.erudio.MODEL;

public class Greeting {


    private static long id;
    private static String content;

        public  Greeting(Long id, String content){
            Greeting.id = id;
            Greeting.content = content;
        }

        public static long getId() {
            return id;
    }
        public static String getContent() {
            return content;
    }


}
