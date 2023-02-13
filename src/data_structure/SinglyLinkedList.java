package data_structure;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class SinglyLinkedList<E> {

    private transient int size = 0;

    private transient Node<E> first;

    private transient Node<E> last;

    public SinglyLinkedList() {
    }

    public SinglyLinkedList(Collection<? extends E> collection) {
        this();
        addAll(collection);
    }

    public E getFirst() {

        final var f = first;

        if (f == null) throw new NoSuchElementException();

        return f.item;
    }

    public E getLast() {

        final var l = last;

        if (l == null) throw new NoSuchElementException();

        return l.item;
    }

    public E removeFirst() {

        var element = unlinkFirst();

        if (element == null) throw new NoSuchElementException();

        return element;
    }

    public E removeLast() {

        var element = unlinkLast();

        if (element == null) throw new NoSuchElementException();

        return element;
    }

    public void addFirst(E e) {
        linkFirst(e);
    }

    public void addLast(E e) {
        linkLast(e);
    }

    public boolean contains(Object o) {

        var node = first;

        while (node != null) {

            if (node.item.equals(o)) return true;
            node = node.next;
        }

        return false;
    }

    public int size() {
        return size;
    }

    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    public boolean remove(Object o) {

        var node = first;
        final var l = last;

        if (node.item.equals(o)) {

            unlinkFirst();
            return true;

        } else if (l.item.equals(o)) {

            unlinkLast();
            return true;
        }

        while (node != last) {

            if (node.next.item.equals(o)) {

                var toRemove = node.next;

                node.next = toRemove.next;

                toRemove.item = null;
                toRemove.next = null;

                size--;
                return true;
            }
            node = node.next;
        }

        return false;
    }

    public boolean addAll(Collection<? extends E> collection) {

        if (collection.isEmpty()) return false;

        var isFirst = size == 0;
        Node<E> current = isFirst ? null : last;

        for (E e : collection) {

            if (isFirst) {

                first = new Node<>(e, null);
                current = first;
                isFirst = false;
                continue;
            }

            current.next = new Node<>(e, null);
            current = current.next;
        }
        last = current;
        size += collection.size();

        return true;
    }

    public boolean addAll(int index, Collection<? extends E> collection) {

        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        if (collection.isEmpty()) return false;
        if (index == size) return addAll(collection);

        var isFirst = true;
        var head2 = new Node<E>(null, null);
        var current = head2;
        var last2 = new Node<E>(null, null);

        for (E e : collection) {

            if (isFirst) {

                head2.item = e;
                isFirst = false;
                continue;
            }

            current.next = new Node<>(e, null);
            current = current.next;
        }
        last2 = current;

        if (index == 0) {

            last2.next = first;
            first = head2;
            size += collection.size();
            return true;
        }
        current = first;
        var ind = 1;

        while (ind != index) {

            current = current.next;
            ++ind;
        }
        var nextIndex = current.next;
        current.next = head2;
        last2.next = nextIndex;

        size += collection.size();
        return true;
    }

    public void clear() {

        var current = first;

        while (current.next != null) {

            var nextNode = current.next;
            current.item = null;
            current.next = null;
            current = nextNode;
        }

        first = last = null;
        size = 0;
    }

    public E get(int index) {
        return node(index).item;
    }

    public E set(int index, E element) {

        var current = node(index);

        var previousItem = current.item;
        current.item = element;

        return previousItem;
    }

    public void add(int index, E element) {


        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);

        if (index == 0) linkFirst(element);

        else if (index == size) linkLast(element);

        else {

            var prev = node(index - 1);

            prev.next = new Node<>(element, prev.next);

            size++;
        }
    }

    public E remove(int index) {

        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);

        if (index == 0) return unlinkFirst();

        else if (index == size - 1) return unlinkLast();

        else return unlink(node(index - 1));
    }

    public int indexOf(Object o) {

        var current = first;
        var index = 0;

        while (current != null) {

            if (current.item.equals(o)) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public int lastIndexOf(Object o) {

        var current = first;
        var index = 0;
        var lastIndex = -2;

        while (current != null) {

            if (current.item.equals(o)) lastIndex = index;
            current = current.next;
            index++;
        }
        return Math.max(lastIndex, -1);
    }

    public E peek() {

        final var f = first;

        return f != null ? f.item : null;
    }

    public E element() {
        return getFirst();
    }

    public E poll() {
        return unlinkFirst();
    }

    public E remove() {
        return removeFirst();
    }

    public boolean offer(E e) {
        return add(e);
    }

    public boolean offerFirst(E e) {
        add(0, e);
        return true;
    }

    public boolean offerLast(E e) {
        add(size, e);
        return true;
    }

    public E peekFirst() {

        final var f = first;

        return f != null ? f.item : null;
    }

    public E peekLast() {

        final var l = last;

        return l != null ? l.item : null;
    }

    public E pollFirst() {
        return unlinkFirst();
    }

    public E pollLast() {
        return unlinkLast();
    }

    public void push(E e) {
        linkFirst(e);
    }

    public E pop() {
        return removeFirst();
    }

    public boolean removeFirstOccurrence(Object o) {
        return remove(o);
    }

    public boolean removeLastOccurrence(Object o) {

        var current = first;
        var lastOPrev = first.item.equals(o) ? first : null;

        while (current.next != null) {

            if (current.next.item.equals(o)) lastOPrev = current;
            current = current.next;
        }

        if (lastOPrev == first) unlinkFirst();

        else if (lastOPrev != null && lastOPrev.next == last) unlinkLast();

        else if (lastOPrev != null) unlink(lastOPrev);

        return lastOPrev != null;
    }

    public Object[] toArray() {

        Object[] array = new Object[size];
        var current = first;

        for (int i = 0; i < array.length; i++) {

            array[i] = current.item;
            current = current.next;
        }
        return array;
    }

    private void linkFirst(E e) {

        if (size == 0) first = last = new Node<>(e, null);

        else first = new Node<>(e, first);

        size++;
    }

    private void linkLast(E e) {

        if (size == 0) first = last = new Node<>(e, null);

        else {

            last.next = new Node<>(e, null);
            last = last.next;
        }

        size++;
    }

    private Node<E> node(int index) {

        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);

        var current = first;
        var ind = 0;

        while (ind != index) {

            current = current.next;
            ++ind;
        }
        return current;
    }

    private E unlinkFirst() {

        if (size == 0) return null;

        final var node = first;
        final var element = node.item;

        if (size == 1) {

            first.item = last.item = null;
            first = last = null;

        } else {

            first = node.next;
            node.item = null;
            node.next = null;
        }

        size--;

        return element;
    }

    private E unlink(Node<E> node) {

        var toRemove = node.next;
        var output = toRemove.item;
        var next = toRemove.next;

        toRemove.item = null;
        toRemove.next = null;

        node.next = next;

        size--;

        return output;
    }

    private E unlinkLast() {

        if (size == 0) return null;

        var node = first;
        var l = last;
        final var output = l.item;

        if (size == 1) {

            node.item = l.item = null;
            first = last = null;

        } else {

            while (node.next != l) node = node.next;

            last = node;
            node.next.item = null;
            node.next = null;
        }

        size--;

        return output;
    }

    public String toString() {

        if (size == 0) return "[]";
        if (size == 1) return "[" + first.item + "]";

        var output = new StringBuilder("[" + first.item + ", ");

        var current = first.next;

        while (current != last) {

            output.append(current.item).append(", ");
            current = current.next;
        }

        return output.toString() + last.item + "]";
    }

    private static class Node<E> {
        E item;
        Node<E> next;

        Node(E element, Node<E> next) {
            this.item = element;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +
                    ", next=" + next.item +
                    '}';
        }
    }

    public void sort() {

        if (!(first.item instanceof Number)) throw new ClassCastException();

        var isChanged = false;

        do {
            isChanged = false;
            var current = first;
            while (current.next != null) {

                if (((Number) current.item).doubleValue() > ((Number) current.next.item).doubleValue()) {

                    var preItem = current.item;
                    current.item = current.next.item;
                    current.next.item = preItem;
                    isChanged = true;
                }
                current = current.next;
            }
        } while (isChanged);
    }

    public E getMiddle() {

        if (size == 0) throw new  NoSuchElementException();

        var slow = first;
        var fast = slow;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.item;
    }
}
