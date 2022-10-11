public class Main {
    public static void main(String[] args) {

       /* Sizden konsol çıktısı halinde
        Adı,
        maaşı,
        çalışma saati,
        başlangıç yılı,
        vergi,
        bonus,
        maaş artışı,
        vergi ve
        bonuslarla birlikte maaş,
        toplam maaş
        değerlerini konsola yazdırmanızı
        bekliyoruz.*/

        //Bir müsteri ekle
        Employee employee1 = new Employee("Mehmet Akşam", 1100, 45, 2000);
        String s=employee1.toString();
        System.out.println(s);


    }
}