package com.cognifide.akai;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by daniel.madejek on 2017-04-20.
 */
public class BlogMainTest {

  private final String[] BLOG_ENTRIES = {"First Note", "Another Note", "End"};

  private BlogMain tested = new BlogMain();

  @Test
  public void addNoteTest() throws Exception {
    for (String entry : BLOG_ENTRIES) {
      assertThat(tested.addNote(entry).contains("Note"),is(true));
    }
  }

}
