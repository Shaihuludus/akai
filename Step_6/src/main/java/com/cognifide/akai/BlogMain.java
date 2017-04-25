package com.cognifide.akai;

import java.util.stream.Stream;

/**
 * Starting point of the application
 */
public class BlogMain {

  private final String[] BLOG_ENTRIES = {"First Note", "Another Note", "End"};

  public static void main(String[] args) {
    System.out.println("Blog up and running");
    new BlogMain().printAllNotes();
  }

  public void printAllNotes() {
    Stream.of(BLOG_ENTRIES).forEach(note -> System.out.println(addNote(note)));
  }

  public String addNote(String note) {
    return note.contains("Note") ? note : note + " Note";
  }

}
