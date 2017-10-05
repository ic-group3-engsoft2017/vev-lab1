package br.com.unicamp.inf321.gr3;

import br.com.unicamp.inf321.models.AmazonShoppingOfertasModel;
import br.com.unicamp.inf321.models.screenobjects.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.graphwalker.java.annotation.GraphWalker;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.StrictAssertions.assertThat;

@GraphWalker(value = "random(edge_coverage(100))", start = "v_ClientNotRunning")
public class Lab1Grupo3CompletoImpl implements Lab1Grupo3Completo {
    public static final int IMPLICITLY_WAIT_TIME_OUT = 20;
    private AndroidDriver<MobileElement> driver;
    private WelcomeScreen welcomeScreen;
    private LoginScreen loginScreen;
    private ForgotPasswordScreen forgotPasswordScreen;
    private CreateAccountScreen createAccountScreen;
    private CartScreen cartScreen;

    public Lab1Grupo3CompletoImpl(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        this.welcomeScreen = new WelcomeScreen();
        this.loginScreen = new LoginScreen();
        this.forgotPasswordScreen = new ForgotPasswordScreen();
        this.createAccountScreen = new CreateAccountScreen();
    }

    @Override
    public void v_ClientNotRunning() {
        if (!driver.isLocked()) {
            driver.launchApp();
        }
        PageFactory.initElements(
                new AppiumFieldDecorator(driver, IMPLICITLY_WAIT_TIME_OUT, TimeUnit.SECONDS), welcomeScreen);
        assertThat(isElementPresent(welcomeScreen.getLoginButton())).isTrue();
        assertThat(isElementPresent(welcomeScreen.getCreateAccountButton())).isTrue();
        assertThat(isElementPresent(welcomeScreen.getSkipLoginButton())).isTrue();
    }

    @Override
    public void v_TelaCriarConta() {
        PageFactory.initElements(
                new AppiumFieldDecorator(driver, IMPLICITLY_WAIT_TIME_OUT, TimeUnit.SECONDS), createAccountScreen);
        assertThat(isElementPresent(createAccountScreen.getContinueButton())).isTrue();
        assertThat(isElementPresent(createAccountScreen.getCreateAccountButton())).isTrue();
    }

    @Override
    public void e_back() {
        driver.navigate().back();
    }

    @Override
    public void v_FinalizarPedido() {
        if(!cartScreen.getProductList().isDisplayed()) {
            PageFactory.initElements(
                    new AppiumFieldDecorator(driver, IMPLICITLY_WAIT_TIME_OUT, TimeUnit.SECONDS), cartScreen);
        }
        cartScreen.getPlaceOrder().click();

    }

    @Override
    public void e_pesquisar_palavra_chave() {
        welcomeScreen.getSearchBar().click();
        welcomeScreen.getSearchBar().replaceValue("Sony X");
        welcomeScreen.getSearchButton().click();
    }

    @Override
    public void e_opcao_criar() {
        welcomeScreen.getCreateAccountButton().click();
    }

    @Override
    public void e_Adicionar_no_carrinho() {
        // Não tem botão de adicionar no carrinho mais, parece que foi removido do app.
    }

    @Override
    public void e_detalhar_Produto() {

    }

    @Override
    public void V_Tela_Home() {

    }

    @Override
    public void v_BoasVindasNovaConta() {

    }

    @Override
    public void V_Tela_de_detalhe_de_produto() {

    }

    @Override
    public void v_Tela_de_detalhe_de_produto() {

    }

    @Override
    public void e_tipo_conta() {

    }

    @Override
    public void v_TelaBoasVindasContaExistente() {

    }

    @Override
    public void e_pesquisar_mais_de_uma_palavra_chave() {

    }

    @Override
    public void v_TelaRecuperarSenha() {

    }

    @Override
    public void V_Tela_Resultado_Pesquisa() {

    }

    @Override
    public void v_TelaEscolhaOpcao() {

    }

    @Override
    public void V_Tela_PopUp() {
        // ?
    }

    @Override
    public void v_Tela_de_carrinho() {
        PageFactory.initElements(
                new AppiumFieldDecorator(driver, IMPLICITLY_WAIT_TIME_OUT, TimeUnit.SECONDS),
                cartScreen);
        assertThat(isElementPresent(cartScreen.getEmptyCartText())).isTrue();
        assertThat(isElementPresent(cartScreen.getPlaceOrder())).isTrue();
        assertThat(isElementPresent(cartScreen.getProductList())).isTrue();
        assertThat(isElementPresent(cartScreen.getScreenTitle())).isTrue();
        assertThat(isElementPresent(cartScreen.getSearchButton())).isTrue();
    }

    @Override
    public void v_Foto_navegada() {
        // ?
    }

    @Override
    public void e_opcao_logar() {
        welcomeScreen.getLoginButton().click();
    }

    @Override
    public void e_boasVindas() {
        // ?
    }

    @Override
    public void v_Tela_de_Pedido() {
        // ?
    }

    @Override
    public void e_Navegar_foto() {
        // ?
    }

    @Override
    public void e_Exit() {
        driver.closeApp();
    }

    @Override
    public void e_Comprar_na_hora() {
        // Criar Screen de Compra de produto

    }

    @Override
    public void e_Logar() {
        AmazonShoppingOfertasModel.loginScreen(loginScreen, driver);
    }

    @Override
    public void e_fecharTelaDetalhamento() {
        driver.navigate().back();
    }

    @Override
    public void e_Home() {
        driver.navigate().to("home");
    }

    @Override
    public void e_FecharCompra() {
        cartScreen.getPlaceOrder().click();
    }

    @Override
    public void e_opcao() {
        //?
    }

    @Override
    public void e_pesquisar_uma_palavra_chave() {
        //?
    }

    @Override
    public void e_pesquisar_vazio() {
        cartScreen.getSearchButton().click();
    }

    @Override
    public void e_opcao_esq() {
        // ?
    }

    @Override
    public void v_TelaLogin() {
        AmazonShoppingOfertasModel.loginScreen(loginScreen, driver);
    }

    @Override
    public void v_TelaPrincipal() {
        PageFactory.initElements(
                new AppiumFieldDecorator(driver, IMPLICITLY_WAIT_TIME_OUT, TimeUnit.SECONDS), welcomeScreen);
        assertThat(isElementPresent(welcomeScreen.getLoginButton())).isTrue();
        assertThat(isElementPresent(welcomeScreen.getCreateAccountButton())).isTrue();
        assertThat(isElementPresent(welcomeScreen.getSkipLoginButton())).isTrue();
    }

    @Override
    public void e_opcao_entrar() {
        // ?
    }

    @Override
    public void e_voltar_Tela_Home() {
        // ?
    }

    @Override
    public void e_segue() {
        // ?
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

