package de.cherry.jhtml;

import org.junit.Test;

import static de.cherry.jhtml.HTMLBuilder.*;
import static de.cherry.jhtml.CssBuilder.*;

public class HTMLBuilderTest {
  @Test
  public void test() {
    JHTML document = html(
        head(
            css(
                rule(
                    "html"
                    , margin(1, 2, 3, 4)
                ),
                rule(
                    ".elem"
                    , padding(2, 2, 2, 2)
                )
            )
        ),
        body(
            h1(

            ),
            div(
                h2(

                ),
                b(

                ),
                p(

                )
            )
        )
    );
    System.out.println(document);
  }
}