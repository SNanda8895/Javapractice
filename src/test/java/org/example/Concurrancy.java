package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Concurrancy {

        public static void main(String[] args) throws Exception {
            Count count = new Count();
            CounterA counterA = new CounterA(count);
            CounterB counterB = new CounterB(count);

            ExecutorService executorService = Executors.newFixedThreadPool(2);
            List<Future<Integer>> futures = executorService.invokeAll(Arrays.asList(
                    counterA,
                    counterB
            ));

            executorService.shutdown();
            executorService.awaitTermination(5, TimeUnit.SECONDS);

            Integer valueFromA = futures.get(0).get();
            Integer valueFromB = futures.get(1).get();

            System.out.println("value from A: " + valueFromA);
            System.out.println("value from B: " + valueFromB);
            System.out.println("value from count.value: " + count.value);
        }
    }

    class Count {
        Integer value = 0;
    }

    class CounterA implements Callable<Integer> {
        private final Count count;

        public CounterA(Count count) {
            this.count = count;
        }

        @Override
        public Integer call() {
            for (int i = 0; i < 100_000; i++) {
                this.count.value += 1;
            }
            return this.count.value;
        }
    }

    class CounterB implements Callable<Integer> {
        private final Count count;

        public CounterB(Count count) {
            this.count = count;
        }

        @Override
        public Integer call() {
            for (int i = 0; i < 100_000; i++) {
                this.count.value -= 1;
            }
            return this.count.value;
        }
    }

