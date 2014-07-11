package jfuzzer.util;

/**
 * Class:   fuzzj.util.PrintClassPath
 * @author: Donald Raikes <don.raikes@nyu.edu>
 * @version:    1.0
 * Date:    07/11/2014
 *
 * Description:
 *  Simply print the elements in the current classpath in order.
 *
 */
import java.net.URL;
import java.net.URLClassLoader;

public class PrintClassPath {

    public PrintClassPath() {
        super();
        System.out.println("Current Classpath:");

        ClassLoader cl = ClassLoader.getSystemClassLoader();

        URL[] urls = ((URLClassLoader) cl).getURLs();

        for (URL url : urls) {
            System.out.println("\t" + url.getFile());
        }

    }
}
