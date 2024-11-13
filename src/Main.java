//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int intialBalance = 100;
        int addend = 999;
        int bonus;

        if (addend >= 1000) {
            bonus = addend / 100;
            int amount1;
            amount1 = (intialBalance + addend + bonus);
            System.out.println("Бонус равен:" + bonus + ", Итоговая сумма:" + amount1);
        } else {
            int amount2;
            amount2 = (intialBalance + addend);
            System.out.println("Бонусов нет, итоговая сумма:" + amount2);

        }
    }
}
