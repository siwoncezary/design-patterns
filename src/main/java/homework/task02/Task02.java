package homework.task02;

import java.io.File;

/**
 * <h2>Zadanie 2A</h2>
 * <p>
 * Zdefiniuj klasę abstrakcyjną <code>EmailTemplate</code> z metoda szablonową, która generuje do łańcucha opis obiektu EmailMessage w postaci:
 * </p>
 * <pre>
 *     <i>pole from</i>
 *     <i>pole to</i>
 *     <i>pole dw</i>
 *     <i>pole udw</i>
 *     <i>pole subject</i>
 *     <i>pole content</i>
 *     <i>nazwa pliku z pola AttachedFile</i>
 * </pre>
 * <p>
 * Jeśli jakiegoś pola w obiekcie EmailMessage brak to algorytm powinien pomijać to pole podczas generowania
 * </p>
 * <p>
 * Zdefiniuj klasę <code>EmailReport<code/>implementującą klasę z metodą szablonową <code>EmailTemplate</code>,
 * która generuje obiekt EmailMessage w taki sposób, aby:
 *     <ol>
 *         <li>
 *             przed każdym polem występuje prefiks w postaci nazwy pola np. from: <i>pole from</i>
 *         </li>
 *         <li>
 *             pole <code>content</code> musi być oddzielone od góry i od dołu dodatkowymi wierszami ze znakami '*******'
 *         </li>
 *     </ol>
 * </p>
 * <h3>Przykład</h3>
 * <p>Dla przykładowego obiektu:</p>
 * <code>
 * <pre>
 *  EmailMessage.builder()
 *                 .to("ala@op.pl")
 *                 .from("karol@sda.pl")
 *                 .subject("question")
 *                 .content("How are you?")
 *                 .build();
 *                 </pre>
 *                 </code>
 * <p>zdefiniowana klasa powinna wygenerować poniższy łańcuch:</p>
 * <pre>
 * from: ala@op.pl
 * to: karol@sda.pl
 * subject: question
 * content:
 * **************************
 * How are you?
 * **************************
 * </pre>
 */
public class Task02 {
    public static void main(String[] args) {
//        EmailMessage message = EmailMessage.builder()
//                .to("ala@op.pl")
//                .from("karol@sda.pl")
//                .subject("question")
//                .content("How are you?")
//                .dw("ewa@ss.pl")
//                .udw("manager@ss.pl")
//                .attachedFile(new File("c:\\data\\file.txt"))
//                .build();
//        System.out.println(message);
    }
}
