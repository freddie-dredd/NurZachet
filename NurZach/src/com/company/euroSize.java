package com.company;

public enum euroSize {
    XXS(32) {
        void getDescription() {
            System.out.println("Детский размер");
        }
    },
    XS(34), S(36), M(38), L(40) {
        void getDescription() {
            System.out.println("Взрослый размер");
        }
    };

    public final int size;
    euroSize (int size) {
        this.size = size;
    }
}

