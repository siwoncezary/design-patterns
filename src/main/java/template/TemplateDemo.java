package template;

public class TemplateDemo {
    public static void main(String[] args) {
        ReportTemplate report = new SimpleReport("SIMPLE TITLE","SIMPLE CONTENT");
        System.out.println("Template from SimpleReport");
        System.out.println(report.generate());
        report = new ComplexReport("COMPLEX HEADER","COMPLEX TITLE", "COMPLEX CONTENT", "COMPLEX FOOTER");
        System.out.println("Template from ComplexReport");
        System.out.println(report.generate());

        CookDish cookPizza = new CookPizza();
        cookPizza.cook();
    }
}
