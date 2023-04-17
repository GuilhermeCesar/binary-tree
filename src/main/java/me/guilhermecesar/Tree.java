package me.guilhermecesar;

public class Tree {

    Node root;
    Integer size;

    public Tree() {
        size = 0;
    }

    void insert(Integer info, Node place) {
        if (place == null) {
            this.root = new Node(info);
        } else if (info < place.getInfo()) {
            if (place.getLeft() == null) {
                place.setLeft(new Node(info));
            } else {
                insert(info, place.getLeft());
            }
        } else if (info > place.getInfo()) {
            if (place.getRight() == null) {
                place.setRight(new Node(info));
            } else {
                insert(info, place.getRight());
            }
        }
    }
}
