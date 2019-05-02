package de.cherry.jhtml.jquery;

public interface JQueryBuilderCss<T extends JQueryBuilder> extends JQueryBuilderThat<T> {
  default T css(){
    return that();
  }
}
