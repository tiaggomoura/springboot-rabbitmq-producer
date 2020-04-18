package com.demoproducer.demo.interfaces;

public interface AmqpProducer<T> {
	void producer(T t);
}
