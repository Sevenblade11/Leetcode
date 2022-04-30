package hashset;

public class HashSet {

    public static void main(String[] args){
        HashSet hs = new HashSet();
        hs.add(1);
        hs.add(2);
        hs.add(2);
        hs.add(2);
        hs.remove(2);
        System.out.println(hs.contains(2));
    }
    private int[] map;
    private int head;

    public HashSet() {
        map = new int[100];
        head = 0;
    }

    public void add(int key) {
        map[head] = key;
        head += 1;
    }

    public void remove(int key) {
        boolean found = false;
        for(int j = 0; j < map.length; j++) {
            if (map[j] == key) {
                map[j] = 0;
                found = true;
                head -= 1;
            }
            if(found)
                map[j-1] = map[j];
        }
    }

    public boolean contains(int key) {
        for (int j : map)
            if (j == key)
                return true;
        return false;
    }
}
