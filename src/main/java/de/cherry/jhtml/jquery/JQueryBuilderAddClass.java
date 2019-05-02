package de.cherry.jhtml.jquery;

public interface JQueryBuilderAddClass<T extends JQueryBuilder> extends JQueryBuilderThat<T> {
  default T addClass(){
    return that();
  }
}
