package mapConversionOperations;

public class CustomHashMao<K,V> {
	
	private final float loadFactor = 0.75f;
	private final int capacity = 100;
    private final int size = 0;
    
    private final Node<K, V>[] table = new  CustomHashMao.Node[capacity];
    
    private int Hashing(int hashCode) {
    	int location = hashCode % capacity;
        System.out.println("Location:"+location);
        return location;
    }
	
    public int size() {
    	return this.size;
    }
	
    public boolean isEmpty() {
        return this.size == 0;
    }
    
    public boolean containsKey(Object key) {
    	
    	if(key == null) {
    		if(table[0].getKey() == null) {
    			return true;
    		}
    	}
    	
    	int location = Hashing(key.hashCode());
    	Node n = null;
    	
    	try {
    		
    		n = table[location];
    		
    	}catch (Exception e) {
			// TODO: handle exception
		}

        return n != null && n.getKey() == key;


    }
	
	
    public V put(K key, V value) {
    	V ret = null;
    	
    	if(key == null) {
    		
    	}
		return ret;
    }
	
	
	

	public static void main(String[] args) {

	}

	static class Node<K, V> {

		K key;
		V value;

		public K getKey() {
			return key;
		}

		public V getValue() {
			return value;
		}

		public void setKey(K key) {
			this.key = key;
		}

		public void setValue(V value) {
			this.value = value;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 11;
			if (key != null) {
				int hashCode = prime * result + key.hashCode();
				return hashCode;
			}

			return 0;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || this.getClass().getName() != o.getClass().getName()) {
				return false;
			}
			Node e = (Node) o;
            return this.key == e.key;
        }

	}

}
