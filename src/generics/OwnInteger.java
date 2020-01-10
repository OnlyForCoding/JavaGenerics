package generics;

public class OwnInteger<T> {
    T[] list;
    int counter = 0;
    int limit = 0;

    OwnInteger(int a){
        this.limit = a;
        //list = new Integer[a];
        list = (T[]) new Object[a];
    }

    public void add(T num){
        if (limit-1 < counter){
            System.out.println("exceeds the limit");
            return;
        }
        list[counter] = num;
        counter++;
    }

    public void printMe(){
        System.out.print("[");
        for (int a=0; a< list.length; a++){
            System.out.print(list[a]+",");
        }
        System.out.print("]");
    }
}
