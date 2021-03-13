package io.spring.demo;

import org.springframework.stereotype.Service;

@Service
public class TextService {

    public String handle(String message) {
        int length = message.length();
        int i = 0;
        StringBuilder builder = new StringBuilder();

        while (i < length) {
            // Add character
            builder.append(message.charAt(i));

            // If multiple characters are the same, add a count
            if (i < length - 1 && message.charAt(i) == message.charAt(i + 1)) {
                int count = 1;
                int j = i + 1;

                while (j < length && message.charAt(i) == message.charAt(j)) {
                    count++;
                    j++;
                }

                builder.append(count);
                i = j - 1;
            }

            i++;
        }

        return builder.toString();
    }
}
