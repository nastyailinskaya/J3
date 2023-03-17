import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            int array_size = 0; 
            
    
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
            
               float [] array = new float[array_size];
            
            for(int i=0; i < array_size; i++){
                if(scanner.hasNextInt() || scanner.hasNextFloat()){
                     array[i] = scanner.nextFloat();
                }}
                System.out.println("Массив после обработки: ");
                    for (int i=0; i<array.length; i++){
                        float sum=0;

                    for(int j= 0; j< i+1; j++){
                        sum+= array[j];
            }
                    float sredarthm = sum/(i+1);
                    System.out.println(sredarthm+ " ");
        }
        scanner.close();
}
}
