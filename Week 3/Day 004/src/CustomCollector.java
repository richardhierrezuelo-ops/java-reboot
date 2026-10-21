import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CustomCollector {
    public static void main(String[] args) {

        String sentence = "java is fun and java is powerful and java is awesome";

        Collector<CharSequence, ?, String> joiningWithPipe = Collectors.collectingAndThen(
                Collectors.joining(", "),
                s -> "[" + s + "]"
        );


        String result = Arrays.stream(sentence.split(" "))
                .collect(joiningWithPipe);

        System.out.println(result);

    }
}
