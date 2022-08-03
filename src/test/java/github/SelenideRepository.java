package github;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepository {

  @Test
  void shouldFindSelenideAsRepository(){

    // открыть страницу github.com
    open("https://github.com/");
    // ввести в поле поиска selenide и нажать Enter
    $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();

    // нажимаем на линк от первого результата поиска
    $$("ul.repo-list li").first().$("a").click();
    // check: в заголовке встречается selenide/selenide
    $("#repository-container-header").shouldHave(text("selenide / selenide"));

    // ARRANGE
    // ACT
    // ACT
    // ACT
    // ASSERT
    // ACT
    // ASSERT

  }
}
