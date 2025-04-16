//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double account = 10; //начальный счет
        double replenishment = 1200; //сумма пополнения


        int gift;
        if (replenishment > 1000) { //если сумма пополнения больше
            gift = (int) (replenishment / 100); // сумму пополнения делим на 100 (за каждые 100 рублей)
        } else {
            gift = 0; //если не выполняется условие, то бонусов нет
        }
        int finalAccount = (int) (account + replenishment + gift); //итоговая сумма вместе с бонусами
        System.out.println(gift);
        System.out.println(finalAccount);
    }
}
