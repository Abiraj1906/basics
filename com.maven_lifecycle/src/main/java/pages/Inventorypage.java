package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.waitutills;

public class Inventorypage {
	private WebDriver driver;
	
	//constructor
	public  Inventorypage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
		//locators for inventory page
		@FindBy(linkText = "Inventory")
		private	WebElement inventorymenu;
		
		@FindBy(xpath="//button[@id='filterBtn']")
		private	WebElement advancefilter;
		
		@FindBy(xpath = "//select[@class='form-control form-select']")
		private	WebElement status;
		
		@FindBy(how=How.XPATH, using =  "//button[@id='apply-filter']")
		private	WebElement confirm;
		
		@FindBy(linkText = "Add an item")
		private	WebElement additemmenu;
		
		@FindBy(id="item_search_ean_ean")
		private	WebElement addean;
	
		@FindBy(id="item_search_ean_save")
		private WebElement saveean;
	//sku creation
	@FindBy(id="listing_obo_itemCondition")
	private	WebElement itemcondition;
	
	@FindBy(id="listing_obo_sku")
	private WebElement sku;
	
	//@FindBy(id="listing_obo_productReference")
	//WebElement EAN;
	
	@FindBy(id="listing_obo_quantity")
	private	WebElement quantity;
	
	@FindBy(id="listing_obo_itemNote")
	private	WebElement itemNote;
	
	@FindBy(id="listing_obo_wishedPriceAmount")
	private	WebElement wp;
	
	@FindBy(id="listing_obo_bottomLimitPriceAmount")
	private	WebElement blp;
	
	@FindBy(id="listing_obo_logisticWeight")
	WebElement Logistic_weight;
	
	
	@FindBy(how=How.XPATH, using = "//a[@data-role='listing-marketplace-link']")
	private	WebElement LCF;
	
	
	//Allegro
	
	@FindBy(linkText = "Allegro PL")
	WebElement allegro_mkp;
	
	@FindBy(id="listing_marketplace_locale_188_listingCommonFields_wishedPrice")
	WebElement allegro_price;
	
	
	
	//AZ_AU
	@FindBy(linkText = "Amazon AU")
	WebElement az_au;
	
	@FindBy(id="listing_marketplace_locale_138_listingCommonFields_wishedPrice")
	WebElement au_top_price;
	
	@FindBy(id="listing_marketplace_locale_138_listingCommonFields_shipmentOrigin")
	WebElement au_shipment_country;
	
	//AZ_BE
	@FindBy(linkText = "Amazon BE")
	WebElement az_be;
	
	@FindBy(id="listing_marketplace_locale_183_listingCommonFields_shipmentOrigin")
	WebElement be_shipment_country;
	
	//AZ-CA
	@FindBy(linkText = "Amazon CA")
	WebElement az_ca;
	
	@FindBy(id="listing_marketplace_locale_111_listingCommonFields_wishedPrice")
	WebElement ca_top_price;
	
	@FindBy(id="listing_marketplace_locale_111_listingCommonFields_shipmentOrigin")
	WebElement ca_shipment_country;
	
	
	//AZ_DE
	
	@FindBy(linkText = "Amazon DE")
	WebElement az_de;
	
	@FindBy(id="listing_marketplace_locale_12_listingCommonFields_shipmentOrigin")
	WebElement de_shipment_country;
	
	//AZ_ES
	@FindBy(linkText = "Amazon ES")
	WebElement az_es;
	
	@FindBy(id="listing_marketplace_locale_30_listingCommonFields_shipmentOrigin")
	WebElement es_shipment_country;
	
	
		//Amazon FR
	
	@FindBy(linkText = "Amazon FR")
	WebElement az_fr;
	
		@FindBy(id="listing_marketplace_locale_10_listingCommonFields_shipmentOrigin")
		private	WebElement fr_shipment_country;
		
		//AZ_GB
		@FindBy(linkText = "Amazon GB")
	private	WebElement az_gb;
		
		@FindBy(id="listing_marketplace_locale_13_listingCommonFields_wishedPrice")
		WebElement gb_top_price;
		
		@FindBy(id="listing_marketplace_locale_13_listingCommonFields_shipmentOrigin")
		WebElement gb_shipment_country;
		
		//AZ_IE
		
		@FindBy(linkText = "Amazon IE")
		private	WebElement az_ie;
		
		@FindBy(id="listing_marketplace_locale_217_listingCommonFields_shipmentOrigin")
		WebElement ie_shipment_country;
		
		//AZ_IN 
		
		@FindBy(linkText = "Amazon IN")
		WebElement az_in;
		
		@FindBy(id="listing_marketplace_locale_139_listingCommonFields_wishedPrice")
		WebElement in_top_price;
		
		@FindBy(id="listing_marketplace_locale_139_listingCommonFields_shipmentOrigin")
		WebElement in_shipment_country;
		
	//	AZ_IT
		 
		
		@FindBy(linkText = "Amazon IT")
		private	WebElement az_it;
		
		@FindBy(id="listing_marketplace_locale_28_listingCommonFields_shipmentOrigin")
		WebElement it_shipment_country;
		
		//AZ_JP
		
		@FindBy(linkText = "Amazon JP")
		WebElement az_jp;
		
		@FindBy(id="listing_marketplace_locale_137_listingCommonFields_wishedPrice")
		WebElement jp_top_price;
		
		@FindBy(id="listing_marketplace_locale_137_listingCommonFields_shipmentOrigin")
		WebElement jp_shipment_country;
		
		//AZ_MX
		
		@FindBy(linkText = "Amazon MX")
		WebElement az_mx;
		
		@FindBy(id="listing_marketplace_locale_110_listingCommonFields_wishedPrice")
		WebElement mx_top_price;
		
		@FindBy(id="listing_marketplace_locale_110_listingCommonFields_shipmentOrigin")
		WebElement mx_shipment_country;
		
		//AZ_NL
		@FindBy(linkText = "Amazon NL")
		private	WebElement az_nl;
		
		@FindBy(id="listing_marketplace_locale_64_listingCommonFields_shipmentOrigin")
		WebElement nl_shipment_country;
		
		//az_pl
		@FindBy(linkText = "Amazon PL")
		private WebElement az_pl;
		
		@FindBy(id="listing_marketplace_locale_76_listingCommonFields_wishedPrice")
		private WebElement pl_top_price;
			
		@FindBy(id="listing_marketplace_locale_76_listingCommonFields_shipmentOrigin")
		private WebElement pl_shipment_country;
		
		
		//AZ_SA
		
		@FindBy(linkText = "Amazon SA")
		private WebElement az_sa;
		
		@FindBy(id="listing_marketplace_locale_75_listingCommonFields_wishedPrice")
		private WebElement sa_top_price;
			
		@FindBy(id="listing_marketplace_locale_75_listingCommonFields_shipmentOrigin")
		private WebElement sa_shipment_country;
			
		//az_se
		@FindBy(linkText = "Amazon SE")
		private WebElement az_se;
		
		@FindBy(id="listing_marketplace_locale_74_listingCommonFields_wishedPrice")
		private WebElement se_top_price;
		
		@FindBy(id="listing_marketplace_locale_74_listingCommonFields_shipmentOrigin")
		private WebElement se_shipment_country; 
	
		//AZ_SG
		@FindBy(linkText = "Amazon SG")
		private WebElement az_sg;
		
		@FindBy(id="listing_marketplace_locale_136_listingCommonFields_wishedPrice")
		private WebElement sg_top_price;
		
		@FindBy(id="listing_marketplace_locale_136_listingCommonFields_shipmentOrigin")
		private WebElement sg_shipment_country; 
		
		
		//az_tr
		@FindBy(linkText = "Amazon TR")
		private WebElement az_tr;
			
		@FindBy(id="listing_marketplace_locale_73_listingCommonFields_wishedPrice")
		private WebElement tr_top_price;		
	
		@FindBy(id="listing_marketplace_locale_73_listingCommonFields_shipmentOrigin")
		private WebElement tr_shipment_country;
		
		//AZ_US
		
		@FindBy(linkText = "Amazon US")
		private WebElement az_us;
			
		@FindBy(id="listing_marketplace_locale_112_listingCommonFields_wishedPrice")
		private WebElement us_top_price;		
	
		@FindBy(id="listing_marketplace_locale_112_listingCommonFields_shipmentOrigin")
		private WebElement us_shipment_country;
		
		//Animalis
		@FindBy(linkText = "Animalis")
		WebElement animalis_mkp;
		
		@FindBy(id="listing_marketplace_locale_101_listingCommonFields_wishedPrice")
		WebElement animalis_top_price;
		
		@FindBy(id="listing_marketplace_locale_101_listingCommonFields_leadtimeToShip")
		WebElement animalis_leadtime_to_ship;
		
		//Atlas4men
		@FindBy(linkText = "Atlas4men")
       WebElement atlas4men_mkp;
		
		@FindBy(id="listing_marketplace_locale_49_listingCommonFields_wishedPrice")
		WebElement atlas4men_top_price;
		
		@FindBy(id="listing_marketplace_locale_49_listingCommonFields_leadtimeToShip")
		WebElement atlas4men_leadtime_to_ship;
		
		//BHV
		@FindBy(linkText = "BHV")
		WebElement bhv_mkp;
		
		@FindBy(id="listing_marketplace_locale_103_listingCommonFields_wishedPrice")
		WebElement bhv_top_price;
		
		@FindBy(id="listing_marketplace_locale_103_listingCommonFields_leadtimeToShip")
		WebElement bhv_leadtime_to_ship;
		
		@FindBy(id="listing_marketplace_locale_103_listingCommonFields_logisticClass")
		WebElement bhv_logistic_class;
		
		
		//BM
		@FindBy(linkText = "BackMarket")
		WebElement bm_mkp;
		
		@FindBy(name = "listing_marketplace_main_30[granted]")
		WebElement bm_granted;
		
		@FindBy(id="listing_marketplace_main_30_warrantyDelay")
		WebElement  bm_warranty;
		
		
		
		
		
		
		//Auchan
		@FindBy(linkText = "Auchan")
		WebElement auchan_mkp;
		
		@FindBy(id="listing_marketplace_locale_38_listingCommonFields_vatRate")
		WebElement auchan_vat_rate;
		
		//BOl
		
		@FindBy(linkText = "Bol")
		WebElement bol_mkp;
		
		@FindBy(id="listing_marketplace_locale_marketplaceProductId_190")
		WebElement bol_mkp_id;
		
		@FindBy(id="listing_marketplace_locale_190_listingMarketplaceLocale_conditionMargin")
		WebElement bol_condition_margin;
		
		//Boulanger
		@FindBy(linkText = "Boulanger")
		WebElement boul_mkp;
		
		@FindBy(name="listing_marketplace_locale_35[listingCommonFields][granted]")
		WebElement boul_granted;
		
		@FindBy(id="listing_marketplace_locale_35_listingMarketplaceLocale_monthWarranty")
		WebElement boul_warranty;
		
		@FindBy(id="listing_marketplace_locale_35_listingCommonFields_logisticClass")
		WebElement boul_logistic_class;
		
		@FindBy(id="listing_marketplace_locale_35_listingMarketplaceLocale_batteryCondition")
		WebElement boul_battery_condition;
		
		//bulevip
		@FindBy(linkText = "Bulevip")
		WebElement bulevip_mkp;
		
		@FindBy(id="listing_marketplace_locale_98_listingCommonFields_wishedPrice")
		WebElement bulevip_price;
		
		//But
		@FindBy(linkText = "But")
		WebElement but_mkp;
		
		@FindBy(id="listing_marketplace_locale_108_listingCommonFields_wishedPrice")
		WebElement but_price;
		
		//click cdiscount
		@FindBy(linkText = "Cdiscount")
		private	WebElement cd;
		
		@FindBy(id = "listing_marketplace_locale_31_listingCommonFields_vatRate")
		private WebElement vatrate;
		
		
		@FindBy(id="listing_marketplace_locale_31_listingMarketplaceLocale_templateId")
		private	WebElement shippingTemplate;
		
		
		//Conforama
		@FindBy(linkText = "Conforama")
		WebElement conforama_mkp;
		
		@FindBy(id="listing_marketplace_locale_59_listingCommonFields_shipmentOrigin")
		WebElement conforama_shipment_country;
		
		//conrad
		@FindBy(linkText = "Conrad")
		WebElement conrad_mkp;
		
		@FindBy(id="listing_marketplace_locale_156_listingMarketplaceLocale_warehouse")
		WebElement warehouse;
		
		
		
		
		
		
		
		//Cultura
		@FindBy(linkText = "Cultura")
		WebElement cultura_mkp;
		
		@FindBy(id="listing_marketplace_locale_187_listingCommonFields_logisticClass")
		WebElement cultura_logistic_class;
		
		//Decathlon
		@FindBy(linkText = "Decathlon")
		WebElement decathlon_mkp;
		
		@FindBy(xpath = "//input[starts-with(@id,'listing_marketplace_locale_189_listingMarketplaceLocale_activeChannels')]")
		List<WebElement> decathlon_active_channels;
		
		@FindBy(id="listing_marketplace_locale_189_listingCommonFields_leadtimeToShip")
		WebElement decathlon_leadtime_to_ship;
		
		
		//Ebay
		@FindBy(linkText = "EBay")
		WebElement ebay_mkp;
		
		
		@FindBy(name = "listing_marketplace_locale_17[listingCommonFields][granted]")
		WebElement ebay_granted;
		
		
		//Fnac FR
		@FindBy(linkText = "Fnac FR")
		WebElement fnac_mkp;
		
		@FindBy(id="listing_marketplace_locale_6_listingCommonFields_logisticClass")
		WebElement fnac_logistic_class;
		
		//GaleriesLafayette
		
		@FindBy(linkText = "GaleriesLafayette")
		WebElement GaleriesLafayette_mkp;
		
		@FindBy(id="listing_marketplace_locale_36_listingCommonFields_logisticClass")
		WebElement GaleriesLafayette_logistic_class;
		
		
		
		
		
		
		//LDLC
		@FindBy(linkText = "LDLC")
		WebElement ldlc_mkp;
		
		@FindBy(id="listing_marketplace_locale_69_listingCommonFields_vatRate")
		WebElement ldlc_vat_rate;
		
		//LaRedoute
		@FindBy(linkText = "LaRedoute")
		WebElement laredoute_mkp;
		
		@FindBy(id="listing_marketplace_locale_60_listingCommonFields_vatRate")
		WebElement laredoute_vat_rate;
		
		//LBC
		
		@FindBy(linkText = "LeBonCoin")
		WebElement lbc_mkp;
		
		@FindBy(id="listing_marketplace_locale_192_listingCommonFields_wishedPrice")
		WebElement lbc_price;
		
		@FindBy(id="listing_marketplace_locale_192_listingCommonFields_customerFixedShippingAmount")
		WebElement lbc_shipping_amount;
		
		@FindBy(id="listing_marketplace_locale_192_listingMarketplaceLocale_productCategoryId")
		WebElement lbc_category_id;
		
		@FindBy(xpath = "//span[@role='combobox']")
		private WebElement shipping_type;
		
		
		@FindBy(xpath = "//li[@class='select2-results__option']")
		private List<WebElement> lbc_shipping_type;
		
		
		
		@FindBy(id="listing_marketplace_locale_192_listingMarketplaceLocale_newType")
		WebElement lbc_attribute_new_condition;
		
		//MANOR
		@FindBy(linkText = "Manor")
		WebElement manor_mkp;
		
		@FindBy(id="listing_marketplace_locale_197_listingCommonFields_wishedPrice")
		WebElement manor_top_price;
		
		//Medi AT
		
		@FindBy(linkText = "Mediamarkt AT")
		WebElement medi_at;
		
		@FindBy(id="listing_marketplace_locale_194_listingMarketplaceLocale_strikePriceType")
		WebElement medi_at_strike_price_type;
		
		
		//Medi_BE
		
		@FindBy(linkText = "Mediamarkt BE")
		WebElement medi_be;
		
		
		@FindBy(id="listing_marketplace_locale_215_listingMarketplaceLocale_strikePriceType")
		WebElement medi_be_strike_price_type;
		
		
		//Medi DE
		
				@FindBy(linkText = "Mediamarkt DE")
				WebElement medi_de;
				
				@FindBy(id="listing_marketplace_locale_191_listingMarketplaceLocale_strikePriceType")
				WebElement medi_de_strike_price_type;
		
				//Medi ES
				
				@FindBy(linkText = "Mediamarkt ES")
				WebElement medi_es;
				
				@FindBy(id="listing_marketplace_locale_195_listingMarketplaceLocale_strikePriceType")
				WebElement medi_es_strike_price_type;
		
				//Medi IT
				
				@FindBy(linkText = "Mediamarkt IT")
				WebElement medi_it;
				
				@FindBy(id="listing_marketplace_locale_210_listingMarketplaceLocale_strikePriceType")
				WebElement medi_it_strike_price_typboul_warrantye;
		
		
				//Medi NL
				
				@FindBy(linkText = "Mediamarkt NL")
				WebElement medi_nl;
				
				@FindBy(id="listing_marketplace_locale_196_listingMarketplaceLocale_strikePriceType")
				WebElement medi_nl_strike_price_type;
		
				//Medi PL
				
				@FindBy(linkText = "Mediamarkt PL")
				WebElement medi_pl;
				
				@FindBy(id="listing_marketplace_locale_223_listingCommonFields_wishedPrice")
				WebElement medi_pl_top_price;
				
				@FindBy(id="listing_marketplace_locale_223_listingMarketplaceLocale_strikePriceType")
				WebElement medi_pl_strike_price_type;
		
		
		//Pixmania
				@FindBy(linkText = "Pixmania")
				WebElement pixmania_mkp;
				
		@FindBy(id="listing_marketplace_locale_120_listingCommonFields_shipmentOrigin")
		WebElement pix_shipment_origin;
		
		@FindBy(id="listing_marketplace_locale_120_listingMarketplaceLocale_monthWarranty")
		WebElement pix_warranty;
		
		//QBP
		@FindBy(linkText = "QuelBonPlan")
		WebElement qbp_mkp;
		
		@FindBy(id="listing_marketplace_locale_marketplaceProductId_122")
		WebElement qbp_model_id;
		
		@FindBy(id="listing_marketplace_locale_122_listingMarketplaceLocale_warrantyDelay")
		WebElement warranty_delay_qbp;
	//---rakuten
		
		@FindBy(linkText = "Rakuten")
		private	WebElement rakuten;
		
		@FindBy(id="listing_common_fields_itemNote_15")
		private    WebElement item_note;		
		
		//Refurbed

		@FindBy(linkText = "Refurbed")
		private	WebElement refurbed;
		
		@FindBy(id="listing_marketplace_main_61_shippingProfileId")
		private	WebElement profile_id;
		
		//showroomprive
		@FindBy(linkText = "ShowroomPrive")
		WebElement show_mkp;
		
		@FindBy(id="listing_marketplace_locale_100_listingMarketplaceLocale_priceFr")
		WebElement show_price_fr;
		
		@FindBy(id="listing_marketplace_locale_100_listingMarketplaceLocale_priceBeFr")
		WebElement show_price_be;
		
		@FindBy(id="listing_marketplace_locale_100_listingMarketplaceLocale_pricePt")
		WebElement show_price_pt;
		
		@FindBy(id="listing_marketplace_locale_100_listingMarketplaceLocale_priceEs")
		WebElement show_price_es;
		
		
		//Temu fr
		
		@FindBy(linkText = "Temu FR")
		WebElement temu_mkp;
		
		@FindBy(id="listing_marketplace_locale_marketplaceProductId_227")
		WebElement temu_good_id;
		
		@FindBy(id="listing_marketplace_locale_227_listingCommonFields_wishedPrice")
		WebElement temu_price;
		
		@FindBy(id="listing_marketplace_locale_227_listingMarketplaceLocale_skuId")
		WebElement temu_skuid;
		
		
		
		
		
		//Ubaldi
		@FindBy(linkText = "Ubaldi")
		WebElement ubaldi_mkp;
		
		@FindBy(id="listing_marketplace_locale_62_listingMarketplaceLocale_ecoContribution")
		WebElement ubaldi_eco_contribution;
		
		@FindBy(id="listing_marketplace_locale_62_listingMarketplaceLocale_sacemFees")
		WebElement ubaldi_sacem_fees;
		
		@FindBy(id="listing_marketplace_locale_62_listingMarketplaceLocale_warrantyDelay")
WebElement ubaldi_warranty;
		
	//Zalando_CH
		
		@FindBy(linkText = "Zalando CH")
		WebElement zalando_ch;
		
		@FindBy(id="listing_marketplace_locale_162_listingCommonFields_wishedPrice")
		WebElement ch_top_price;
		
		
		//Zalando_CZ
		
				@FindBy(linkText = "Zalando CZ")
				WebElement zalando_cz;
				
				@FindBy(id="listing_marketplace_locale_170_listingCommonFields_wishedPrice")
				WebElement cz_top_price;
		
				//Zalando_CH
				
				@FindBy(linkText = "Zalando DK")
				WebElement zalando_dk;
				
				@FindBy(id="listing_marketplace_locale_167_listingCommonFields_wishedPrice")
				WebElement dk_top_price;
		
				//Zalando_CH
				
				@FindBy(linkText = "Zalando GB")
				WebElement zalando_gb;
				
				@FindBy(id="listing_marketplace_locale_160_listingCommonFields_wishedPrice")
				WebElement zalando_gb_top_price;
		
				//Zalando_CH
				
				@FindBy(linkText = "Zalando HR")
				WebElement zalando_hr;
				
				@FindBy(id="listing_marketplace_locale_178_listingCommonFields_wishedPrice")
				WebElement hr_top_price;
		
				//Zalando_CH
				
				@FindBy(linkText = "Zalando HU")
				WebElement zalando_hu;
				
				@FindBy(id="listing_marketplace_locale_179_listingCommonFields_wishedPrice")
				WebElement hu_top_price;
				
				
				//Zalando_NO
				
				@FindBy(linkText = "Zalando NO")
				WebElement zalando_no;
				
				@FindBy(id="listing_marketplace_locale_169_listingCommonFields_wishedPrice")
				WebElement no_top_price;
				
				
				//Zalando_PL
				
				@FindBy(linkText = "Zalando PL")
				WebElement zalando_pl;
				
				@FindBy(id="listing_marketplace_locale_163_listingCommonFields_wishedPrice")
				WebElement zalando_pl_top_price;
				
				
//Zalando_RO
				
				@FindBy(linkText = "Zalando RO")
				WebElement zalando_ro;
				
				@FindBy(id="listing_marketplace_locale_180_listingCommonFields_wishedPrice")
				WebElement ro_top_price;
				
				
//Zalando_SE
				
				@FindBy(linkText = "Zalando SE")
				WebElement zalando_se;
				
				@FindBy(id="listing_marketplace_locale_165_listingCommonFields_wishedPrice")
				WebElement zalando_se_top_price;
				
					
		
		@FindBy(id="obo-form-submit-2")
		private	WebElement validate;
		
		
		
		
		
		//Simple search
		
		@FindBy(name = "q[simple_search][value]")
		WebElement simple_search;
		
		@FindBy(xpath = "//button[@type='submit']/child::i")
		WebElement submit_simple_search;
		
		@FindBy(xpath = "//span[@data-sku='736b755f74657374']")
		WebElement quantity_double_click;
		
		
		//success message
		@FindBy(xpath = "//div[contains(text(),'Item added to your inventory.')]")
		WebElement sku_succes_creation;
		
		
		
		
		
		
	//Action methods for each
		
		public void inventorymenu() {
			inventorymenu.click();
			
			
			
		}
		public void advancefilter_actions() {
			advancefilter.click();
			Select element1=new Select(status);
			List<WebElement> dropdownlist= element1.getOptions();
			for (WebElement Element : dropdownlist) {
				System.out.println(element1);
			}
			
			element1.selectByVisibleText("Actives");	
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);arguments[0].click();",confirm);
			
			confirm.click();
		}
		
		
		
		public void additempage(String ean) {
			additemmenu.click();
			addean.sendKeys(ean);
			saveean.click();
		
		}
		
		
		//item_condition
		public void Listing(String sku_num,int quantity_value, String note,int wp_amount,int blp_amount,int weight)
		{
			Select element2=new Select(itemcondition);
			List<WebElement> dropdownlist1=element2.getOptions();
			for(WebElement item_condition:dropdownlist1) {
				System.out.println(item_condition);
			}
			element2.selectByVisibleText("New");
			sku.clear();
			sku.sendKeys(sku_num);
			quantity.sendKeys(String.valueOf(quantity_value));
			itemNote.sendKeys(note);
			wp.sendKeys(String.valueOf(wp_amount));
			blp.sendKeys(String.valueOf(blp_amount));
		   Logistic_weight.sendKeys(String.valueOf(weight));;
		}	
		
	
		
		
		//---------------------------LCF details
		
		public void LCF_click() {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",LCF);
			//waitutills.waitforclickable(driver, LCF, 20);
			js.executeScript("arguments[0].click();", LCF);
			//LCF.click();		
		
		}
		
		//Allegro_pl
		public void allegro_details(int price) {
			allegro_mkp.click();
			allegro_price.sendKeys(String.valueOf(price));
		}
		
		
		
		//AZ_AU
		public void az_au_details(int top_price) {
			az_au.click();
			au_top_price.sendKeys(String.valueOf(top_price));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
				Select element3=new Select(au_shipment_country);
				//element3.selectByVisibleText("France");
				List<WebElement> dropdownlist2=element3.getOptions();
				
				element3.selectByVisibleText("France");
			
		}
		//AZ_BE
				public void az_be_details() {
					az_be.click();
					
					JavascriptExecutor js=(JavascriptExecutor)driver;
					js.executeScript("window.scrollBy(0,500)");
						Select element3=new Select(be_shipment_country);
						//element3.selectByVisibleText("France");
						List<WebElement> dropdownlist2=element3.getOptions();
						
						element3.selectByVisibleText("France");
					
				}
				//AZ_CA
				public void az_ca_details(int top_price) {
					az_ca.click();
					ca_top_price.sendKeys(String.valueOf(top_price));
					JavascriptExecutor js=(JavascriptExecutor)driver;
					js.executeScript("window.scrollBy(0,500)");
						Select element3=new Select(ca_shipment_country);
						//element3.selectByVisibleText("France");
						List<WebElement> dropdownlist2=element3.getOptions();
						
						element3.selectByVisibleText("France");
					
				}
		
				//AZ_DE
				public void az_de_details() {
					az_de.click();
					
					JavascriptExecutor js=(JavascriptExecutor)driver;
					js.executeScript("window.scrollBy(0,500)");
						Select element3=new Select(de_shipment_country);
						//element3.selectByVisibleText("France");
						List<WebElement> dropdownlist2=element3.getOptions();
						
						element3.selectByVisibleText("France");
					
				}
		
				//AZ_ES
				public void az_es_details() {
					az_es.click();
					
					JavascriptExecutor js=(JavascriptExecutor)driver;
					js.executeScript("window.scrollBy(0,500)");
						Select element3=new Select(es_shipment_country);
						//element3.selectByVisibleText("France");
						List<WebElement> dropdownlist2=element3.getOptions();
						
						element3.selectByVisibleText("France");
					
				}
		
		//AZ_FR
		public void az_fr_details() {
		az_fr.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
			Select element3=new Select(fr_shipment_country);
			//element3.selectByVisibleText("France");
			List<WebElement> dropdownlist2=element3.getOptions();
			
			element3.selectByVisibleText("France");
			
		}
		
		
		//AZ_GB
		
		public void az_gb_details(int price) {
			//waitutills.waitforclickable(driver, cd, 10);
			az_gb.click();
			gb_top_price.sendKeys(String.valueOf(price));
			Select element=new Select(gb_shipment_country);
			element.selectByVisibleText("France");		
		}
		
		//AZ_IE
		public void az_ie_details() {
			az_ie.click();
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
				Select element3=new Select(ie_shipment_country);
				//element3.selectByVisibleText("France");
				List<WebElement> dropdownlist2=element3.getOptions();
				
				element3.selectByVisibleText("France");
			
		}
		
		//AZ_IN
		public void az_in_details(int top_price) {
			az_in.click();
			in_top_price.sendKeys(String.valueOf(top_price));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
				Select element3=new Select(in_shipment_country);
				//element3.selectByVisibleText("France");
				List<WebElement> dropdownlist2=element3.getOptions();
				
				element3.selectByVisibleText("France");
			
		}
		
		//AZ_IT
		public void az_it_details() {
			az_it.click();
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
				Select element3=new Select(it_shipment_country);
				//element3.selectByVisibleText("France");
				List<WebElement> dropdownlist2=element3.getOptions();
				
				element3.selectByVisibleText("France");
			
		}
		//AZ_JP
		public void az_jp_details(int top_price) {
			az_jp.click();
			jp_top_price.sendKeys(String.valueOf(top_price));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
				Select element3=new Select(jp_shipment_country);
				//element3.selectByVisibleText("France");
				List<WebElement> dropdownlist2=element3.getOptions();
				
				element3.selectByVisibleText("France");
			
		}
		
		//AZ_MX
		public void az_mx_details(int top_price) {
			az_mx.click();
			mx_top_price.sendKeys(String.valueOf(top_price));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
				Select element3=new Select(mx_shipment_country);
				//element3.selectByVisibleText("France");
				List<WebElement> dropdownlist2=element3.getOptions();
				
				element3.selectByVisibleText("France");
			
		}
		//AZ_NL
				public void az_nl_details() {
					az_nl.click();
					
					JavascriptExecutor js=(JavascriptExecutor)driver;
					js.executeScript("window.scrollBy(0,500)");
						Select element3=new Select(nl_shipment_country);
						//element3.selectByVisibleText("France");
						List<WebElement> dropdownlist2=element3.getOptions();
						
						element3.selectByVisibleText("France");
					
				}
		
		//az_pl
		public void az_pl_details(int top_price) {
			az_pl.click();
			pl_top_price.sendKeys(String.valueOf(top_price));

			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
				Select element3=new Select(pl_shipment_country);
				//element3.selectByVisibleText("France");
				List<WebElement> dropdownlist2=element3.getOptions();
				
				element3.selectByVisibleText("France");
		}
		
		//AZ_SA
				public void az_sa_details(int top_price) {
					az_sa.click();
					sa_top_price.sendKeys(String.valueOf(top_price));
					JavascriptExecutor js=(JavascriptExecutor)driver;
					js.executeScript("window.scrollBy(0,500)");
						Select element3=new Select(sa_shipment_country);
						//element3.selectByVisibleText("France");
						List<WebElement> dropdownlist2=element3.getOptions();
						
						element3.selectByVisibleText("France");
					
				}
		
		//az_se
		public void az_se_details(int price) {
			//waitutills.waitforclickable(driver, cd, 10);
			az_se.click();
			se_top_price.sendKeys(String.valueOf(price));
			Select element=new Select(se_shipment_country);
			element.selectByVisibleText("France");		
		}
		
		//AZ_Sg
		public void az_sg_details(int top_price) {
			az_sg.click();
			sg_top_price.sendKeys(String.valueOf(top_price));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
				Select element3=new Select(sg_shipment_country);
				//element3.selectByVisibleText("France");
				List<WebElement> dropdownlist2=element3.getOptions();
				
				element3.selectByVisibleText("France");
			
		}
		
		//az_tr
		public void az_tr_details(int price) {
			//waitutills.waitforclickable(driver, cd, 10);
			az_tr.click();
			tr_top_price.sendKeys(String.valueOf(price));
			Select element=new Select(tr_shipment_country);
			element.selectByVisibleText("France");		
		}
		
		//AZ_US
				public void az_us_details(int top_price) {
					az_us.click();
					us_top_price.sendKeys(String.valueOf(top_price));
					JavascriptExecutor js=(JavascriptExecutor)driver;
					js.executeScript("window.scrollBy(0,500)");
						Select element3=new Select(us_shipment_country);
						//element3.selectByVisibleText("France");
						List<WebElement> dropdownlist2=element3.getOptions();
						
						element3.selectByVisibleText("France");
					
				}
		//Animalis
				
			public void animalis_details(int price,int leadtime_to_ship) {
				animalis_mkp.click();
				animalis_top_price.sendKeys(String.valueOf(price));
				animalis_leadtime_to_ship.sendKeys(String.valueOf(leadtime_to_ship));
				
			}	
				
			//Atlas4men		
			public void atlas4men_details(int price,int leadtime_to_ship) {
				atlas4men_mkp.click();
				atlas4men_top_price.sendKeys(String.valueOf(price));
				atlas4men_leadtime_to_ship.sendKeys(String.valueOf(leadtime_to_ship));
				
				
			}	
				
			//BHV
			public void bhv_details(int price,int leadtime_to_ship) {
				bhv_mkp.click();
				bhv_top_price.sendKeys(String.valueOf(price));
				bhv_leadtime_to_ship.sendKeys(String.valueOf(leadtime_to_ship));
				Select element=new Select(bhv_logistic_class);
				element.selectByVisibleText("Category A");			
			}
		
			
			//BM
			public void bm_details(int warranty) {
				bm_mkp.click();
			bm_granted.click();
				bm_warranty.sendKeys(String.valueOf(warranty));
				
				
				
			}
			
			
			
			
				
		//Auchan
				
		public void auchan_details(int vat_rate) {
			auchan_mkp.click();
			auchan_vat_rate.sendKeys(String.valueOf(vat_rate));
		}		
		
		//Bol
		public void bol_details(int mkp_product_id) {
			
			bol_mkp.click();
			bol_mkp_id.sendKeys(String.valueOf(mkp_product_id));
			bol_condition_margin.click();	
		}
		
		//Boulanger
		
		public void boulanger_details(int warranty) {
			boul_mkp.click();
			boul_granted.click();

			boul_warranty.sendKeys(String.valueOf(warranty));
			Select element=new Select(boul_logistic_class);
			element.selectByVisibleText("XXS (free shipping)");
			Select element1=new Select(boul_battery_condition);
			element1.selectByVisibleText("NEW");
			
		}
		
		//bulevip
		public void bulevip_details(int price) {
			bulevip_mkp.click();
			bulevip_price.sendKeys(String.valueOf(price));
			
		}
		
		//but
		public void but_details(int price) {
			but_mkp.click();
			but_price.sendKeys(String.valueOf(price));
		}

		//CD
		
		public void lcf_cd(int vat_rate) {
			cd.click();	
			vatrate.sendKeys(String.valueOf(vat_rate));	
		
			Select element4=new Select(shippingTemplate);
			element4.selectByVisibleText("test");
		}		
		
		//Conforama
		public void conforama_details() {
			//waitutills.waitforclickable(driver, conforama_mkp, 10);
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",conforama_mkp);
			conforama_mkp.click();
			//Select element=new Select(conforama_shipment_country);
			//element.selectByVisibleText("France");			
		}
		
		//conrad
		
		public void conrad_details(int id) {
			
			conrad_mkp.click();
			warehouse.clear();
			waitutills.waitForClickable(driver, warehouse);
			warehouse.sendKeys(String.valueOf(id));
			
		}
		
		
		
		
		
		//Cultura
		public void cultura_details() {
			cultura_mkp.click();
			Select element=new Select(cultura_logistic_class);
			element.selectByVisibleText("Logistic class XS");	
		}
		
		//Decathlon
	public void decathlon_details(int leadtime_to_ship) {
		
		decathlon_mkp.click();
		for(WebElement check_box:decathlon_active_channels) {
			if(!check_box.isSelected()) {
				check_box.click();
			}
			
		}
		decathlon_leadtime_to_ship.sendKeys(String.valueOf(leadtime_to_ship));
		
	}	
	//Ebay
		
		public void ebay_details() {
			ebay_mkp.click();
			ebay_granted.click();
		}
		
		//Fnac FR	
	public void fnac_details() {
		fnac_mkp.click();
		Select element=new Select(fnac_logistic_class);
	element.selectByVisibleText("A");
	}	
		
	//GaleriesLafayette
	
	public void galeriesLafayette_details() {
		GaleriesLafayette_mkp.click();
		Select element=new Select(GaleriesLafayette_logistic_class);
		element.selectByVisibleText("Category A");		
	}
		
		
					
		//LDLC
		
		public void ldlc_details(int vat_rate) {
			ldlc_mkp.click();
			ldlc_vat_rate.sendKeys(String.valueOf(vat_rate));
		}			
			
		//Laredoute
		
		public void laredoute_details(int vat_rate) {
			laredoute_mkp.click();
			laredoute_vat_rate.sendKeys(String.valueOf(vat_rate));
		}			
			
		//LBC
		public void lbc_details(int price,int shipping_amount,int category_id) {
			lbc_mkp.click();
			lbc_price.sendKeys(String.valueOf(price));

			lbc_shipping_amount.sendKeys(String.valueOf(shipping_amount));
			lbc_category_id.sendKeys(String.valueOf(category_id));
		shipping_type.click();
		
		if(lbc_shipping_type.size()>=3) {
			WebElement third_one=lbc_shipping_type.get(3);
			third_one.click();
			
			System.out.println(third_one.getText());
			
			shipping_type.click();

			
		}
			
		
			
			
			
			Select dropdown=new Select(lbc_attribute_new_condition);
			dropdown.selectByVisibleText("Destocking");
	
		}
		
		//MANOR
		
		public void manor_details(int top_price) {
			manor_mkp.click();
			manor_top_price.sendKeys(String.valueOf(top_price));
			
		}
		
	//Medi AT
		
	public void medi_at_details() {
		
		medi_at.click();
		Select dropdown=new Select(medi_at_strike_price_type);
		dropdown.selectByVisibleText("Lowest prior price according to state law");		
	}	
		
	
	
	//Medi_BE
	public void medi_be_details() {
		medi_be.click();
		Select dropdown=new Select(medi_be_strike_price_type);
		dropdown.selectByVisibleText("Lowest prior price according to state law");
		
	}
	
	
	
	
	
	
	
	
	
		//Medi_DE
		
		
public void medi_de_details() {
		
		medi_de.click();
		Select dropdown=new Select(medi_de_strike_price_type);
		dropdown.selectByVisibleText("Lowest prior price according to state law");		
	}	
//MEDI_ES
		
public void medi_es_details() {
	
	medi_es.click();
	Select dropdown=new Select(medi_es_strike_price_type);
	dropdown.selectByVisibleText("Lowest prior price according to state law");		
}	
		
		//MEdi_IT

public void medi_it_details() {
	
	medi_it.click();
	Select dropdown=new Select(medi_it_strike_price_typboul_warrantye);
	dropdown.selectByVisibleText("Lowest prior price according to state law");		
}	
	
//medi_nl
public void medi_nl_details() {
	
	medi_nl.click();
	Select dropdown=new Select(medi_nl_strike_price_type);
	dropdown.selectByVisibleText("Lowest prior price according to state law");		
}	
	//medi_pl	
	
public void medi_pl_details(int top_price) {
	
	medi_pl.click();
	medi_pl_top_price.sendKeys(String.valueOf(top_price));
	Select dropdown=new Select(medi_pl_strike_price_type);
	dropdown.selectByVisibleText("Lowest prior price according to state law");		
}	

//PIXMANIA

        public void pix_details(int warranty) {
        	
        	pixmania_mkp.click();
        	Select dropdown=new Select(pix_shipment_origin);
        	dropdown.selectByVisibleText("France");
        	pix_warranty.sendKeys(String.valueOf(warranty));
        }

//QBP
    
        public void qbp_details(int model_id,int warehouse_id) {
        	qbp_mkp.click();
        	qbp_model_id.sendKeys(String.valueOf(model_id));
        	warranty_delay_qbp.sendKeys(String.valueOf(warehouse_id));    	
        }
        
      //-------------Rakuten
      		public void lcf_rakuten(String note) {
      		rakuten.click();
      		
      		item_note.sendKeys(note);
      		}     
        
    		//refurbed
    		
      		public void lcf_refurbed() {
      			refurbed.click();
      			
      			profile_id.sendKeys("1218");
      			}
      			   
      //showroomprive
      		
      	public void showroomprive_details(int price_fr,int price_be,int price_pt,int price_es) {
      		show_mkp.click();
      		show_price_fr.sendKeys(String.valueOf(price_fr));
      		show_price_be.sendKeys(String.valueOf(price_be));
      		show_price_pt.sendKeys(String.valueOf(price_pt));
      		show_price_es.sendKeys(String.valueOf(price_es));
      		
      	}	
      		
      		
      		//Temu 
      	public void temu_details(String string,int price,int sku_id) {
      		temu_mkp.click();
      		temu_good_id.sendKeys(String.valueOf(string));
      		temu_price.sendKeys(String.valueOf(price));
      		temu_skuid.sendKeys(String.valueOf(sku_id));
      		
      	}
      		
      		
      		
      		
      		
      		
      		
      		
      		
      		
      		
      		
      		
      		
      		
      		
      		
       //Ubaldi
      		
      	public void ubaldi_details(int eco_contribution,int sacem_fees,int warranty) {
      		ubaldi_mkp.click();
      		ubaldi_eco_contribution.sendKeys(String.valueOf(eco_contribution));
      		ubaldi_sacem_fees.sendKeys(String.valueOf(sacem_fees));
      		ubaldi_warranty.sendKeys(String.valueOf(warranty));
      	}	
        
        //zalando CH
      	
      	public void zalando_ch_details(int top_price) {
      		zalando_ch.click();
      		ch_top_price.sendKeys(String.valueOf(top_price));    		
      	}
      //Zalando_CZ
        
      	public void zalando_cz_details(int top_price) {
      		zalando_cz.click();
      		cz_top_price.sendKeys(String.valueOf(top_price));    		
      	}
        
        //zalando_dk
      	
      	public void zalando_dk_details(int top_price) {
      		zalando_dk.click();
      		dk_top_price.sendKeys(String.valueOf(top_price));    		
      	}
        
       //zalando_GB 
      	public void zalando_gb_details(int top_price) {
      		zalando_gb.click();
      		zalando_gb_top_price.sendKeys(String.valueOf(top_price));    		
      	}

//zalando_HR
      	public void zalando_hr_details(int top_price) {
      		zalando_hr.click();
            hr_top_price.sendKeys(String.valueOf(top_price));    		
      	}

      	//zalando_HU
      	
      	public void zalando_hu_details(int top_price) {
      		zalando_hu.click();
      		hu_top_price.sendKeys(String.valueOf(top_price));    		
      	}
		
      	//zalando_NO
      	
      	public void zalando_no_details(int top_price) {
      		zalando_no.click();
      		no_top_price.sendKeys(String.valueOf(top_price));    		
      	}	
      	
      	//zalando_pl
      	public void zalando_pl_details(int top_price) {
      		zalando_pl.click();
      		zalando_pl_top_price.sendKeys(String.valueOf(top_price));    		
      	}
		
      //zalando_RO
      	public void zalando_ro_details(int top_price) {
      		zalando_ro.click();
      		ro_top_price.sendKeys(String.valueOf(top_price));    		
      	}
      	
      //zalando_SE
      	public void zalando_se_details(int top_price) {
      		zalando_se.click();
      		zalando_se_top_price.sendKeys(String.valueOf(top_price));    		
      	}
		

		
		public void lcf_submit() {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window,scrollBy(0,1000)");
			
		validate.click();
		}
		
	
		//double click to quantity update
		
		public void double_click_quantity_update(String sku,int quantity) {
			
			simple_search.sendKeys(sku);
			submit_simple_search.click();
			
			Actions ac=new Actions(driver);
			ac.moveToElement(quantity_double_click).perform();
			ac.doubleClick(quantity_double_click).perform();
			quantity_double_click.clear();
			quantity_double_click.sendKeys(String.valueOf(quantity));
			
			
			
			
		}
		
		public void success() {
			
			sku_succes_creation.click();
			System.out.println(sku_succes_creation.getText());
		}
		
		
		
		
		
	}
	
	
	