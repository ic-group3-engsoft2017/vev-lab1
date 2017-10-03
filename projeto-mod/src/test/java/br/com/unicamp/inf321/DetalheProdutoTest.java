package br.com.unicamp.inf321;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.assertj.core.api.Assertions;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.stream.file.FileSinkImages;
import org.graphstream.stream.file.FileSinkImages.LayoutPolicy;
import org.graphstream.stream.file.FileSinkImages.OutputType;
import org.graphstream.stream.file.FileSinkImages.RendererType;
import org.graphstream.stream.file.FileSinkImages.Resolutions;
import org.graphstream.ui.view.Viewer;
import org.graphwalker.core.condition.EdgeCoverage;
import org.graphwalker.core.condition.ReachedEdge;
import org.graphwalker.core.condition.ReachedVertex;
import org.graphwalker.core.condition.TimeDuration;
import org.graphwalker.core.event.Observer;
import org.graphwalker.core.generator.AStarPath;
import org.graphwalker.core.generator.CombinedPath;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.java.test.Result;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import br.com.unicamp.inf321.helper.GraphWalkerTestBuilder;
import br.com.unicamp.inf321.models.AmazonShoppingOfertasModel;
import br.com.unicamp.inf321.observers.GraphStreamObserver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DetalheProdutoTest {

	
	public final static Path MODEL_PATH =
		      Paths.get("/br/com/unicamp/inf321/AmazonShoppingOfertas.graphml");
		  private static AndroidDriver<MobileElement> driver;
		  @Rule
		  public TestName testName = new TestName();
		  private Observer observer;
		  private Graph graph;
		  private Viewer viewer;
	
	public DetalheProdutoTest() {
		
	}
	
	  public static void setup() {
		    // seta os capabilities do android driver
		    DesiredCapabilities capabilities = new DesiredCapabilities();
		    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto");
		    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
		    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		    capabilities.setCapability(MobileCapabilityType.APP, "/root/tmp/AmazonShoppingOfertas.apk");
		    capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,
		        "com.amazon.mShop.android.shopping");
		    capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
		        "com.amazon.mShop.splashscreen.StartupActivity");
		    capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "120");
		    capabilities.setCapability(MobileCapabilityType.TAKES_SCREENSHOT, "true");
		    try {
		      driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		    } catch (MalformedURLException e) {
		      e.printStackTrace();
		    }
		    driver.rotate(ScreenOrientation.PORTRAIT); // rotaciona tela
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  }

		  @AfterClass
		  public static void tearDown() {
		    //driver.quit();
		  }

		  @Test
		  public void runSmokeTest() {
		   
		  }

		  @Test
		  public void runStabilityTest() {
		  
		  }

		  @Test
		  public void runFunctionalTest() {
		   
		  }

	

}
