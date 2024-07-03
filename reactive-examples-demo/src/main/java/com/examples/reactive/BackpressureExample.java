package com.examples.reactive;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class BackpressureExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flux<Integer> flux = Flux.range(1, 1000);
		flux.subscribe(
			
				x ->{
					try {
						Thread.sleep(200);
						System.out.println(x);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				},
				e -> System.out.println(e.getMessage()), 
                () -> System.out.println("Completed")
				);
		
		/*
		flux.onBackpressureBuffer()
           .publishOn(Schedulers.boundedElastic(),10)
				.subscribe(value -> {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(value);
				},
				e -> System.out.println(e.getMessage()),
                () -> System.out.println("Completed")
             );
		*/
		
		//keep the main thread alive for some time
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}
