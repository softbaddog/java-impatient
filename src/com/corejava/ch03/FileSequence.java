package com.corejava.ch03;

public class FileSequence implements IntSequence, Closeable {
    private int file_des;

    @Override
    public void close() {

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public int next() {
        return 0;
    }
}
