package com.keenjackdaw.keen;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class BaseApplication implements Application {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void start() {
        String userInput = null;

        while (scanner.hasNext()) {
            userInput = scanner.next();
            System.out.println(userInput);

            if (StringUtils.equals(userInput, "exit")) {
                stop();
            }
        }
    }

    @Override
    public void stop() {
        scanner.close();
        System.exit(0);
    }
}
