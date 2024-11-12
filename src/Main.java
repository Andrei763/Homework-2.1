//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int intialBalance = 100;
        int addend = 1200;
        int bonus = 0;

        if (addend > 1000) {
            bonus = addend / 100;
            int Finalbalance = intialBalance + addend + bonus;
            System.out.println("Бонус:" + bonus);
            System.out.println("Итоговый баланс:" + Finalbalance);
        }
    }
}