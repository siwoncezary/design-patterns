package template;

abstract public class ReportTemplate {
    private final String header;
    private final String title;
    private final String content;
    private final String footer;

    protected ReportTemplate(String header, String title, String content, String footer) {
        this.header = header;
        this.title = title;
        this.content = content;
        this.footer = footer;
    }

    abstract String generate();

    public String getHeader() {
        return header;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getFooter() {
        return footer;
    }
}
