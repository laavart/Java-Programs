/**
 *@title Generic Classes
 */

/**
 * This is used to make the class generic
 * @param <T> is treated same as template in C++
 * Here "T" can be any class
 */
class MyArray<T>{
    T[] list;

    /**
     * To make array of "T" we must NOT use "new T[]"
     * We should type cast an array of "OBJECT" to T[]
     */
    MyArray(int n){
        list = (T[]) new Object[n];
    }

    MyArray(int n, T[] a){
        list = (T[]) new Object[n];
        for(int i=0; i<n; i++) list[i] = a[i];
    }

    void getList(){
        for(T x: list){
            System.out.println(x);
        }
    }
}

/**
 * Class extended from a Generic class is not a Generic class by default
 * We can use generic class like "MyArray" i.e., nothing but then he class will be treated as "MyArray<Object>"
 * And if you want you can give type of the Parent class i.e., "MyArray<___>", "___" => any class
 */
class MyArray2 extends MyArray<Number>{

    MyArray2(int n, Number[] a) {
        super(n, a);
    }
}

/**
 * We can apply limit to which classes we want to use
 * by using "extends" for subclasses
 */
class MyArray3<T extends Number> extends MyArray<T>{

    MyArray3(int n) {
        super(n);
    }

    @SafeVarargs
    final void setList(T... x){
        int c=0;
        for(T e: x){
            list[c] = x[c++];
        }
    }
}

interface MyInFac {}
class MyIf implements MyInFac {}
class MyIf2 implements MyInFac {}
/**
 * @param <T> will take any class which implements from MyInFac
 * Here,
 *    You can see that it is written "extends" in place of "implements"
 *    This happens ONLY if it is used for Generic classes
 *    Because ONLY extends keyword is allowed in Generic class definition
 */
class MyClass4<T extends MyInFac> extends MyArray<T>{
    MyClass4(int n, T[] a) {
        super(n, a);
    }
}

class MyClass{}
interface MyInFac2{}
/**
 * Generic classes can extend from one class and multiple interfaces
 * But the first one must be a class, IF extended from a class also
 */
class MyClass2<T extends MyClass & MyInFac & MyInFac2>{}

public class s20220122 {

    /**
     * @param <T> is declared before the function declaration to make function
     * Generic Functions do not need to specify their type
     */
    static <T> void fn(T[] e){
        for(T x: e) System.out.println(x);
    }

    /**
     * We can apply limit to which classes we want to use
     * by using wildcard i.e., using "?" in <>,
     * "extends" for subclasses i.e., UPPER BOUND
     * like this function will take the classes like Integer, Float, etc.
     */
    static void fn2( MyArray<? extends Number> m ){}

    /**
     * and "super" for parent-classes i.e., LOWER BOUND
     * like this function will take the classes like Number AND Object.
     */
    static void fn3( MyArray<? super Integer> m ){}


    public static void main(String... Args){
        /**
         * This is being treated as
         * MyArray<Object> obj = new MyArray<>()
         * So the "T" is taken as Object
         */
        MyArray obj = new MyArray<>(3);

        /**
         * We cannot use any other class than those extended from Number class
         * OUTPUT:
         *      java: incompatible types: java.lang.String[] cannot be converted to java.lang.Number[]
         */
        //String[] s = {};
        //MyArray2 err = new MyArray2(0,s);
        /**
         * Here we can use any class that is extended from Number class
         * such as Integer, Float, Double, Long, etc.
         */
        Integer[] a = {0,1,2,3};
        MyArray2 num = new MyArray2(4, a);

        /**
         * Here we can use any class that is extended from Number Class
         * OUTPUT:
         *      java: type argument java.lang.String is not within bounds of type-variable T
         */
        //MyArray3<String> err2 = new MyArray3<>(3);
        /**
         * Here T will be "Integer"
         * It is accepted because itg extends from Number class
         */
        MyArray3<Integer> numT = new MyArray3<>(3);

    }
}
