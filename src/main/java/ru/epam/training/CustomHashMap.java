package ru.epam.training;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CustomHashMap<K,V> implements Map<K,V> {

    private CustomEntry<K,V>[] buckets = new CustomEntry[16];

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public boolean containsKey(Object key) {
        return buckets[0].key.equals(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        buckets[0] = new CustomEntry<>(key,value);
        return null; //TODO implement return prev value
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    private class CustomEntry<K,V> implements Iterator<CustomEntry<K,V>> {

        private final K key;
        private V value;
        private CustomEntry<K,V> next = null;

        public CustomEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public void setNext(CustomEntry<K, V> next) {
            this.next = next;
        }

        public boolean hasNext(){
            return this.next != null;
        }

        public CustomEntry<K,V> next(){
            return this.next;
        }
    }
}