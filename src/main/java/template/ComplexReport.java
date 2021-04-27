package template;

public class ComplexReport extends ReportTemplate{

    protected ComplexReport(String header, String title, String content, String footer) {
        super(header, title, content, footer);
    }

    @Override
    public String generate() {
        return getHeader() + "\n" + getTitle() +"\n" + getContent() +"\n"+ getFooter();
    }
}
