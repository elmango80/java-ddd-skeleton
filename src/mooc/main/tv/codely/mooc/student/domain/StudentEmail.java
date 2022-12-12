package tv.codely.mooc.student.domain;

import tv.codely.shared.domain.StringValueObject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Objects;

public class StudentEmail extends StringValueObject {
    public StudentEmail(String value) {
        super(value);

        validation(value);
    }

    private static void validation(String value) {
        final String regex = "^(?!\\.)[\\w-_.]*[^.]@\\w+\\.\\w+(\\.\\w+)?[^.\\W]$";
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(value);

        if (!matcher.find()) {
            throw new IllegalArgumentException("The email is not valid");
        }
    }
}
