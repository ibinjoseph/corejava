
public class FacebookReader implements SocialFeedReader {

	@Override
	public Message pollForNewMassage() {
		// TODO Auto-generated method stub
		Message m=new Message();
		m.setMessageId(2);
		m.setMessageSource("Facebook");
		m.setMessagetype("String");
		m.setStringType("Facebooking");
		m.setSenderInfo("SenderInfo");
		return m;
	}

}
