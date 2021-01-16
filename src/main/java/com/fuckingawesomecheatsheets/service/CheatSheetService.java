package com.fuckingawesomecheatsheets.service;

import com.fuckingawesomecheatsheets.model.CheatSheet;

import javax.inject.Singleton;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Singleton
public class CheatSheetService {

    public static final Random RANDOM = new Random();

    public Collection<CheatSheet> getAllCheatSheets() {
        return IntStream.range(0, RANDOM.nextInt(10)).mapToObj(i -> CheatSheet.builder()
                .code(getRandomString(10))
                .comment(getRandomString(10))
                .name(getRandomString(10))
                .tags(IntStream.range(0, 2).mapToObj(j -> getRandomString(10)).collect(Collectors.toCollection(HashSet::new)))
                .type(getRandomString(10)).build()).collect(Collectors.toSet());
    }

    private String getRandomString(int length) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'

        String generatedString = RANDOM.ints(leftLimit, rightLimit + 1)
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }
}
