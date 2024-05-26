package UT5;
// Create an array that stores 4 integer numbers.
// Show on screen the value of each element.
// Show on screen the number of elements that the Array have.
public class Challenge5_2 {

  public static void main(String[] args) {
    int numbers[] = new int[7];
    numbers[0] = 3;
    numbers[1] = 13;
    numbers[2] = 32;
    numbers[3] = 44;
    numbers[4] = 45;
    numbers[5] = 32;
    numbers[6] = 55;
    mostrar2(numbers);

  }

  public static void mostrar(int numbers[]) {
    for (int index = 0; index < numbers.length; index++) {
      System.out.println(numbers[index]);
    }
  }

  public static void mostrar2(int numbers[]){
    for (int i : numbers) {
      System.out.println(i);
    }
  }

}
    


