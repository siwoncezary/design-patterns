package template;
/**
 * <p>
 * Klasa z metodą szablonowa generująca raport składający się z elementów zwracanych przez metody abstrakcyjne.
 * Algorytm generowania jest stały, ale w klasach potomnych można definiować
 * metody wywoływane w szablonie, tym samym modyfikując postać raportu.
 * </p>
 * @return łańcuch z raportem
 */
abstract public class ReportTemplate {

    public String generate() {
        StringBuilder report = new StringBuilder();
        if (getHeader() != null) {
            report.append(getHeader()).append("\n");
        }
        if (getTitle() != null) {
            report.append(getTitle()).append("\n");
        }
        if (getContent() != null) {
            report.append(getContent()).append("\n");
        }
        if (getFooter() != null) {
            report.append(getFooter()).append("\n");
        }
        return report.toString();
    }

    public abstract String getHeader();

    public abstract String getTitle();

    public abstract String getContent();

    public abstract String getFooter();
}
