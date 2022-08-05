package github;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ContributorsTest {


  @Test
  void andreiSolntsevShouldContributeTheMost(){
    Configuration.headless=true;
    // open Selenide repository page
    open("https://github.com/selenide/selenide");
    // bring mouse over the first avatar on contributors tab
    $(".Layout-sidebar").$(byText("Contributors"))
            .ancestor(".BorderGrid-cell").$$("ul li").first()
            .hover();

    // check: popup is showing Andres Solntsev
    $$(".Popover-message").find(visible).shouldHave(text("Andrei Solntsev"));
  }
}
