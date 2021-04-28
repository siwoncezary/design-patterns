package template;

/**
 * Klasa pochodna TemplateReport z metodą szablonową.
 * Klasa służy do tworzenia prostych raportów składających się z tytułu i zawartości,
 * dlatego metody getHeader i getFotter nie zostaly zaimplementowane (zwracają null)
 */
public class SimpleReport extends ReportTemplate{
    private final String title;
    private final String content;

    public SimpleReport(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String generate() {
        return getTitle() +"\n" + getContent();
    }

    @Override
    public String getHeader() {
        return null;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public String getFooter() {
        return null;
    }
}
