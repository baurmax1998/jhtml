package de.cherry.jhtml;

import org.junit.Test;

public class JQueryBuilderTest {

  @Test
  public void jqtest() {
    MyJQueryBuilder jq =
        new MyJQueryBuilder("#test")
            .css()
            .addClass()
            .css()
            .addClass();

  }
}