/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package iteratorexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author JCMB
 */
public class IteratorExample {

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Estudar Java"));
        tasks.add(new Task("Fazer exercícios"));
        tasks.add(new Task("Resolver problemas"));

        // Iteração usando o Iterator
        Iterator<Task> iterator = new TaskIterator(tasks);
        while (iterator.hasNext()) {
            Task task = iterator.next();
            System.out.println("Tarefa: " + task.getName());

            if (task.isCompleted()) {
                iterator.remove();
            } else {
                task.complete();
            }
        }

        System.out.println("Tarefas restantes:");
        for (Task task : tasks) {
            System.out.println("Tarefa: " + task.getName());
        }
    }
}