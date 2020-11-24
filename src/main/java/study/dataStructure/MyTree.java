package study.dataStructure;

import java.util.Iterator;

public class MyTree<Y> extends AbstractTree<Y> {
    @Override
    public Position<Y> root() {
        return null;
    }

    @Override
    public Position<Y> parent(Position<Y> p) {
        return null;
    }

    @Override
    public Iterable<Position<Y>> children(Position<Y> p) {
        return null;
    }

    @Override
    public int numChildren(Position<Y> p) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<Y> iterator() {
        return null;
    }

    @Override
    public Iterable<Position<Y>> positions() {
        return null;
    }
}
