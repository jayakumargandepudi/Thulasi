package com.telus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void registerDemo() {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);
		driver.manage().window().maximize();

		// Naming convention of each variables

		String firstNameValue = "Thulasi";
		String lastNameValue = "Reddy";
		String streetAddressValue = "Banaganapalli, Kurnool, Andhrapradesh";
		String aptNoValue = "4-56/2";
		String stateValue = "Andhra Pradesh";
		String cityValue = "Banaganapalli";
		String pinCoddValue = "518124";
		String countryValue = "India";
		String emailIDValue = "pavankumarreddy418@gmail.com";
		String dateOfDemoValue = "01/01/2023";
		String hhValue = "07";
		String mmValue = "30";
		String mobileNumberValue = "7416410620";
		String enterYourQueryValue = " No Query's as per Now! Thank's";
		String expectedTitle = "NxtGen A.I Academy – Learn With Clarity";
		String expectedHeading = "Register For Demo";
		String expectedSuccessfullMsg = "Registration Form is Successfully Submitted.";

		// title

		String actualtitle = driver.getTitle();

		if (actualtitle.equals(expectedTitle)) {
			System.out.println("The Actual Title is equals to Expected Title ");
			System.out.println("The Actual Title is :" + actualtitle);
		} else {
			System.out.println("The Actual Title is not equals to Expected Title");
			System.out.println("The Actual Title  is :" + actualtitle);
			System.out.println("The Expected Title is :" + expectedTitle);
		}

		// mousehover
		Actions action = new Actions(driver);

		WebElement qaAutomation = driver.findElement(By.linkText("Demo Sites"));
		action.moveToElement(qaAutomation).perform();

		WebElement practiceAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(practiceAutomation).perform();

		WebElement registrationFormDemo = driver.findElement(By.partialLinkText("Registration Form"));
		action.moveToElement(registrationFormDemo).perform();
		registrationFormDemo.click();

		// heading

		WebElement actualHeadingValue = driver.findElement(By.xpath("//*[@id=\"item-vfb-1\"]/div/h3"));
		String actualHeading = actualHeadingValue.getText();

		if (actualHeadingValue.isDisplayed()) {
			System.out.println("The Heading of the form is Displayed");
			System.out.println("The Heading of the form is :" + actualHeading);
		} else {
			System.out.println("The Heading of the form is not Displayed");
			System.out.println("The Actual Heading is Disaplay " + actualHeading);
			System.out.println("The Expected Heading is Disaplay " + expectedHeading);
		}

		// firstName
		WebElement firstName = driver.findElement(By.id("vfb-5"));

		// Verify the First name is Displayed
		if (firstName.isDisplayed()) {
			System.out.println("First Name is Displayed");

		} else {
			System.out.println("First Name is not Displayed");
		}

		// Verify the First name isEnabled
		if (firstName.isEnabled()) {
			System.out.println("The First Name field is Enabled");
			firstName.sendKeys(firstNameValue);
			System.out.println("First Name is :" + firstNameValue);
		} else {
			System.out.println("The First Name field is not Enabled");
		}

		// lastName
		WebElement lastName = driver.findElement(By.id("vfb-7"));

		// Verify the Last name is Displayed
		if (lastName.isDisplayed()) {
			System.out.println("Last Name is Displayed");

		} else {
			System.out.println("Last Name is not Displayed");
		}

		// Verify the Last name isEnabled
		if (lastName.isEnabled()) {
			System.out.println("The Last Name field is Enabled");
			lastName.sendKeys(lastNameValue);
			System.out.println("Last Name is :" + lastNameValue);
		} else {
			System.out.println("The Last Name field is not Enabled");
		}

		// Gender

		WebElement gender = driver.findElement(By.id("vfb-31-1"));

		// Verify the Gender Name is Displayed
		if (gender.isDisplayed()) {
			System.out.println("Gender is Displayed");

		} else {
			System.out.println("Gender is not Displayed");
		}

		// Verify the Gender Name isEnabled
		if (gender.isEnabled()) {
			System.out.println("The Gender field is Enabled");

			// Verify the Gender Name isSelected
			if (gender.isSelected()) {
				System.out.println("The Gender field is not Selected");
			} else {
				System.out.println("The Gender field is Selected");
				gender.click();
				WebElement genderSelected = driver.findElement(By.xpath("//label[@for='vfb-31-1']"));
				String genderMale = genderSelected.getText();
				System.out.println("The Gender Selected is :" + genderMale);
			}

		} else {
			System.out.println("The Gender field is not Enabled");
		}

		// Address
		WebElement streetAddress = driver.findElement(By.id("vfb-13-address"));

		// Verify the Address is Displayed
		if (streetAddress.isDisplayed()) {
			System.out.println("Address is Displayed");

		} else {
			System.out.println("Address is not Displayed");
		}

		// Verify the Address isEnabled
		if (streetAddress.isEnabled()) {
			System.out.println("The Address field is Enabled");
			streetAddress.sendKeys(streetAddressValue);
			System.out.println("The Address is :" + streetAddressValue);

		} else {
			System.out.println("The Address field is not Enabled");
		}

		WebElement aptNo = driver.findElement(By.id("vfb-13-address-2"));
		aptNo.sendKeys(aptNoValue);

		// Verify the AptNo is Displayed
		if (aptNo.isDisplayed()) {
			System.out.println("AptNo is Displayed");

		} else {
			System.out.println("AptNo is not Displayed");
		}

		// Verify the AptNo isEnabled
		if (aptNo.isEnabled()) {
			System.out.println("The AptNo field is Enabled");
			aptNo.sendKeys(aptNoValue);
			System.out.println("The AptNo is :" + aptNoValue);

		} else {
			System.out.println("The AptNo field is not Enabled");
		}

		WebElement city = driver.findElement(By.id("vfb-13-city"));

		// Verify the City is Displayed
		if (city.isDisplayed()) {
			System.out.println("City is Displayed");

		} else {
			System.out.println("City is not Displayed");
		}

		// Verify the City isEnabled
		if (city.isEnabled()) {
			System.out.println("The City field is Enabled");
			city.sendKeys(cityValue);
			System.out.println("The City is :" + cityValue);

		} else {
			System.out.println("The City field is not Enabled");
		}

		WebElement sate = driver.findElement(By.id("vfb-13-state"));

		// Verify the State is Displayed
		if (sate.isDisplayed()) {
			System.out.println("State is Displayed");

		} else {
			System.out.println("State is not Displayed");
		}

		// Verify the State isEnabled
		if (sate.isEnabled()) {
			System.out.println("The State field is Enabled");
			sate.sendKeys(stateValue);
			System.out.println("The State is :" + stateValue);

		} else {
			System.out.println("The State field is not Enabled");
		}

		WebElement pinCode = driver.findElement(By.id("vfb-13-zip"));

		// Verify the Pin Code is Displayed
		if (pinCode.isDisplayed()) {
			System.out.println("PinCode is Displayed");

		} else {
			System.out.println("PinCode is not Displayed");
		}

		// Verify the Pin Code isEnabled
		if (pinCode.isEnabled()) {
			System.out.println("The PinCode field is Enabled");
			pinCode.sendKeys(pinCoddValue);
			System.out.println("The PinCode is :" + pinCoddValue);

		} else {
			System.out.println("The PinCode field is not Enabled");
		}

		WebElement country = driver.findElement(By.id("vfb-13-country"));

		// Verify the Country is Displayed

		if (country.isDisplayed()) {
			System.out.println("Country is Displayed");

		} else {
			System.out.println("Country is not Displayed");
		}

		// Verify the Country isEnabled
		if (country.isEnabled()) {
			System.out.println("The Country field is Enabled");

			// Verify the Country isSelected
			if (country.isSelected()) {
				System.out.println("The Country field is not Selected");
			} else {
				System.out.println("The Country field is Selected");
				Select countryDD = new Select(country);
				countryDD.selectByValue(countryValue);

				System.out.println("The Country Selected is :" + countryValue);
			}

		} else {
			System.out.println("The Country field is not Enabled");
		}

		// Email
		WebElement email = driver.findElement(By.id("vfb-14"));

		// Verify the Email is Displayed
		if (email.isDisplayed()) {
			System.out.println("Email is Displayed");

		} else {
			System.out.println("Email is not Displayed");
		}

		// Verify the Email isEnabled
		if (email.isEnabled()) {
			System.out.println("The Email field is Enabled");
			email.sendKeys(emailIDValue);

			System.out.println("The EmailID is :" + emailIDValue);

		} else {
			System.out.println("The EmailID field is not Enabled");
		}

		// Date of demo
		WebElement dateOfDemo = driver.findElement(By.id("vfb-18"));

		// Verify the Date of Demo is Displayed
		if (dateOfDemo.isDisplayed()) {
			System.out.println("DateOfDemo is Displayed");

		} else {
			System.out.println("DateOfDemo is not Displayed");
		}

		// Verify the Date of Demo isEnabled
		if (dateOfDemo.isEnabled()) {
			System.out.println("The DateOfDemo field is Enabled");
			dateOfDemo.sendKeys(dateOfDemoValue);

			System.out.println("The DateOfDemo is :" + dateOfDemoValue);

		} else {
			System.out.println("The DateOfDemo field is not Enabled");
		}

		// Convenient Time
		WebElement convenientTimeHours = driver.findElement(By.id("vfb-16-hour"));
		// Verify the Convenient Time is Displayed
		if (convenientTimeHours.isDisplayed()) {
			System.out.println("ConvenientTimeHours and Minutes is Displayed");

		} else {
			System.out.println("ConvenientTimeHours and Minutes is not Displayed");
		}

		// Verify the Convenient Time isEnabled
		if (dateOfDemo.isEnabled()) {
			System.out.println("The ConvenientTimeHours and Minutes field is Enabled");

			// Verify the Convenient Time isSelected
			if (dateOfDemo.isSelected()) {
				System.out.println("The ConvenientTimeHours and Minutes field is not Selected");
			} else {
				System.out.println("The ConvenientTimeHours and Minutes field is Selected");
				Select hours = new Select(convenientTimeHours);
				hours.selectByValue(hhValue);

				WebElement convenientTimeMinutes = driver.findElement(By.id("vfb-16-min"));

				Select minutes = new Select(convenientTimeMinutes);
				minutes.selectByValue(mmValue);

				System.out.println("The ConvenientTimeHours and Minutes is " + hhValue + ":" + mmValue);
			}

		} else {
			System.out.println("The ConvenientTimeHours and Minutes field is not Enabled");
		}

		// Mobile Number

		WebElement mobileNumber = driver.findElement(By.id("vfb-19"));

		// Verify the Mobile is Displayed

		if (mobileNumber.isDisplayed()) {
			System.out.println("MobileNumber is Displayed");

		} else {
			System.out.println("MobileNumber is not Displayed");
		}

		// Verify the Mobile is Enabled
		if (mobileNumber.isEnabled()) {
			System.out.println("The MobileNumber field is Enabled");
			mobileNumber.sendKeys(mobileNumberValue);

			System.out.println("The MobileNumber is :" + mobileNumberValue);

		} else {
			System.out.println("The MobileNumber field is not Enabled");
		}

		// Course Interested

		WebElement cousreInterested1 = driver.findElement(By.id("vfb-20-1"));

		WebElement cousreInterested2 = driver.findElement(By.id("vfb-20-2"));

		// Verify the Course Interested is Displayed

		if (cousreInterested1.isDisplayed()) {
			System.out.println("CousreInterested is Displayed");

		} else {
			System.out.println("CousreInterested is not Displayed");
		}

		// Verify the Course Interested is Enabled
		if (cousreInterested1.isEnabled()) {
			System.out.println("The CousreInterested field is Enabled");

			// Verify the Course Interested is Selected
			if (cousreInterested1.isSelected()) {
				System.out.println("The CousreInterested field is not Selected");
			} else {
				System.out.println("The CousreInterested field is Selected");
				cousreInterested2.click();
				cousreInterested1.click();
				WebElement course1 = driver.findElement(By.xpath("//*[@id=\"item-vfb-20\"]/div/span[2]/label"));
				String courseSelected1 = course1.getText();
				WebElement course2 = driver.findElement(By.xpath("//*[@id=\"item-vfb-20\"]/div/span[3]/label"));
				String courseSelected2 = course2.getText();
				System.out.println("The Courses Interested  is :" + courseSelected1 + " and " + courseSelected2);
			}
		} else {
			System.out.println("The CousreInterested field is not Enabled");
		}

		// Enter your query
		WebElement enterYourQuery = driver.findElement(By.id("vfb-23"));

		// Verify the Enter your query is Displayed

		if (enterYourQuery.isDisplayed()) {
			System.out.println("EnterYourQuery is Displayed");

		} else {
			System.out.println("EnterYourQuery is not Displayed");
		}

		// Verify the Enter your query is Enabled
		if (enterYourQuery.isEnabled()) {
			System.out.println("The EnterYourQuery field is Enabled");
			enterYourQuery.sendKeys(enterYourQueryValue);

			System.out.println("The EnterYourQuery is :" + enterYourQueryValue);

		} else {
			System.out.println("The EnterYourQuery field is not Enabled");
		}

		// Verification
		WebElement verificationCode = driver.findElement(By.xpath("//*[@id=\"item-vfb-2\"]/ul/li[1]/span/label"));

		// Verify the Verification is Displayed
		if (verificationCode.isDisplayed()) {
			System.out.println("VerificationCode is Displayed");

		} else {
			System.out.println("VerificationCode is not Displayed");
		}

		// Verify the Verification is Enabled
		if (verificationCode.isEnabled()) {
			System.out.println("The VerificationCode field is Enabled");
			String example = verificationCode.getText();
			String[] twoDigits = example.split(":");
			WebElement verification = driver.findElement(By.id("vfb-3"));
			String code = twoDigits[1].trim();
			verification.sendKeys(code);
			System.out.println("The VerificationCode is :" + code);

		} else {
			System.out.println("The VerificationCode field is not Enabled");
		}

		// Submit Button
		WebElement submiteButton = driver.findElement(By.id("vfb-4"));

		// Verify the Submit Button is Displayed

		if (submiteButton.isDisplayed()) {
			System.out.println("SubmiteButton is Displayed");

		} else {
			System.out.println("SubmiteButton is not Displayed");
		}

		// Verify the Submit Button is Enabled

		if (submiteButton.isEnabled()) {
			System.out.println("The Submite Button is Enabled");
			submiteButton.click();
		} else {
			System.out.println("The Submite Button is not Enabled");
		}

		// output comparession

		WebElement acutalOutput = driver
				.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/div/div/div/div/div/div"));
		String acutalMsg = acutalOutput.getText();

		// Verify the Registration Form is Displayed

		if (acutalOutput.isDisplayed()) {
			System.out.println("The Registration Form is Successfully is Displayed");

			if (acutalMsg.contains(expectedSuccessfullMsg)) {
				System.out.println("The Registration Form is Successfully Submitted");
			} else {
				System.out.println("The Registration Form is not Successfully Submitted");
			}

		} else {
			System.out.println("The Registration Form is Successfully is not Displayed");
		}

		// Close the application
		driver.close();

	}

}
