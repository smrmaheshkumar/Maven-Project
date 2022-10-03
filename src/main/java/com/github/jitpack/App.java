package com.github.jitpack;

/**
 * Hello Mahesh Kumar. Welcome to the new world Mahesh! Code Modified
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        System.out.println(new App().greet("world"));
    }

    public String greet(String name) {
        return "Hello " + name;
    }
}
