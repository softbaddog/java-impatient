package com.corejava.ch03;

public interface Channel extends Closeable {
    boolean isOpen();
}
