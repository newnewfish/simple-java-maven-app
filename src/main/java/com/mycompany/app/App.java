package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";
    private final Integer count = 100;

    public App() {}

    public static void main(String[] args) {
    	App app = new App();
        System.out.println(app.getMessage());

	    System.out.println(app.getCount());
    }

    private final String getMessage() {
        return message;
    }

    private final Integer getCount() {
    	return count;
    }



}
