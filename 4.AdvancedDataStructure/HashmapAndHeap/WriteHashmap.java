// 1. You are required to complete the code of our Hashmap class. Please watch the question video carefully. The theoretical details of required functionality is explained in detail there. Implement the functions to achieve what is explained in the theoretical discussion in question video.
// 2. Input and Output is managed for you.

import java.io.*;
import java.util.*;

public class WriteHashMap {

    public static class HashMap<K, V> {
        private class HMNode {
            K key;
            V value;

            HMNode(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size; // n
        private LinkedList<HMNode>[] buckets; // N = buckets.length

        public HashMap() {
            initbuckets(4);
            size = 0;
        }

        private void initbuckets(int N) {
            buckets = new LinkedList[N];
            for (int bi = 0; bi < buckets.length; bi++) {
                buckets[bi] = new LinkedList<>();
            }
        }

        public void put(K key, V value) throws Exception {
            // write your code here
            int bucket_number = hash(key);
            int data_idx = index_inside_bucket(key, bucket_number);

            if (data_idx != -1) {
                HMNode node = buckets[bucket_number].get(data_idx);
                node.value = value;

            } else {
                HMNode node = new HMNode(key, value);
                buckets[bucket_number].add(node);
                size++;
            }

            double lamda = size * 1.0 / buckets.length;
            if (lamda > 2.0) {
                rehash();
            }

        }

        private void rehash() throws Exception {
            LinkedList<HMNode>[] old = buckets;

            initbuckets(old.length * 2);
            size = 0;

            for (int i = 0; i < old.length; i++) {
                for (HMNode node : old[i]) {
                    put(node.key, node.value);
                }
            }

        }

        private int hash(K key) {
            int hash_code = key.hashCode();
            int absolute_val = Math.abs(hash_code);

            return absolute_val % buckets.length;
        }

        private int index_inside_bucket(K key, int bucket_number) {
            int idx = 0;
            for (HMNode node : buckets[bucket_number]) {
                if (node.key.equals(key)) {
                    return idx;
                }
                idx++;
            }
            return -1;
        }

        public V get(K key) throws Exception {
            // write your code here
            int bucket_number = hash(key);
            int data_idx = index_inside_bucket(key, bucket_number);

            if (data_idx != -1) {
                HMNode node = buckets[bucket_number].get(data_idx);
                return node.value;

            } else {
                return null;
            }

        }

        public boolean containsKey(K key) {
            // write your code here

            int bucket_number = hash(key);
            int data_idx = index_inside_bucket(key, bucket_number);

            if (data_idx != -1) {
                return true;

            } else {
                return false;
            }
        }

        public V remove(K key) throws Exception {
            // write your code here
            int bucket_number = hash(key);
            int data_idx = index_inside_bucket(key, bucket_number);

            if (data_idx != -1) {
                HMNode node = buckets[bucket_number].remove(data_idx);
                size--;
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keyset() throws Exception {
            // write your code here
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                for (HMNode node : buckets[i]) {
                    keys.add(node.key);
                }
            }

            return keys;
        }

        public int size() {
            // write your code here
            return size;
        }

        public void display() {
            System.out.println("Display Begins");
            for (int bi = 0; bi < buckets.length; bi++) {
                System.out.print("Bucket" + bi + " ");
                for (HMNode node : buckets[bi]) {
                    System.out.print(node.key + "@" + node.value + " ");
                }
                System.out.println(".");
            }
            System.out.println("Display Ends");
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("put")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                Integer val = Integer.parseInt(parts[2]);
                map.put(key, val);
            } else if (str.startsWith("get")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.get(key));
            } else if (str.startsWith("containsKey")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.containsKey(key));
            } else if (str.startsWith("remove")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.remove(key));
            } else if (str.startsWith("size")) {
                System.out.println(map.size());
            } else if (str.startsWith("keyset")) {
                System.out.println(map.keyset());
            } else if (str.startsWith("display")) {
                map.display();
            }
            str = br.readLine();
        }
    }
}
