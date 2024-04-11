/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Queue;

import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args){

        Queue<String> queue = new java.util.PriorityQueue<>();
        //Natural ordination.
        queue.add("short");
        queue.add("medium");
        queue.add("big");

        while(queue.size() != 0){
            System.out.println(queue.remove());
        }

    }

}
