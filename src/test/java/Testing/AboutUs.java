package Testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AboutUs extends LoadPage {

    @FindBy(id = "buttonAppbarToHome")
    private WebElement buttonAppbarToHome;

    public boolean verifybuttonAppbarToHome() {
        return Events.isVisibleWebElement(buttonAppbarToHome);
    }
    public Home clickbuttonAppbarToHome(){
        Events.click(buttonAppbarToHome);
        return new Home();
    }

    @FindBy(id = "parallaxAboutUs")
    private WebElement parallaxAboutUs;

    public boolean verifyparallaxAboutUs() { return Events.isVisibleWebElement(parallaxAboutUs);}

    @FindBy(id = "labelAboutUsTitle")
    private WebElement labelAboutUsTitle;

    public boolean verifylabelAboutUsTitle() { return Events.isVisibleWebElement(labelAboutUsTitle);}

    @FindBy(id = "labelAboutUsDescription")
    private WebElement labelAboutUsDescription;

    public boolean verifylabelAboutUsDescription() { return Events.isVisibleWebElement(labelAboutUsDescription);}

    @FindBy(id = "buttonAboutusContact")
    private WebElement buttonAboutusContact;

    public boolean verifybuttonAboutusContact() { return Events.isVisibleWebElement(buttonAboutusContact);}
    public ContactUs clickbuttonAboutusContact(){
        Events.click(buttonAboutusContact);
        return new ContactUs();
    }


    @FindBy(id = "labelMembersTitle")
    private WebElement labelMembersTitle;

    public boolean verifylabelMembersTitle() { return Events.isVisibleWebElement(labelMembersTitle);}
    public String verifyAlignmentlabelMembersTitle() {
        return Events.getAttribute(labelMembersTitle, "align");
    }

    @FindBy(id = "labelMembersDescription")
    private WebElement labelMembersDescription;

    public boolean verifylabelMembersDescription() { return Events.isVisibleWebElement(labelMembersDescription);}
    public String verifyAlignmentlabelMembersDescription() { return Events.getAttribute(labelMembersDescription, "align");
    }

    @FindAll({
            @FindBy(css = "[id$=cardMember")
    })
    private List<WebElement> cardMembers ;
    private boolean allpresentcardMember =true;

    public boolean verifycardMember() {
        for (WebElement element : cardMembers) {
            if( !Events.isVisibleWebElement(element)) {
                allpresentcardMember=false;
            }
        }
        return allpresentcardMember;

    }

    @FindAll({
            @FindBy(css = "[id$=imageCardMember")
    })
    private List<WebElement> imageCardMembers ;
    private boolean allpresentimageCardMember =true;

    public boolean verifyimageCardMember() {
        for (WebElement element : imageCardMembers) {
            if( !Events.isVisibleWebElement(element)) {
                allpresentimageCardMember=false;
            }
        }
        return allpresentimageCardMember;

    }

    @FindAll({
            @FindBy(css = "[id$=nameMember")
    })
    private List<WebElement> nameMembers ;
    private boolean allpresentnameMember =true;

    public boolean verifynameMember() {
        for (WebElement element : nameMembers) {
            if( !Events.isVisibleWebElement(element)) {
                allpresentnameMember=false;
            }
        }
        return allpresentnameMember;

    }

    @FindAll({
            @FindBy(css = "[id$=buttonMemberLinkedin")
    })
    private List<WebElement> buttonMemberLinkedins ;
    private boolean allpresentbuttonMemberLinkedin =true;

    public boolean verifybuttonMemberLinkedin() {
        for (WebElement element : buttonMemberLinkedins) {
            if( !Events.isVisibleWebElement(element)) {
                allpresentbuttonMemberLinkedin=false;
            }
        }
        return allpresentbuttonMemberLinkedin;

    }

    @FindAll({
            @FindBy(css = "[id$=buttonMemberTwitter")
    })
    private List<WebElement> buttonMemberTwitters ;
    private boolean allpresentbuttonMemberTwitter =true;

    public boolean verifybuttonMemberTwitter() {
        for (WebElement element : buttonMemberTwitters) {
            if( !Events.isVisibleWebElement(element)) {
                allpresentbuttonMemberTwitter=false;
            }
        }
        return allpresentbuttonMemberTwitter;

    }

    @FindAll({
            @FindBy(css = "[id$=buttonMemberFacebook")
    })
    private List<WebElement> buttonMemberFacebooks ;
    private boolean allpresentbuttonMemberFacebook =true;

    public boolean verifybuttonMemberFacebook() {
        for (WebElement element : buttonMemberFacebooks) {
            if( !Events.isVisibleWebElement(element)) {
                allpresentbuttonMemberFacebook=false;
            }
        }
        return allpresentbuttonMemberFacebook;

    }

    @FindBy(id = "labelCommunitiesTitle")
    private WebElement labelCommunitiesTitle;

    public boolean verifylabelCommunitiesTitle() { return Events.isVisibleWebElement(labelCommunitiesTitle);}
    public String verifyAlignmentlabelCommunitiesTitle() {
        return Events.getAttribute(labelCommunitiesTitle, "align");
    }

    @FindAll({
            @FindBy(css = "[id$=imageCommunity")
    })
    private List<WebElement> imageCommunities;
    private boolean allpresentimageCommunity=true;

    public boolean verifyimageCommunity() {
        for (WebElement element : imageCommunities) {
            if( !Events.isVisibleWebElement(element)) {
                allpresentimageCommunity=false;
            }
        }
        return allpresentimageCommunity;

    }

    @FindBy(id = "imageCommunity0")
    private WebElement imageCommunity0;

    public boolean clickimageCommunity0(){
        Events.click(imageCommunity0);
        //LoadHome.waitTime();
        return Events.compareURLs("https://www.meetup.com/es/GDGCochabamba/");
    }

    @FindBy(id = "imageCommunity1")
    private WebElement imageCommunity1;

    public boolean clickimageCommunity1(){
        Events.click(imageCommunity1);
        //LoadHome.waitTime();
        return Events.compareURLs("https://www.technovationbolivia.org/");
    }

    @FindBy(id = "imageCommunity2")
    private WebElement imageCommunity2;

    public boolean clickimageCommunity2(){
        Events.click(imageCommunity2);
        //LoadHome.waitTime();
        return Events.compareURLs("https://gp4tech.com/");
    }

    @FindBy(id = "imageCommunity3")
    private WebElement imageCommunity3;

    public boolean clickimageCommunity3(){
        Events.click(imageCommunity3);
        //LoadHome.waitTime();
        return Events.compareURLs("https://www.facebook.com/pg/girlshackumss/posts/?ref=page_internal");
    }

    @FindBy(id = "imageCommunity4")
    private WebElement imageCommunity4;

    public boolean clickimageCommunity4(){
        Events.click(imageCommunity4);
        //LoadHome.waitTime();
        return Events.compareURLs("https://www.facebook.com/PyLadies-Cochabamba-705633759851848/");
    }

    @FindBy(id = "imageCommunity5")
    private WebElement imageCommunity5;

    public boolean clickimageCommunity5(){
        Events.click(imageCommunity5);
        //LoadHome.waitTime();
        return Events.compareURLs("https://www.facebook.com/WomenTechmakersCochabamba/");
    }




}
