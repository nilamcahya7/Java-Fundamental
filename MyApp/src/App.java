public class App {
    
    public void first(String[] args) {
        int angka = 96;
        float ipk = 3.5f;
        boolean isActive = false;
        final float phi = 3.14f;
        String name2 = "dev";
        int x = 7;
        int y = 3;
        int angka3=5;
        // float durasiPendidikan = 4;

        if(!isActive){
            System.out.println("Tidak Aktif");
        } else{
            System.out.println("Aktif");
        }

        if(ipk>3.9){
            System.out.println("Mendapatkan beasiswa 100%");
        }else if(ipk>3.5){
            System.out.println("Mendapatkan beasiswa 80%");
        }else{
            System.out.println("Tidak mendapatkan beasiswa");
        }
        // while-do
        int counter=1;
        while(counter<10){
            System.out.println("counter: " +counter);
            counter++;
        }

        //do-while
        counter=1;
        do{
            System.out.println("counter: " + counter);
            counter++;
        }while(counter<10);

        //for loop
        for (int i=1; i<10; i++){
            System.out.println("counter: "+ i);
        }

        //enhanced for loop
        int [] listAngka={5,2,9,12,4};
        for (int i:listAngka){
            System.out.println(i);
        }

        
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
        System.out.println("Belajar Java");
        System.out.println(angka);
        System.out.println(ipk);
        System.out.println(isActive);
        System.out.println(phi);
        System.out.println(name2);
        System.out.println(x+=2);
        System.out.println(x-=2);
        System.out.println(x*=2);
        System.out.println(x/=2);
        System.out.println(x%=2);
        System.out.println("--------");
        System.out.println("hasil post increment: " + angka3++);
        System.out.println("hasil pre increment: " + ++angka3);
        System.out.println("hasil post decrement: " + angka3--);
        System.out.println("hasil pre decrement: " + --angka3);
        System.out.println(x==y);
        System.out.println(x!=y);
        System.out.println(x<y);
        System.out.println(x<=y);
        System.out.println(x>y);
        System.out.println(x>=y);
    }

    public void arrayDemo(String[] args) {
        int [] anArray;

        anArray = new int[10];

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 0: " + anArray[1]);
        System.out.println("Element at index 0: " + anArray[2]);
        System.out.println("Element at index 0: " + anArray[3]);
        System.out.println("Element at index 0: " + anArray[4]);
        System.out.println("Element at index 0: " + anArray[5]);
        System.out.println("Element at index 0: " + anArray[6]);
        System.out.println("Element at index 0: " + anArray[7]);
        System.out.println("Element at index 0: " + anArray[8]);
        System.out.println("Element at index 0: " + anArray[9]);
    }

    public void simpleArr(String[] args){
        int [] anArray = {
            100, 200, 300, 400, 500, 600, 700, 800, 900, 1000
        };
        System.out.println(anArray);
    }

    public void arrOfName(String[] args){
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        System.out.println(names[0][0] + names[1][0]);
        System.out.println(names[0][2] + names[1][1]);
    }

    public void comparison(String[] args){
        int value1 = 1;
        int value2 = 2;

        if((value1==1) && (value2==2))
            System.out.println("value1 is 1 AND values2 is 2");
        if((value1==1) || (value2==1))
            System.out.println("value1 is 1 OR value2 is 1");

        int x = 7;
        int y = 3;

        boolean myCondition = x==y && true;
        System.out.println(myCondition);

        myCondition = x==y && false;
        System.out.println(myCondition);

        myCondition = !(x==y);
        System.out.println(myCondition);
    }

    public void monthCase(String[] args){
        int month = 8;
        String monthString;
        switch (month) {
            case 1: monthString = "january";
                break;
            case 2: monthString = "february";
                break;
            case 3: monthString = "march";
                break;
            case 4: monthString = "april";
                break;
            case 5: monthString = "may";
                break;
            case 6: monthString = "june";
                break;
            case 7: monthString = "july";
                break;
            case 8: monthString = "august";
                break;
            case 9: monthString = "september";
                break;
            case 10: monthString = "october";
                break;
            case 11: monthString = "november";
                break;
            case 12: monthString = "december";
                break;
            default: monthString= "invalid month";
                break;
        }
    }
    public static void main(String[] args) {
        App app = new App();
        app.arrayDemo(args);
        app.first(args);
        app.simpleArr(args);
        app.arrOfName(args);
        app.comparison(args);
        app.monthCase(args);
    }

    
} 


