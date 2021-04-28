package template;

/**
 * <p>
 *     Klasa pochodna ReportTemplate, która wykorzystuje wszytkie
 * </p>
 */
public class ComplexReport extends ReportTemplate{
    private final String header;
    private final String title;
    private final String content;
    private final String footer;

    public ComplexReport(String header, String title, String content, String footer) {
        this.header = header;
        this.title = title;
        this.content = content;
        this.footer = footer;
    }

    @Override
    public String getHeader() {
        return header;
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
        return footer;
    }
}
