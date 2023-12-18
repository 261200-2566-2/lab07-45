import java.util.*;

public class HashSet <E> implements Set <E> {
    private HashMap<E,Integer> map;

    public HashSet(){
        map = new HashMap<>();
    }

    @Override
    public int size(){
        return map.size();
    }

    @Override
    public boolean contains(Object element){
        return map.containsKey(element);
    }

    @Override
    public boolean isEmpty() {
        if(size()>0){
            return false;
        }
        return true;
    }

    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E element) {
        if(!map.containsKey(element)){
            System.out.println("Add "+element+" complete.");
            map.put(element,0);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object element) {
        if(map.containsKey(element)){
            map.remove(element);
            System.out.println("Remove "+element+" complete.");
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return map.keySet().containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean modified = false;
        for(E element : c){
            modified |= add(element);
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return map.keySet().retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return map.keySet().removeAll(c);
    }

    @Override
    public void clear() {
        map.clear();
    }
}
