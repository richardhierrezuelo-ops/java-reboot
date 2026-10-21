import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CustomCollectors {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "is", "fun", "and", "powerful");

        Collector<CharSequence, ?, String> joiningWithPipe = Collectors.collectingAndThen(
                Collectors.joining(" | "),
                s -> "[" + s + "]"
        );

        String result = words.stream()
                .collect(joiningWithPipe);

        System.out.println(result);
    }
}
