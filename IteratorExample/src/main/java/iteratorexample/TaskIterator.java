/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratorexample;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author JCMB
 */
public class TaskIterator implements Iterator<Task>{
    private List<Task> tasks;
    private int position;

    public TaskIterator(List<Task> tasks) {
        this.tasks = tasks;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < tasks.size();
    }

    @Override
    public Task next() {
        Task task = tasks.get(position);
        position++;
        return task;
    }

    @Override
    public void remove() {
        tasks.remove(position - 1);
        position--;
    }
}
