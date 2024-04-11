/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.generics;

public class GenericEntry<T, E> {

    private T data;
    private E rank;

    public GenericEntry(T data, E rank) {
        this.data = data;
        this.rank = rank;
    }

    public T getData() {
        return data;
    }

    public E getRank() {
        return rank;
    }

}
