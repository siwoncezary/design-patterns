package template;

public class ComplexReport implements ReportTemplate{
    private String title;
    private String content;

    public ComplexReport(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String generate() {
        return "header" + "\n" + title +"\n" + content +"\n footer";
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
