package com.greenfoxacademy.springstart.controllers;

public class AtomicLong {
  long id;

  public AtomicLong() {
    this.id = 0;
  }

  public long increment() {
    return id++;
  }

  public long getId() {
    return id;
  }

  public String toString() {
    return getId() + " times";
  }
}
