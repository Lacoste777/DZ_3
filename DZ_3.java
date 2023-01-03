import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
public class DZ_3 {

    public static void main(String[] args) {
        DZ_3 homework = new DZ_3();
        int size = ThreadLocalRandom.current().nextInt(10, 30);
        int minVal = 1;
        int maxVal = 100;     
        List <Integer> newList = homework.createList(size, minVal, maxVal);
        System.out.println("Генерируем список: " + newList);
        newList = homework.removeNegativeValue(newList);
        System.out.println("Удаляем четные числа: " + newList);
        System.out.println("Максимальное значение : " + homework.getMax(newList));
        System.out.println("Минимальное значение: " + homework.getMin(newList));
        System.out.println("Среднее значение: " + homework.getAverage(newList));
    }

    public List<Integer> removeNegativeValue(List<Integer> list){
           
        return list.stream().filter(item -> item % 2 != 0).toList();
    }

    public Integer getMin(List<Integer> list){
        return Collections.min(list);
         
    }

    public Integer getMax(List<Integer> list){
        return Collections.max(list);
    }

    public Integer getAverage(List<Integer> list){
        int sumElements = 0;
        int count = 0;
        for (int item : list){
            sumElements += item;
            count++;
        }
        if (count == 0)
            return 0;    
        return sumElements / count;
    }

    public List<Integer> createList(int size, int minVal, int maxVal){
        List <Integer> newList = new ArrayList<Integer>();      
        for (int i = 0; i < size; i++) 
            newList.add(ThreadLocalRandom.current().nextInt(minVal, maxVal));
        
        return newList;
    }
}



