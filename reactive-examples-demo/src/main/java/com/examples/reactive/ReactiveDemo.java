package com.examples.reactive;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ReactiveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mono<String> mono1 = Mono.just("Hello World");
		Mono<Integer> mono2 = Mono.just(100);
		Mono<Boolean> mono3 = Mono.just(true);
		Mono<User> mono4 = Mono.just(new User("John", 30));
		
		mono1.subscribe(System.out::println);
		mono2.subscribe(System.out::println);
		mono3.subscribe(System.out::println);
		mono4.subscribe(System.out::println);
		
		Flux<String> names  = Flux.just("John", "Mike", "Sarah");
		Flux<Integer> numbers = Flux.just(10, 20, 30, 40);
		Flux<Boolean> flags = Flux.just(true, false, true);
		Flux<User> users = Flux.just(new User("John", 30), 
							         new User("Mike", 25), 
							         new User("Sarah", 35)
							         );
		
		names.subscribe(System.out::println);
		numbers.subscribe(System.out::println);
		flags.subscribe(System.out::println);
		users.subscribe(System.out::println);
		
		// create a mono that emits an error
		Mono<String> mono = Mono.error(new RuntimeException("Error occurred"));
		
		
		mono.subscribe(x -> System.out.println(x), 
					   e -> System.out.println(e.getMessage()),
					   () -> System.out.println("Completed")
					   );
		
		
		mono4.subscribe(System.out::println);
		
		
		// create a flux that emits an error
		Flux<String> flux = Flux.just("Hello World", "Hello Reactor", "Hello Java")
				.concatWith(Flux.error(new RuntimeException("Error occurred")));
				flux.subscribe(System.out::println, 
						       e -> System.out.println(e.getMessage()),
						       () -> System.out.println("Completed")
						       );

	}

}
