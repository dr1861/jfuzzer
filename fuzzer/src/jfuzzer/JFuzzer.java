package jfuzzer;
/**
 * Class:   JFuzzer
 * @author  Donald Raikes <don.raikes@nyu.edu>
 * @version 1.0
 *
 * <p>This class is the main driver for the JFuzzer java class fuzzer.
 * It is the entry point to the application, and parses all command-line arguments and
 * orchestrates execution of the fuzzer utilities which are parts of this project/application.</p>
 */

import jfuzzer.util.*;

import jfuzzer.util.PackageEnumerator;
import jfuzzer.util.PrintClassPath;

public class JFuzzer {
    public static void main(String[] args) {
        PrintClassPath pcp = new PrintClassPath();
        PackageEnumerator packageenumerator = new PackageEnumerator();

    }
}
