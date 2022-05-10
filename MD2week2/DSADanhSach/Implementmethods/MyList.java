//package week1.Java.MD2week2.DSADanhSach.Implementmethods;
//
//public class MyList<E> {
//    private int size = 0;
//    private static final int DEFAULT_CAPACITY = 10;
//    private Object elements[];
//
//    public MyList() {
//        elements = new Object[DEFAULT_CAPACITY];
//    }
//
//    public MyList(int capaccity) {
//        elements = new Object[capaccity];
//    }
//
//    private boolean add(E element) {
//        if (size == elements.length) {
//            return false;
//        }
//        elements[size++] = element;
//        return true;
//    }
//
//    public void add(int index, E element) {
//        for (int i = size; i > index; i--)
//            elements[i] = element;
//        size++;
//    }
//    private void checkIndex(int index){
//        checkIndex(index);
//        E temp = (E) elements[index];
//        for (int i = index; i < size ; i++){
//            elements[i] = elements[i + 1];
//        }
//        elements[size - 1] = null;
//        size--;
//        return temp;
//    }
//    public int size(){
//        return this.size;
//    }
//    @Override
//    public MyList clone(){
//        MyList<E> clone = new MyList<E>(elements.length);
//        for (E e : (E[]) elements){
//            clone.add(e);
//        }
//        return clone;
//    }
//}
