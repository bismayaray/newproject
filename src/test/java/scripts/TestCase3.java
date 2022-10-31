package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CorejavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.WishlistPage;

public class TestCase3 extends BaseClass
{
	@Test
	public void tc3() throws IOException, InterruptedException {
	SkillraryLoginPage sl=new SkillraryLoginPage(driver);
	sl.serachtextbox(pdata.getData("serach"));
	sl.serachbutton();
	
	CorejavaPage c=new CorejavaPage(driver);
	c.corejavacourse();
	
	WishlistPage w=new WishlistPage(driver);
	w.closepopup();
	driverutiles.switchFrame(driver);
	
	Thread.sleep(3000);
	w.playbutton();
	Thread.sleep(5000);
	w.pausebtn();
	driverutiles.switchBack(driver);
	w.addtowishlidtbtn();
	}

}
