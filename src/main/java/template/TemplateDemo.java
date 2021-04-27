package template;

public class TemplateDemo {
    public static void main(String[] args) {
        ReportTemplate report = new SimpleReport("AAAA","BBB", null ,null);
        System.out.println(report.generate());
        report = new ComplexReport("COMPLEX","CONTENT", "CONTENT", "FOOTER");
        System.out.println(report.generate());
    }
}
