package template;

public class SimpleReport extends ReportTemplate{

    public SimpleReport(String header, String title, String content, String footer) {
        super(header, title, content, footer);
    }

    @Override
    public String generate() {
        return getTitle() +"\n" + getContent();
    }
}
