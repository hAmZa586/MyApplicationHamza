package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList implements java.util.List<TaskModel> {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(@Nullable Object o) {
        return false;
    }

    @NonNull
    @Override
    public Iterator<TaskModel> iterator() {
        return null;
    }

    @NonNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @NonNull
    @Override
    public <T> T[] toArray(@NonNull T[] ts) {
        return null;
    }

    @Override
    public boolean add(TaskModel taskModel) {
        return false;
    }

    @Override
    public boolean remove(@Nullable Object o) {
        return false;
    }

    @Override
    public boolean containsAll(@NonNull Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(@NonNull Collection<? extends TaskModel> collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, @NonNull Collection<? extends TaskModel> collection) {
        return false;
    }

    @Override
    public boolean removeAll(@NonNull Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(@NonNull Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public TaskModel get(int i) {
        return null;
    }

    @Override
    public TaskModel set(int i, TaskModel taskModel) {
        return null;
    }

    @Override
    public void add(int i, TaskModel taskModel) {

    }

    @Override
    public TaskModel remove(int i) {
        return null;
    }

    @Override
    public int indexOf(@Nullable Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(@Nullable Object o) {
        return 0;
    }

    @NonNull
    @Override
    public ListIterator<TaskModel> listIterator() {
        return null;
    }

    @NonNull
    @Override
    public ListIterator<TaskModel> listIterator(int i) {
        return null;
    }

    @NonNull
    @Override
    public List<TaskModel> subList(int i, int i1) {
        return null;
    }
}
