package com.keenjackdaw.keen;

import java.util.Scanner;

public class BaseApplication implements Application {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void start() {
        String userInput = null;

        while (scanner.hasNext()) {
            userInput = scanner.next();
            System.out.println(userInput);
        }
    }

    @Override
    public void stop() {
        scanner.close();
    }
}
