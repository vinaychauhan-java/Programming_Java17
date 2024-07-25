package com.vinay.prg1.textBlock;

/**
 * Text Blocks are used write multi-line strings. A Text Block is
 * started with three quotes followed by the line break and closed
 * by three quotes as shown below:-
 */
public class VinayPrg1 {
    public static void main(String[] args) {
        String multiLineText = """
                Java is a high-level, class-based, object-oriented programming
                language that is designed to have as few implementation
                dependencies as possible. Happy Learning :-)
                """;
        System.out.println("Result :: " + multiLineText);
    }
}
