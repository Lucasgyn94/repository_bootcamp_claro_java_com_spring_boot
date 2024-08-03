package me.dio.collectionsJava.introducao.genericsTypes;

public class BoxGenerica<T> {
    private T tipo;

    public T getTipo() {
        return this.tipo;
    }

    public void setT(T tipo) {
        this.tipo = tipo;
    }
}
