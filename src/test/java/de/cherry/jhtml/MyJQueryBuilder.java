package de.cherry.jhtml;

import de.cherry.jhtml.jquery.JQueryBuilder;
import de.cherry.jhtml.jquery.JQueryBuilderCss;

public class MyJQueryBuilder
    extends JQueryBuilder<MyJQueryBuilder>
    implements JQueryBuilderCss<MyJQueryBuilder> {

  public MyJQueryBuilder(String selector) {
    super(selector);
  }

  @Override
  public MyJQueryBuilder that() {
    return this;
  }
}
