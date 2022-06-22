package test;

import java.util.ArrayList;
import java.util.List;

public class TestStarter {
    public static void main (String... args) {
        List<Test> tests = new ArrayList<>();

        tests.add(new UI("UI test"));
        tests.add(new API("API test"));

        tests.stream().filter(test -> test.getType().equals("UI")).forEach(test -> test.execute());

        tests.stream().forEach(test -> test.execute());
    }
}
