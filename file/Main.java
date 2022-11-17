package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.nio.file.Path;
import java.nio.file.Paths;

import static java.lang.System.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        var nn = new File("");
        var nnn = nn.getCanonicalPath();
        var bb = Paths.get(getProperty("user.dir"), "file/src/tetx.txt").toString();
        var path = "file/src/bbbb.txt";

        out.println(nnn);

        try (var in = new Scanner(System.in)) {
            var str = in.nextLine();
            out.println(str);
        }

        fun(path);
        fun(bb);
    }

    public static void fun(String path) throws IOException {

        final var file = new File(path);
        var input = new InputStreamReader(new FileInputStream(file), "UTF-8");
        long num = file.length();
        char[] inm = new char[(int) num];
        int len = 0;

        if ((len = input.read(inm)) != -1)
            System.out.println(new String(inm, 0, len));

        input.close();

    }

}
