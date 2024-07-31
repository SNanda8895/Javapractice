package org.example;

import java.util.Set;
import java.util.TreeSet;

    public class Rack {
        Set<Integer> balls;
        public Rack(){
            this.balls=new TreeSet<>();
        }
        public void adding(int num){
            balls.add(num);
        }
        public Set<Integer> getBall(){
            return balls;
        }

        public static void main(String[] args) {
            Rack rack = new Rack();
            rack.adding(20);
            System.out.println(rack.getBall());
            rack.adding(10);
            System.out.println(rack.getBall());
            rack.adding(30);
            System.out.println(rack.getBall());


        }
    }

//rack = Rack.new
//assert_equal([], rack.balls)
//rack.add(20)
//assert_equal([ 20 ], rack.balls)
//rack.add(10)
//assert_equal([ 10, 20 ], rack.balls)
//rack.add(30)
//assert_equal([ 10, 20, 30 ], rack.balls)
//
