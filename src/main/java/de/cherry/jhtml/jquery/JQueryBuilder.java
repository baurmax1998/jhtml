package de.cherry.jhtml.jquery;

public abstract class JQueryBuilder<T extends JQueryBuilder>
    implements JQueryBuilderAddClass<T>
  , JQueryBuilderThat<T> {

  public JQueryBuilder(String selector){

  }

}
