import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DNK dnk1 = new DNK();
        Scanner scanner1 = new Scanner(System.in);
        do{
            dnk1.error=0;
            System.out.print("Введите ДНК :");
            String nameDNK = scanner1.nextLine();
            dnk1.setName(nameDNK);
            dnk1.test_dnk();
            if(dnk1.error!=0){
                System.out.println("Вы ввели не верное ДНК\n Используйте СИМВОЛЫ G C A T");
            }
        }while (dnk1.error !=0);
        dnk1.DNK_v_RNK();
    }
}