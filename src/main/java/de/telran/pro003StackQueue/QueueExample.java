package de.telran.pro003StackQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class QueueExample {
    public static void main(String[] args) {
        //ABQ
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);

        Thread producer = new Thread(()->{
            String[] words = {"qwe","wer","ert","rty","yui","uio"};
            for (int i = 0; i < words.length && !Thread.interrupted(); i++) {
                try {
                    Thread.sleep(500);
                    queue.put(words[i]);
                    System.out.println(">>> Producer produce: "+words[i]);
                    System.out.println("Queue size: "+queue.size());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });



        Thread consumer = new Thread(()->{
            StringBuilder sb = new StringBuilder();
            while (!Thread.interrupted()){

                try {
                    sb.setLength(0);
                    Thread.sleep(2500);
                    sb.append(queue.take());
                    System.out.println("<<< Consumer consumered: "+sb.reverse());
                    System.out.println("Queue size: "+queue.size());

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        });

        producer.start();
        consumer.start();

    }
}
