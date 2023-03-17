import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int array_size = 0, array[];

        System.out.println("Введите размерность массива: ");
        if(scanner.hasNextInt()){
            array_size = scanner.nextInt();
        }else{
            System.out.println("Размерность массива должна быть задана целым числом, попробуйте еще раз:");
            System.exit(0);
        }
        if (array_size <=0){
            System.out.println("Размерность массива должна быть больше нуля, попробуйте еще раз");
            System.exit(0);
        }
            array = new int[array_size];
        
        for(int i=0; i < array_size; i++){
            if(scanner.hasNextInt()){
                array[i] = scanner.nextInt();
            }else{
                System.out.println("Массив должен состоять из целых чисел, попробуйте еще раз");
                System.exit(0);
            }}
            System.out.println("Введите целое число, которое необходимо удалить из массива: ");
            if(scanner.hasNextInt()){
                    int x = in.nextInt();
                    System.out.println("Исходный массив: ");
                    for (int elem : array){
                        System.out.println(elem + " ");
                    }
                    System.out.println();
                    System.out.println("Масcив после обработки: ");
                    System.out.println();
                    for (int i = 0; i < array_size; i++){
                        if (array[i] == x){
                            continue;
                        }else{
                            System.out.println(array[i] + " ");
                        }
                     }}else{
                            System.out.println("Число, которое необходимо удалить из массива должно быть целым, попробуйте еще раз");
                            System.exit(0);
                        }
        scanner.close();
    }
}