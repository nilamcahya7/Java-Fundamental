public class HelloWorld {
  public static void main(String[] args) {
    // int [][] anArray = {{1,2,3,4,5},{6,7,8}}; // array 2 dimensi[][]
    int [] anArray1 ={1,2,3,4,5,6,7,8,9,10}; // array 1 dimensi[]
    
    // for (int i = 0; i < anArray1.length; i++) {
    //   System.out.println(anArray1[i]);
    // }

    // System.out.println("result : " + main2(2,5));
    // System.out.println(anArray1[1]);
    // System.out.println(anArray[1][2]);

    int[]newArray = arrGanjil(anArray1);
    for (int num : newArray) {
        System.out.println(num);
    }

    System.out.println(LivingThing.breath());
    Human nilam = new Human(); //Human = class , nilam = Object , new Human(Constructor)
    nilam.display();
  }

  public static int main2(int valueDua, int valueTiga){
    return valueDua + valueTiga;
  }

  public static int[] arrGanjil(int[] array) {
    int[] ganjilArray = new int[array.length/2];
    int j = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] % 2 != 0) {
          ganjilArray[j++] = array[i];
        }
      }
    return ganjilArray;
  }
}

/**
 * InnerHelloWorld
 */
class Human {
  public void display(){
    System.out.println(LivingThing.breath());
  }
}

class LivingThing{
  public static String breath(){
    return "I am Breathing";
  }
}
