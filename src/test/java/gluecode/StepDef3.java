package gluecode;

import java.util.List;

import io.cucumber.java.en.Then;
import utility.LinksUtilityClass;

public class StepDef3 {
	public Shared sh;
	public void stepDef3(Shared sh) {
		
		this.sh=sh;
	}
	@Then("identify broken links and display")
	public void method1() throws Exception
	{
		
		sh.lu=new LinksUtilityClass(sh.driver);
		List<String> rs=sh.lu.getbrokenlinks();
		sh.s.log("Count of broken links is"+rs.size());
		for(String r:rs) {
			sh.s.log(r);
		}
	}
}
