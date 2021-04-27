package template;

public class TemplateDemo {
    public static void main(String[] args) {
        ReportTemplate report = new SimpleReport("AAAA","BBB");
        System.out.println(report.generate());
        report = new ComplexReport("COMPLEX","CONTENT");
        System.out.println(report.generate());
    }
}
