package com.examples.reactive;

import reactor.core.publisher.Flux;

public class ReactiveOperatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flux<String> fruits = Flux.just("apple","banana","avacado","cherry","date","kiwi","mango","orange","papaya","pineapple","strawberry","watermelon");
		
		Flux<String> flux = Flux.just("apple","banana",null,"cherry")
								.map(String::toUpperCase);
		
		Flux<Integer> numbers = Flux.range(1, 10)
							         .map(x -> x * 2);
		
		Flux<Integer> filteredNumbers = numbers.filter(x -> x>=10);
		filteredNumbers.subscribe(x -> System.out.print(x+" "));
		
		numbers.subscribe(
				x -> System.out.println(x+" "),
				e -> System.out.println(e.getMessage()), 
                () -> System.out.println("Completed")
			);
		
		
		
		flux.subscribe(
				x -> System.out.println(x),
				e -> System.out.println(e.getMessage()), 
				() -> System.out.println("Completed")
			);
		

		System.out.println("Fruits with length > 5");
			fruits.filter(str -> str.length() <= 5)
			      .subscribe(System.out::println, 
                             e -> System.out.println(e.getMessage()), 
                             () -> System.out.println("Completed")
                   );
			
			
		Flux<String> flux1 = Flux.just("apple","banana","avacado","cherry");
		Flux<String> flux2 = Flux.just("date","kiwi","mango","orange");
		
		// use zip to combine the items from two fluxes
		System.out.println("Combined Flux");
		Flux<String> combinedFlux = Flux.zip(flux1, flux2)
				                        .map(tuple -> tuple.getT1() + " " + tuple.getT2());
		
		combinedFlux.subscribe(System.out::println);
		
	}

}
