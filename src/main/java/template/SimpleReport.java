package template;

public class SimpleReport implements ReportTemplate{
    private final String title;
    private final String content;

    public SimpleReport(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String generate() {
        return title +"\n" + content;
    }

    @Override
    public String header() {
        return null;
    }

    @Override
    public String title() {
        return null;
    }

    @Override
    public String content() {
        return null;
    }

    @Override
    public String footer() {
        return null;
    }
}
