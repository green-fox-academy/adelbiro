package com.greenfoxacademy.springstart.controllers;

public class AtomicLong {
  long id;

  public AtomicLong() {
    this.id = 0;
  }

  public long increment() {
    return id++;
  }
}
