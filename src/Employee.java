

public class Employee {
    //variables
    private final String name;
    private final double salary;
    private final int workHours;
    private final int hireYear;

    //construct=kurucu metot
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    /*Maaşa uygulanan vergiyi hesaplayacaktır.
        - Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
        - Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar
        vergi uygulanacaktır.*/
    public double tax() {
        int vergi = 0;
        if (salary > 1000) {
            vergi = (int) (salary * 0.03);
        }
        return vergi;
    }


    /*
    Eğer çalışan haftada 40 saatten fazla çalışmış ise
    fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus
    ücretleri hesaplayacaktır.*/
    public int bonus() {
        int bonus = 0;
        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
        }
        return bonus;
    }

    /*: Çalışanın işe başlangıç yılına göre maaş artışını
hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
- Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam
yapılacaktır.
- Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına
%10 zam yapılacaktır.
- Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
-Not: raiseSalary() hesaplarken vergi ve bonusları dikkate almalısınız
*/
    public double raiseSalary() {
        int calismaYilToplam = (2021 - hireYear);
        double maasArtis = 0;
        double updtSalary = 0;
        updtSalary = salary + bonus() - tax();
        if (calismaYilToplam < 10) {
            maasArtis = updtSalary * 0.05;
        } else if (calismaYilToplam < 20) {
            maasArtis = (updtSalary * 0.10);
        } else
            maasArtis = (updtSalary * 0.15);
        return maasArtis;
    }
   //Çalışana ait bilgileri ekrana bastıracaktır.
    @Override
    public String toString() {
        return
                "Name                = " + name +
                        "\nSalary              = " + salary +
                        "\nWorkHours           = " + workHours +
                        "\nHireYear            = " + hireYear +
                        "\nTax                 = " + String.format("%.2f", tax()) +
                        "\nBonus               = " + bonus() +
                        "\nRaiseSalary         = " + String.format("%.2f", raiseSalary()) +
                        "\nVergi + bonus + maaş= " + String.format("%.2f", (salary - tax() + bonus())) +
                        "\nToplam Maaş         = " + String.format("%.2f", (salary - tax() + bonus() + raiseSalary()));
    }
}
