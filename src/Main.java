import Chapters.ChapterTwoTasksMethods;

public class Main {

    public static void main(String[] args) {
       /* ChatperOneTasksMethods.returnUpperText().ifPresent(WindowUtils::showText);                            // Zad 1.1
        ChatperOneTasksMethods.factorial().ifPresent(WindowUtils::showText);                                  // Zad 1.2
        ChatperOneTasksMethods.sumOddNumbers().ifPresent(WindowUtils::showText);                              // Zad 1.3
        ChatperOneTasksMethods.binaryRepresentation().ifPresent(WindowUtils::showText);                       // Zad 1.4
        ChatperOneTasksMethods.octalRepresentationOfDecimalValue().ifPresent(WindowUtils::showText);          // zad 1.4
        ChatperOneTasksMethods.hexaDecimalRepresentationOfDecimalValue().ifPresent(WindowUtils::showText);    // zad 1.4*/

        ChapterTwoTasksMethods.Rational sprawdzmy = new ChapterTwoTasksMethods.Rational(7,28);
        sprawdzmy.simplify();
        System.out.println(sprawdzmy.toString());

    }
}