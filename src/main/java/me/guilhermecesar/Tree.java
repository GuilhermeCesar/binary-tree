package me.guilhermecesar;

public class Tree {

    private Node root;
    private Integer size;

    public Tree() {
        size = 0;
    }


    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
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

    void preOrder(Node place) {
        System.out.print(" " + place.getInfo() + ",");

        if (place.getLeft() != null) {
            preOrder(place.getLeft());
        }

        if (place.getRight() != null) {
            preOrder(place.getRight());
        }
    }

    void inOrder(Node place) {
        if (place.getLeft() != null) {
            inOrder(place.getLeft());
        }
        System.out.print(" " + place.getInfo());
        if (place.getRight() != null) {
            inOrder(place.getRight());
        }
    }

    void posOrder(Node place) {
        if (place.getLeft() != null) {
            posOrder(place.getLeft());
        }
        if (place.getRight() != null) {
            posOrder(place.getRight());
        }
        System.out.print(" " + place.getInfo());
    }


}
