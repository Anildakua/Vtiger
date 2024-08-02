package POM;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;


public class dwsHomePagePOM {
	

		public dwsHomePagePOM(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		
		
		private @FindBy(xpath = "//a/img[@alt='Tricentis Demo Web Shop']")
		WebElement Images;
		
		private @FindBy(className = "ico-register")
		WebElement register;
		
		private @FindBy(className = "ico-login")
		WebElement login_link;
		
		private @FindBy(partialLinkText = "Shopping cart")
		WebElement Shopping_cart;
		
		private @FindBy(className = "Wishlist")
		WebElement Wishlist;
		
		private @FindBy(id = "small-searchterms")
		WebElement Search_bar;
		
		private @FindBy(className = "button-1 search-box-button")
		WebElement Search_button;
		
		private @FindBy(partialLinkText = "Books")
		WebElement Book_link;
		
		private @FindBy(partialLinkText = "Computers")
		WebElement Computers_link;
		
		private @FindBy(partialLinkText = "Electronics")
		WebElement Electronics_link;
		
		private @FindBy(partialLinkText = "Apparel & Shoes")
		WebElement Apparel_Shoes_link;
		
		private @FindBy(partialLinkText = "Digital downloads")
		WebElement Digital_downloads_link;
		
		private @FindBy(partialLinkText = "Gift Cards")
		WebElement Gift_Cards_link;
		
		private @FindBy(id = "newsletter-email")
		WebElement newsletter_email_link;
		
		private @FindBy(id = "pollanswers-1")
		WebElement Excellence_link;
		
		private @FindBy(id = "pollanswers-2")
		WebElement Good_link;
		
		private @FindBy(id = "pollanswers-3")
		WebElement Poor_link;
		
		private @FindBy(id = "pollanswers-4")
		WebElement Very_bad_link;
		
		private @FindBy(id = "vote-poll-1")
		WebElement Vote_poll_link;
		
		
		public void Images(){
			Images.click();
		}
		
		public void register() {
			register.click();;
		}
		
		public void login_link() {
			login_link.click();
		}
		
		public void Shopping_cart() {
			Shopping_cart.click();
		}
		
		public void Wishlist() {
			Wishlist.click();
		}
		
		public void Search_bar() {
			Search_bar.click();
		}
		
		public void Search_button() {
			Search_button.click();
		}
		
		public void Book_link() {
			Book_link.click();
		}
		
		public void Computers_link() {
			Computers_link.click();
		}
		
		public void Electronics_linkt() {
			Electronics_link.click();
		}
		
		public void Apparel_Shoes_link() {
			Apparel_Shoes_link.click();
		}
		 
		public void Digital_downloads_link() {
			Digital_downloads_link.click();
		}
		
		public void Gift_Cards_link() {
			Gift_Cards_link.click();
		}
		
		public void newsletter_email_link() {
			newsletter_email_link.click();
		}
		
		public void Excellence_link() {
			Excellence_link.click();
		}
		
		public void Good_link() {
			Excellence_link.click();
		}
		
		public void Poor_link() {
			Poor_link.click();
		}
		
		public void Very_bad_link() {
			Very_bad_link.click();
		}
		
		public void Vote_poll_link() {
			Vote_poll_link.click();
		}

}
