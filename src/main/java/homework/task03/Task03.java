package homework.task03;

/**
 * <h2>Task 3</h2>
 * <p>
 *     Zdefiniuj dekoratory dla obiektów interfejsu Message:
 * </p>
 * <ol>
 *     <li>
 *         <code>FramedMessage</code> - Zwraca tekst obiektu z dodaną ramką np. dla obiektu z content "ABCD" zwróci:
 *         <pre>
 *         "******\n
 *          *ABCD*\n
 *          ******"
 *          </pre>
 *     </li>
 *     <li>
 *         <code>WithLengthMessage</code> - Zwraca tekst obiektu z poprzedzoną liczbą znaków np. dla content "ABCD" zwróci:
 *         "4 ABCD"
 *     </li>
 *     <li>
 *         <code>HtmlTaggedMessage</code> - Zwraca tekst obiektu otoczony tagiem HTML podanym w konstruktorze  np. dla content "ABCD" zwróci:
 *         "<p>ABCD</p>"
 *     </li>
 * </ol>
 * <h3>TEST</h3>
 * <p>
 *     Usuń komentarze i uruchom program. Komunikat SUCCESS oznacza poprawne zdefiniowanie dekoratorów.
 * </p>
 */
public class Task03 {
    public static void main(String[] args) {
//        Message message = () -> "Hello World!";
//        FramedMessage framedMessage = new FramedMessage(new WithLengthMessage(new HtmlTaggedMessage(message, "H1")));
//        if (framedMessage.content().equals("**************************\n" +
//                "*21 <H1>Hello World!</H1>*\n" +
//                "**************************")) {
//            System.out.println("SUCCESS");
//        } else {
//            System.out.println("FAILED");
//        }
    }
}
