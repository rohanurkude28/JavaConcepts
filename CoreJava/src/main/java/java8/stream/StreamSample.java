package java8.stream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamSample {

    public static void main(String[] args) throws IOException {
        //Empty Stream
        Stream<String> streamEmpty = Stream.empty();

        //Stream of Collection
        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();

        //Stream of Array
        Stream<String> streamOfArray = Stream.of("a", "b", "c");

        //Stream Builder
        Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();

        //Stream Generate
        Stream<String> streamGenerate = Stream.generate(() -> "Generate").limit(10);

        //Stream Iterate
        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);

        //Stream of Primitives
        IntStream intStream = IntStream.range(1, 3);
        LongStream longStream = LongStream.rangeClosed(1, 3);

        //Stream of String
        IntStream streamOfChars = "abc".chars();
        Stream<String> streamOfString = Pattern.compile(", ").splitAsStream("a, b, c");

        //Stream of File
        Path path = Paths.get("JavaConcepts/CoreJava/src/main/resources/Sample.txt");
        Stream<String> streamOfStrings = Files.lines(path);
        Stream<String> streamWithCharset =
                Files.lines(path, Charset.forName("UTF-8"));
    }


    public Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }
}
