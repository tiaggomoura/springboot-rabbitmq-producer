package com.democonsumer.demo.amqp;

public interface AmqpConsumer<T> {

	void consumer(T t);
}
