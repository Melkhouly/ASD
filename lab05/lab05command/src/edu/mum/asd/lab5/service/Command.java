package edu.mum.asd.lab5.service;

public interface Command<A,D> {
	void execute();
	void undo();
}

