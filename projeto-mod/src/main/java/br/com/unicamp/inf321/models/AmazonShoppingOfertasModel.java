package br.com.unicamp.inf321.models;

import static org.assertj.core.api.StrictAssertions.assertThat;
import static org.assertj.core.api.StrictAssertions.fail;

import java.util.concurrent.TimeUnit;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import br.com.unicamp.inf321.AmazonShoppingOfertas;
import br.com.unicamp.inf321.models.screenobjects.CreateAccountScreen;
import br.com.unicamp.inf321.models.screenobjects.ForgotPasswordScreen;
import br.com.unicamp.inf321.models.screenobjects.LoginScreen;
import br.com.unicamp.inf321.models.screenobjects.WelcomeScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

@GraphWalker(value = "random(edge_coverage(100))", start = "e_FirstAction")
public class AmazonShoppingOfertasModel extends ExecutionContext implements AmazonShoppingOfertas {
  public static final int IMPLICITLY_WAIT_TIME_OUT = 20;
  private AndroidDriver<MobileElement> driver;
  private WelcomeScreen welcomeScreen;
  private LoginScreen loginScreen;
  private ForgotPasswordScreen forgotPasswordScreen;
  private CreateAccountScreen createAccountScreen;

  public AmazonShoppingOfertasModel(AndroidDriver<MobileElement> driver) {
    super();
    this.driver = driver;
    this.welcomeScreen = new WelcomeScreen();
    this.loginScreen = new LoginScreen();
    this.forgotPasswordScreen = new ForgotPasswordScreen();
    this.createAccountScreen = new CreateAccountScreen();
  }

  @Override
  public void e_Iniciar() {
    driver.launchApp();
  }

  @Override
  public void v_TelaEsqueciASenha() {
    PageFactory.initElements(
        new AppiumFieldDecorator(driver, IMPLICITLY_WAIT_TIME_OUT, TimeUnit.SECONDS),
        forgotPasswordScreen);
    assertThat(isElementPresent(forgotPasswordScreen.getScreenTitle())).isTrue();
    assertThat(isElementPresent(forgotPasswordScreen.getEmailField())).isTrue();
    assertThat(isElementPresent(forgotPasswordScreen.getHelpText())).isTrue();
  }

  @Override
  public void e_VoltarCadastro() {
    driver.navigate().back();
  }

  @Override
  public void e_AcessarCadastroPeloLogin() {
    loginScreen.getCreateAccountButton().click();
  }

  @Override
  public void e_VoltarLogin() {
    driver.navigate().back();
  }

  @Override
  public void e_AcessarEsqueciASenha() {
    loginScreen.getForgotPassword().click();
  }

  @Override
  public void e_UsarEmail() {
    createAccountScreen.getUseEmailButton().click();
  }

  @Override
  public void e_AcessarLoginPeloCadastro() {
    createAccountScreen.getLoginLink().click();
  }

  @Override
  public void v_TelaCadastro() {
    // getAttribute -> captura valor da variavel do modelo
    Boolean telefone = Boolean.valueOf(getAttribute("telefone").toString());
    Boolean email = Boolean.valueOf(getAttribute("email").toString());
    PageFactory.initElements(
        new AppiumFieldDecorator(driver, IMPLICITLY_WAIT_TIME_OUT, TimeUnit.SECONDS),
        createAccountScreen);
    assertThat(isElementPresent(createAccountScreen.getLoginLink())).isTrue();
    if (telefone && !email) {
      assertThat(createAccountScreen.getScreenTitle().getAttribute("contentDescription"))
          .contains("Cadastre-se com seu número de celular");
      assertThat(isElementPresent(createAccountScreen.getUseEmailButton())).isTrue();
      assertThat(isElementPresent(createAccountScreen.getContinueButton())).isTrue();
      assertThat(isElementPresent(createAccountScreen.getPhoneField())).isTrue();
      assertThat(createAccountScreen.getContinueButton().getAttribute("contentDescription"))
      .contains("Continuar");
      assertThat(isElementPresent(createAccountScreen.getPhoneTitleText())).isTrue();
    } else if (!telefone && email) {
      assertThat(createAccountScreen.getScreenTitle().getAttribute("contentDescription"))
          .contains("Inscreva-se com seu endereço de e-mail");
      assertThat(isElementPresent(createAccountScreen.getUsePhoneButton())).isTrue();
      assertThat(createAccountScreen.getCreateAccountButton().getAttribute("contentDescription"))
      .contains("Criar sua conta da Amazon");
      assertThat(isElementPresent(createAccountScreen.getCreateAccountButton())).isTrue();
      assertThat(isElementPresent(createAccountScreen.getEmailField())).isTrue();
    } else {
      fail("'email' and 'telefone' variables should not be equal");
    }
  }

  @Override
  public void e_VoltarBoasVindas() {
    driver.navigate().back();
  }

  @Override
  public void v_BoasVindas() {
    PageFactory.initElements(
        new AppiumFieldDecorator(driver, IMPLICITLY_WAIT_TIME_OUT, TimeUnit.SECONDS),
        welcomeScreen);
    // getAttribute -> captura valor da variavel do modelo
    assertThat(Boolean.valueOf(getAttribute("primeiroAcesso").toString())).isTrue();
    // verify buttons
    assertThat(isElementPresent(welcomeScreen.getLoginButton())).isTrue();
    assertThat(isElementPresent(welcomeScreen.getCreateAccountButton())).isTrue();
    assertThat(isElementPresent(welcomeScreen.getSkipLoginButton())).isTrue();
  }

  @Override
  public void e_AcessarCadastro() {
    welcomeScreen.getCreateAccountButton().click();
  }

  @Override
  public void v_TelaLogin() {
    PageFactory.initElements(
        new AppiumFieldDecorator(driver, IMPLICITLY_WAIT_TIME_OUT, TimeUnit.SECONDS), loginScreen);
    assertThat(isElementPresent(loginScreen.getScreenTitle())).isTrue();
    assertThat(isElementPresent(loginScreen.getEmailField())).isTrue();
    assertThat(isElementPresent(loginScreen.getPasswordField())).isTrue();
    assertThat(isElementPresent(loginScreen.getLoginButton())).isTrue();
    assertThat(isElementPresent(loginScreen.getForgotPassword())).isTrue();
    assertThat(isElementPresent(loginScreen.getCreateAccountButton())).isTrue();
  }

  @Override
  public void e_UsarTelefone() {
    createAccountScreen.getUsePhoneButton().click();
  }

  @Override
  public void e_AcessarLogin() {
    welcomeScreen.getLoginButton().click();
  }

  private Boolean isElementPresent(AndroidElement element) {
    try {
      return element.isDisplayed();
    } catch (NoSuchElementException e) {
      e.printStackTrace();
      return false;
    }
  }

}
