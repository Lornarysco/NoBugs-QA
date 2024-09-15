//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!" + '\n');
        sum(1,1);
        diff(1,1);
        }

        public static void sum(int argA, int argB)
        {
            int sum = argA + argB;
            System.out.println(sum);
        }
        public static void diff(int argA, int argB)
        {
            int diff = argA - argB;
            System.out.println(diff);
        }
    }
