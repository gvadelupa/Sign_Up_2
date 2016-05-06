package core;

//BEGIN
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Sign_Up {
	public static void main(String[] args) {

		// WebDriver driver = new HtmlUnitDriver();
		WebDriver driver = new FirefoxDriver();
		String text_case_id_01 = "TC-001.01";
		String text_case_id_02 = "TC-001.02";
		String text_case_id_03 = "TC-001.03";
		String text_case_id_04 = "TC-001.04";
		String text_case_id_05 = "TC-001.05";
		String text_case_id_06 = "TC-001.06";
		String text_case_id_07 = "TC-001.07";
		String text_case_id_08 = "TC-001.08";
		String text_case_id_09 = "TC-001.09";
		String text_case_id_10 = "TC-001.10";
		String text_case_id_11 = "TC-001.11";
		String text_case_id_12 = "TC-001.12";
		String text_case_id_13 = "TC-001.13";

		
		
		
		String url1 = "http://learn2test.net/qa/apps/sign_up/v1/";
		String title_sign_up_expected = "Welcome to Sign Up v1";
		
		String title_facebook_expected = "Facebook - Log In or Sign Up";
		String title_twitter_expected = "Twitter";
		String title_flickr_expected = "Flickr, a Yahoo company | Flickr - Photo Sharing!";
		String title_youtube_expected = "YouTube";
		
		
		String url2 = "http://learn2test.net/qa/apps/sign_up/v1/conformation.php";
		String title_confirmation_page_expected = "Confirmation";
	
				
		
		String fname = "Irina";
		String lname = "Golovko";
		String email = "irenia08@mail.ru";
		String phone = "415 123 4456";
		String gender = "Female";
		String state = "California";
		String checkbox = "checkbox";
		String copyright = "copyright";
		
		
		String title_after_back_button_expected = "Welcome to Sign Up v1";		
		 String copyright_expected = "© 2016 learn2test.net";
		 String copyright_after_submit_button_expected = "© 2016 learn2test.net";
		
		String error_fname_expected = "Please enter First Name";
		String error_lname_expected = "Please enter Last Name";
		String error_email_expected = "Please enter Email Address";
		String error_phone_expected = "Please enter Phone Number";
		
		
	
		

		// TC-001.01 Verification of title

		driver.get(url1);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String title_sign_up_actual = driver.getTitle();

		if (title_sign_up_expected.equals(title_sign_up_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_01
					+ " - PASSED");
			System.out.println("Title Expected/Actual: \t"
					+ title_sign_up_expected + "/" + title_sign_up_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_01
					+ " - FAILED");
			System.out.println("Title Expected/Actual: \t"
					+ title_sign_up_expected + "/" + title_sign_up_actual);
			System.out.println("=======================================");
		}

		// TC-001.02 verification of Facebook link

		driver.findElement(By.id("id_img_facebook")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ArrayList<String> allTabs = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(allTabs.get(1));
		String title_facebook_actual = driver.getTitle();
		driver.close();
		driver.switchTo().window(allTabs.get(0));

		if (title_facebook_expected.equals(title_facebook_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_02
					+ " - PASSED");
			System.out.println("Title Expected/Actual: \t"
					+ title_facebook_expected + "/" + title_facebook_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_02
					+ " - FAILED");
			System.out.println("Title Expected/Actual: \t"
					+ title_facebook_expected + "/" + title_facebook_actual);
			System.out.println("=======================================");
			
		}
		
		
		// TC-001.03 verification of Twitter link

				driver.findElement(By.id("id_img_twitter")).click();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				ArrayList<String> allTabs1 = new ArrayList<String>(
						driver.getWindowHandles());
				driver.switchTo().window(allTabs1.get(1));
				String title_twitter_actual = driver.getTitle();
				driver.close();
				driver.switchTo().window(allTabs1.get(0));

				if (title_twitter_expected.equals(title_twitter_actual)) {
					System.out.println("Test Case ID: \t\t" + text_case_id_03
							+ " - PASSED");
					System.out.println("Title Expected/Actual: \t"
							+ title_twitter_expected + "/" + title_twitter_actual);
					System.out.println("=======================================");
				} else {
					System.out.println("Test Case ID: \t\t" + text_case_id_03
							+ " - FAILED");
					System.out.println("Title Expected/Actual: \t"
							+ title_twitter_expected + "/" + title_twitter_actual);
					System.out.println("=======================================");
					
				}
		
		
				// TC-001.04 verification of Flickr link

				driver.findElement(By.id("id_img_flickr")).click();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				ArrayList<String> allTabs2 = new ArrayList<String>(
						driver.getWindowHandles());
				driver.switchTo().window(allTabs2.get(1));
				String title_flickr_actual = driver.getTitle();
				driver.close();
				driver.switchTo().window(allTabs2.get(0));

				if (title_flickr_expected.equals(title_flickr_actual)) {
					System.out.println("Test Case ID: \t\t" + text_case_id_04
							+ " - PASSED");
					System.out.println("Title Expected/Actual: \t"
							+ title_flickr_expected + "/" + title_flickr_actual);
					System.out.println("=======================================");
				} else {
					System.out.println("Test Case ID: \t\t" + text_case_id_04
							+ " - FAILED");
					System.out.println("Title Expected/Actual: \t"
							+ title_flickr_expected + "/" + title_flickr_actual);
					System.out.println("=======================================");
					
				}

				
				// TC-001.05 verification of YouTube link

				driver.findElement(By.id("id_img_youtube")).click();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				ArrayList<String> allTabs3 = new ArrayList<String>(
						driver.getWindowHandles());
				driver.switchTo().window(allTabs3.get(1));
				String title_youtube_actual = driver.getTitle();
				driver.close();
				driver.switchTo().window(allTabs3.get(0));

				if (title_youtube_expected.equals(title_youtube_actual)) {
					System.out.println("Test Case ID: \t\t" + text_case_id_05
							+ " - PASSED");
					System.out.println("Title Expected/Actual: \t"
							+ title_youtube_expected + "/" + title_youtube_actual);
					System.out.println("=======================================");
				} else {
					System.out.println("Test Case ID: \t\t" + text_case_id_05
							+ " - FAILED");
					System.out.println("Title Expected/Actual: \t"
							+ title_youtube_expected + "/" + title_youtube_actual);
					System.out.println("=======================================");
					
				}
				
				
				
		// TC-001.06 quoutes

		driver.findElement(By.id("id_quotes")).getText();
		String quote = driver.findElement(By.id("id_quotes")).getText();
		if (quote != null && quote.length() < 103 && quote.length() > 36) {
			System.out.println("Test Case ID: \t\t" + text_case_id_06
					+ " - PASSED");
			System.out.println("Quote length: " + quote.length());
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_06
					+ " - FAILED");
			System.out.println("Quote length: " + quote.length());
			System.out.println("=======================================");
		}

		
		// TC-001.07 verify error fist name

		driver.findElement(By.id("id_submit_button")).click();
		String error_fname_actual = driver
				.findElement(By.id("ErrorLine")).getText();

		if (error_fname_expected.equals(error_fname_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_07
					+ " - PASSED");
			System.out.println("Error Expected/Actual: \t"
					+ error_fname_expected + "/"
					+ error_fname_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_07
					+ " - FAILED");
			System.out.println("Error Expected/Actual: \t"
					+ error_fname_expected + "/"
					+ error_fname_actual);
			System.out.println("=======================================");
		}

		// TC-001.08 verify error last name
		
		driver.findElement(By.id("id_fname")).sendKeys(fname);
		driver.findElement(By.id("id_submit_button")).click();
		String error_lname_actual = driver
				.findElement(By.id("ErrorLine")).getText();

		if (error_lname_expected.equals(error_lname_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_08
					+ " - PASSED");
			System.out.println("Error Expected/Actual: \t"
					+ error_lname_expected + "/"
					+ error_lname_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_08
					+ " - FAILED");
			System.out.println("Error Expected/Actual: \t"
					+ error_lname_expected + "/"
					+ error_lname_actual);
			System.out.println("=======================================");
		}

				
		
		// TC-001.09 verify error email 
		
		driver.findElement(By.id("id_lname")).sendKeys(lname);
		driver.findElement(By.id("id_submit_button")).click();
				String error_email_actual = driver
						.findElement(By.id("ErrorLine")).getText();

				if (error_email_expected.equals(error_email_actual)) {
					System.out.println("Test Case ID: \t\t" + text_case_id_09
							+ " - PASSED");
					System.out.println("Error Expected/Actual: \t"
							+ error_email_expected + "/"
							+ error_email_actual);
					System.out.println("=======================================");
				} else {
					System.out.println("Test Case ID: \t\t" + text_case_id_09
							+ " - FAILED");
					System.out.println("Error Expected/Actual: \t"
							+ error_email_expected + "/"
							+ error_email_actual);
					System.out.println("=======================================");
				}
		
		
				// TC-001.10 verify error phone 
				
				driver.findElement(By.id("id_email")).sendKeys(email);
				driver.findElement(By.id("id_submit_button")).click();
						String error_phone_actual = driver
								.findElement(By.id("ErrorLine")).getText();

						if (error_phone_expected.equals(error_phone_actual)) {
							System.out.println("Test Case ID: \t\t" + text_case_id_10
									+ " - PASSED");
							System.out.println("Error Expected/Actual: \t"
									+ error_phone_expected + "/"
									+ error_phone_actual);
							System.out.println("=======================================");
						} else {
							System.out.println("Test Case ID: \t\t" + text_case_id_10
									+ " - FAILED");
							System.out.println("Error Expected/Actual: \t"
									+ error_phone_expected + "/"
									+ error_phone_actual);
							System.out.println("=======================================");
						}
				
				
		// TC-001.11  
		driver.findElement(By.id("id_reset_button")).click();
		driver.findElement(By.id("id_fname")).sendKeys(fname);
		driver.findElement(By.id("id_lname")).sendKeys(lname);
		driver.findElement(By.id("id_email")).sendKeys(email);
		driver.findElement(By.id("id_phone")).sendKeys(phone);
		driver.findElement(By.id("id_state")).sendKeys("CA");
		if (gender.equals("Female")) {
			driver.findElement(By.id("id_g_radio_02")).click();
		} else {
			driver.findElement(By.id("id_g_radio_01")).click();
		}
		driver.findElement(By.id("id_checkbox")).click();
		driver.findElement(By.id("copyright"));
		driver.findElement(By.id("id_submit_button")).click();
		

		String fname_conf_actual = driver.findElement(By.id("id_fname_conf"))
				.getText();
		String lname_conf_actual = driver.findElement(By.id("id_lname_conf"))
				.getText();
		String email_conf_actual = driver.findElement(By.id("id_email_conf"))
				.getText();
		String phone_conf_actual = driver.findElement(By.id("id_phone_conf"))
				.getText();
		String state_conf_actual = driver.findElement(By.id("id_state_conf"))
				.getText();
		String gender_conf_actual = driver.findElement(By.id("id_gender_conf")).getText();
		String copyright_conf_actual = driver.findElement(By.id("copyright")).getText();
		
		if (fname.equals(fname_conf_actual) 
				&& lname.equals(lname_conf_actual)
				&& email.equals(email_conf_actual)
				&& phone.equals(phone_conf_actual)
				&& state.equals(state_conf_actual)
				&& gender.equals(gender_conf_actual)
				&& copyright.equals(copyright))
			
		{
			System.out.println("Test Case ID: \t\t" + text_case_id_11
					+ " - PASSED");
			System.out.println("First Expected/Actual: \t" + fname + "/"
					+ fname_conf_actual);
			System.out.println("Last Expected/Actual: \t" + lname + "/"
					+ lname_conf_actual);
			System.out.println("Email Expected/Actual: \t" + email + "/"
					+ email_conf_actual);
			System.out.println("Phone Expected/Actual: \t" + phone + "/"
					+ phone_conf_actual);
			System.out.println("State Expected/Actual: \t" + state + "/"
					+ state_conf_actual);
			System.out.println("Gender Expected/Actual: \t" + gender + "/"
					+ gender_conf_actual);
			System.out.println("© 2016 learn2test.net");
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_11
					+ " - FAILED");
			System.out.println("First Expected/Actual: \t" + fname + "/"
					+ fname_conf_actual);
			System.out.println("Last Expected/Actual: \t" + lname + "/"
					+ lname_conf_actual);
			System.out.println("Email Expected/Actual: \t" + email + "/"
					+ email_conf_actual);
			System.out.println("Phone Expected/Actual: \t" + phone + "/"
					+ phone_conf_actual);
			System.out.println("State Expected/Actual: \t" + state + "/"
					+ state_conf_actual);
			System.out.println("Gender Expected/Actual: \t" + gender + "/"
					+ gender_conf_actual);
			System.out.println("Copyright is wrong");
			System.out.println("=======================================");
		}
		
		
	
	//TC-001.12 - verify confirmation page
			driver.get(url2);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			String title_confirmation_page_actual = driver.getTitle();
			
			if (title_confirmation_page_expected.equals(title_confirmation_page_actual)) {
				System.out.println("Test Case ID: \t\t" + text_case_id_12
						+ " - PASSED");
				System.out.println("Title Expected/Actual: \t"
						+ title_confirmation_page_expected + "/" + title_confirmation_page_actual);
				System.out.println("=======================================");
			} else {
				System.out.println("Test Case ID: \t\t" + text_case_id_12
						+ " - FAILED");
				System.out.println("Title Expected/Actual: \t"
						+ title_confirmation_page_expected + "/" + title_confirmation_page_actual);
				System.out.println("=======================================");
			}	
			
			//TC-001.13
			
			driver.get(url2);
			driver.findElement(By.id("id_back_button")).click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			String title_after_back_button_actual = driver.getTitle();
			
			if (title_after_back_button_expected.equals(title_sign_up_expected)) {
				System.out.println("Test Case ID: \t\t" + text_case_id_13 + " - PASSED");
				System.out.println("Button 'Back' redirected to main page Sign Up");
				System.out.println("=======================================");
			} else {
				System.out.println("Test Case ID: \t\t" + text_case_id_13 + " - FAILED");
				System.out.println("Button 'Back' didn't redirect to main page, title = " + title_sign_up_expected);
				System.out.println("=======================================");
			}

			
			
			driver.quit();
	}		
			
}
// END