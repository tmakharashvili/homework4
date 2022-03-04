import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

    public class newHomework {
        @Test
        public void lesson(){
            Configuration.browserSize = "1920x1080";
            open("https://www.adjarabet.com/ka");
            $(byAttribute("data-id", "register-btn")). click();
            $(byText("შექმენი ახალი ანგარიში")).shouldBe(Condition.visible, Duration.ofMillis(5000));
            $(byAttribute("data-id", "signUpFormFirstOfThree_firstname")).setValue("Tamo");
            $(byAttribute("data-id", "signUpFormFirstOfThree_lastname")).setValue("Makharashvili");
            $(byText("მდედრობითი")). click();
            $(byAttribute("data-id", "signUpFormFirstOfThree_country")).click();
            $(byAttribute("placeholder", "ძებნა")).setValue("საქართველო").pressEnter();
            $(byAttribute("data-id", "signUpFormFirstOfThree_personalId")).setValue("11111111111");
            $(byAttribute("data-id", "signUpFormFirstOfThree_countryCode")).click();
            $(byAttribute("placeholder", "ძებნა")).setValue("საქართველო").pressEnter();
            $(byAttribute("type","tel")).setValue("595730009");
            $(byAttribute("autocapitalize","none")).setValue("tmakharashvili");
            $(byAttribute("type","password")).setValue("123123");
            $("._s_mt-5").click();


            sleep(7000);
        }
    }
