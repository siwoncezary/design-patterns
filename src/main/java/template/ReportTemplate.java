package template;

public interface ReportTemplate {
    String generate();

    String header();
    String title();
    String content();
    String footer();
}
