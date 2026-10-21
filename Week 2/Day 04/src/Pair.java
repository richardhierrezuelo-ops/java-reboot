//Updated Exercise 1Create a generic class called Pair<K, V> that can hold two values of different types
// (a key and a value).Requirements:Private fields: key (type K) and value (type V)
//Constructor that takes both key and value
//Getters: getKey() and getValue()
//toString() method that prints "Key: X, Value: Y"

public class Pair<K, V>  {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Key: " + key + ", Value: " + value;
    }

}
