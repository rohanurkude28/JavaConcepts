package exceptions;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;


public class LambdaException {

    public void crawlWithCustomHandler(List<String> urlsToCrawl) {
        urlsToCrawl.stream()
                .map(urlToCrawl -> {
                    try {
                        return new URL(urlToCrawl);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    return null;
                }).forEach(url -> {
                    //save(url);
                    try {
                        throw new IOException("Haha");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }});
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
        integers.forEach(i -> {
            try {
                System.out.println(50 / i);
            } catch (ArithmeticException e) {
                System.err.println(
                        "Arithmetic Exception occured : " + e.getMessage());
            }
        });


    }

    public void crawl(List<String> urlsToCrawl) {
        urlsToCrawl.stream()
                .map(ThrowingFunction.unchecked(urlToCrawl -> new URL(urlToCrawl)))
                .forEach(ThrowingConsumer.unchecked(url -> save(url)));
    }

    private void save(URL url) throws IOException {
        int id = new Random().nextInt();
        InputStream inputStream = url.openConnection().getInputStream();
        Files.copy(inputStream, Paths.get(id + ".txt"), StandardCopyOption.REPLACE_EXISTING);
    }


    @FunctionalInterface
    interface ThrowingFunction<T, R, E extends Throwable> {
        R apply(T t) throws E;

        static <T, R, E extends Throwable> Function<T, R> unchecked(ThrowingFunction<T, R, E> f) {
            return t -> {
                try {
                    return f.apply(t);
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            };
        }
    }
}
